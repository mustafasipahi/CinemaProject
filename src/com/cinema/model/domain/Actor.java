package com.cinema.model.domain;

import com.cinema.model.domain.core.AbstractEntity;

public class Actor extends AbstractEntity{

	private String firstName;
	private String lastName;
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	
	@Override
	public int getId() {
		// TODO Auto-generated method stub
		return 0;
	}

}
