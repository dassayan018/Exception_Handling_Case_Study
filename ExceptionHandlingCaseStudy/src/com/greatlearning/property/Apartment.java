package com.greatlearning.property;

import com.greatlearning.property.rent.RentCalculator;

public class Apartment extends Property implements RentCalculator {

	protected int superArea;
	protected int coveredArea;
	
	public Apartment(Address address, int superArea, int coveredArea) {
		super(address);
		this.superArea = superArea;
		this.coveredArea = coveredArea;
	}

	@Override
	public int calculateRent(int pricePerSqFeet) {
		return (superArea * pricePerSqFeet) + 500;
	}

	@Override
	double calculatePropertyTax(float pricePerSqFeet) {
		return ((superArea * pricePerSqFeet) + 500) * 0.15;
	}

	

}
