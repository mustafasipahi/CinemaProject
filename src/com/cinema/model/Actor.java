package com.cinema.model;

import com.cinema.model.core.AbstracEntity;

public class Actor extends AbstracEntity{

	private String firstName;
	private String lastName;
	
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	@Override
	public String toString() {
		return "Actor ["+ "id="+ getId() +", firstName=" + firstName + ", lastName=" + lastName + "]";
	}	
}
