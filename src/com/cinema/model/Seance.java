package com.cinema.model;

import com.cinema.model.core.AbstracEntity;

public class Seance extends AbstracEntity{

	private String description;
	private String startTime;
	private String endTime;
	
	public String getDescription() {
		return description;
	}
	public String getStartTime() {
		return startTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
}
