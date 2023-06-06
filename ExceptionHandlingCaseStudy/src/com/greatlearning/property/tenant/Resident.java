package com.greatlearning.property.tenant;

public class Resident {

	private int socialId;
	private String firstName;
	private String lastName;
	private boolean tenant;
	
	public Resident() {}
	
	
	public Resident(int socialId, String firstName, String lastName) {
		this.socialId = socialId;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public int getSocialId() {
		return socialId;
	}
	public void setSocialId(int socialId) {
		this.socialId = socialId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public boolean isTenant() {
		return tenant;
	}
	public void setTenant(boolean tenant) {
		this.tenant = tenant;
	}
	
	
}
