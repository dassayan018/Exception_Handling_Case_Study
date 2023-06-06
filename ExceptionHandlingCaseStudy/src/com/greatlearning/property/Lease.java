package com.greatlearning.property;

import java.time.LocalDate;

import com.greatlearning.property.tenant.IllegalTenantException;
import com.greatlearning.property.tenant.Resident;

public class Lease {

	private Resident resident;
	private int id;
	private LocalDate moveInDate;
	private LocalDate moveOutDate;
	private Property property;

	public Lease(Resident resident, int id, LocalDate moveInDate, LocalDate moveOutDate, Property property)
//			throws
//			IllegalTenantException,
//			EmptyMoveInDateException, 
//			EmptyMoveOutDateException,
//			InvalidDurationException 
		{

		if (resident.isTenant()) {
			throw new IllegalTenantException("Already a tenant");
		}
		this.resident = resident;
		this.id = id;

		if (moveInDate == null) {
			throw new EmptyMoveInDateException("Move in date cannot be null");
		}

		if (moveOutDate == null) {
			throw new EmptyMoveOutDateException("Move out date cannot be null ");
		}

		if (moveInDate.compareTo(moveOutDate) > 0) {
			throw new InvalidDurationException("Move in date cannot be greater than Move out date");
		}

		this.moveInDate = moveInDate;
		this.moveOutDate = moveOutDate;
		this.property = property;
	}
	
	
}
