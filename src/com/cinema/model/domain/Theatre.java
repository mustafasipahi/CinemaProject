package com.cinema.model.domain;

import com.cinema.model.domain.core.AbstractEntity;

public class Theatre extends AbstractEntity{

	private String theatreName;
	private int capacity;
	private Movie movie;
	
	public void setTheatreName(String theatreName) {
		this.theatreName = theatreName;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public void setMovie(Movie movie) {
		this.movie = movie;
	}
	public String getTheatreName() {
		return theatreName;
	}
	public int getCapacity() {
		return capacity;
	}
	public Movie getMovie() {
		return movie;
	}
	
	@Override
	public int getId() {
		// TODO Auto-generated method stub
		return 0;
	}

}
