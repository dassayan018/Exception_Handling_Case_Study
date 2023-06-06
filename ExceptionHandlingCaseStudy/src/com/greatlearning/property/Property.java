package com.greatlearning.property;

public abstract class Property {

	private Address address;

	public Property(Address address) {
		this.address = address;
	}
	

	abstract double calculatePropertyTax(float pricePerSqFeet);
	
	public Address getAddress() {
		return address;
	}
	
}
