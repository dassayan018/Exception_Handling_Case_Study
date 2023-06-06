package com.greatlearning.property;

import com.greatlearning.property.rent.RentCalculator;

public class RowHouse extends Property implements RentCalculator {

	protected int storeys;
	protected int backyardSize;
	protected int frontYardSize;
	
	
	public RowHouse(Address address, int storeys, int backyardSize, int frontYardSize) {
		super(address);
		this.storeys = storeys;
		this.backyardSize = backyardSize;
		this.frontYardSize = frontYardSize;
	}


	@Override
	public int calculateRent(int pricePerSqFeet) {
		return (frontYardSize + backyardSize) * storeys;
	}


	@Override
	double calculatePropertyTax(float pricePerSqFeet) {
		return (frontYardSize + backyardSize) * storeys * 0.15;
	}

}
