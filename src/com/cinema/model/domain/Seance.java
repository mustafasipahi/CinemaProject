package com.cinema.model.domain;

import java.time.LocalTime;

import com.cinema.model.domain.core.AbstractEntity;

public class Seance extends AbstractEntity{

	private String descirption;
	private LocalTime beginTime;
	private LocalTime endTime;
	
	public void setDescirption(String descirption) {
		this.descirption = descirption;
	}
	public void setBeginTime(LocalTime beginTime) {
		this.beginTime = beginTime;
	}
	public void setEndTime(LocalTime endTime) {
		this.endTime = endTime;
	}
	public String getDescirption() {
		return descirption;
	}
	public LocalTime getBeginTime() {
		return beginTime;
	}
	public LocalTime getEndTime() {
		return endTime;
	}

	@Override
	public int getId() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
