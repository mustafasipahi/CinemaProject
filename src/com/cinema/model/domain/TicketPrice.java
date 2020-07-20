package com.cinema.model.domain;

import com.cinema.model.domain.core.AbstractEntity;

public class TicketPrice extends AbstractEntity{

	private String description;
	private float price;
	
	public void setDescription(String description) {
		this.description = description;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public float getPrice() {
		return price;
	}
	
	@Override
	public int getId() {
		// TODO Auto-generated method stub
		return 0;
	}

}
