package com.cinema.model.login;

import com.cinema.model.core.AbstracEntity;

public class Admin extends AbstracEntity{

	private String description;
	private String adminName;
	private String adminpassword;
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getAdminName() {
		return adminName;
	}
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	public String getAdminpassword() {
		return adminpassword;
	}
	public void setAdminpassword(String adminpassword) {
		this.adminpassword = adminpassword;
	}
	
	
}
