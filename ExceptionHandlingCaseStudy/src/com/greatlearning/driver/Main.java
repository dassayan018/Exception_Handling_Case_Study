package com.greatlearning.driver;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import com.greatlearning.property.Address;
import com.greatlearning.property.Apartment;
import com.greatlearning.property.EmptyMoveInDateException;
import com.greatlearning.property.EmptyMoveOutDateException;
import com.greatlearning.property.InvalidDurationException;
import com.greatlearning.property.Lease;
import com.greatlearning.property.Property;
import com.greatlearning.property.RowHouse;
import com.greatlearning.property.tenant.IllegalTenantException;
import com.greatlearning.property.tenant.Resident;

public class Main {

	public static void main(String[] args) {
		
		try {
			Resident john = new Resident(00001,"John","Doe");
			
			//Resident jane = new Resident(00002, "Jane" , "Doe");
			
			/*we can add multiple residents in a set as follows. 
			 * 
			 * Set<Resident> residents = new HashSet<>(); 
			 * residents.add(john);
			 * residents.add(jane);
			 */
			
			
			//will give error already a tenant 
			//john.setTenant(true);
			
			Address apartmentAddress = new Address("Ap01", "NYC");
			Property apartment = new Apartment(apartmentAddress, 3000, 2500);
			
			Address rowHouseAddress = new Address("Rh01", "CA");
		    Property rowHouse = new RowHouse(rowHouseAddress, 2, 1000,500);
			
		    //LocalDate moveinDate = null; //will throw empty move in date exception
			LocalDate moveinDate = LocalDate.of(2021, 1, 31);
			LocalDate moveoutDate = LocalDate.of(2021, 12, 1);
			
			Lease lease = new Lease(john,1, moveinDate, moveoutDate, apartment);
			
			System.out.println("everything is running properly");
			
		}catch(IllegalTenantException illegalTenantException) {
			System.out.println("Already a tenant, cannot assign the same tenant");
			illegalTenantException.printStackTrace();
		
		}catch(EmptyMoveInDateException emptyMoveInDateException) {
			System.out.println("Please enter a valid move in date");
			emptyMoveInDateException.printStackTrace();
			
		}catch(EmptyMoveOutDateException emptyMoveOutDateException) {
			System.out.println("Please enter a valid move out date");
			emptyMoveOutDateException.printStackTrace();
		
		}catch(InvalidDurationException invalidDurationException) {
			System.out.println("Move in date cannot be after the Move out date");
			invalidDurationException.printStackTrace();
		}
		
	}

}
