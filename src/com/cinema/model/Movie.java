package com.cinema.model;

import java.util.List;

import com.cinema.model.core.AbstracEntity;

public class Movie extends AbstracEntity{

	private String movieName;
	private String movieType;
    private Theatre theatre;
	private List<Actor> actors;
	
	public String getMovieName() {
		return movieName;
	}
	public String getMovieType() {
		return movieType;
	}
	public List<Actor> getActors() {
		return actors;
	}
	public Theatre getTheatre() {
		return theatre;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public void setMovieType(String movieType) {
		this.movieType = movieType;
	}
	public void setActors(List<Actor> actors) {
		this.actors = actors;
	}
	public void setTheatre(Theatre theatre) {
		this.theatre = theatre;
	}
	@Override
	public String toString() {
		return movieName;
	}
	
}
