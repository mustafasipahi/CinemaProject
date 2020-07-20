package com.cinema.model.domain;

import com.cinema.model.domain.core.AbstractEntity;

public class Movie extends AbstractEntity{

	private String movieName;
	private String type;
	
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getMovieName() {
		return movieName;
	}
	public String getType() {
		return type;
	}
	
	@Override
	public int getId() {
		// TODO Auto-generated method stub
		return 0;
	}

}
