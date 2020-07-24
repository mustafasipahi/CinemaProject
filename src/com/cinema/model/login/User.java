package com.cinema.model.login;

import com.cinema.model.core.AbstracEntity;

public class User extends AbstracEntity{

	private String description;
	private String userName;
	private String UserPassword;
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPassword() {
		return UserPassword;
	}
	public void setUserPassword(String userPassword) {
		UserPassword = userPassword;
	}
	
	
}
