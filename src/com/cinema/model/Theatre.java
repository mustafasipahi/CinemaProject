package com.cinema.model;

import com.cinema.model.core.AbstracEntity;

public class Theatre extends AbstracEntity{

	private String theatreName;
	private Integer capacity;
	private Movie movie;
	
	public String getTheatreName() {
		return theatreName;
	}
	public Integer getCapacity() {
		return capacity;
	}
	public Movie getMovie() {
		return movie;
	}
	public void setTheatreName(String theatreName) {
		this.theatreName = theatreName;
	}
	public void setCapacity(Integer capacity) {
		this.capacity = capacity;
	}
	public void setMovie(Movie movie) {
		this.movie = movie;
	}
}
