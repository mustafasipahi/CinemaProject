package com.cinema.service;

public class ServiceContex {

	private static ActorService actorService;
	private static DirectorService directorService;
	private static MovieService movieService;
	private static TheatreService theatreService;
	
	public static ActorService getActorService() {
		if(actorService == null) {
			actorService = new ActorService();
		}
		return actorService;
	}
	
	public static DirectorService geDirectorService() {
		if(directorService == null) {
			directorService = new DirectorService();
		}
		return directorService;
	}
	
	public static MovieService geMovieService() {
		if (movieService == null) {
			movieService = new MovieService();
		}
		return movieService;
	}
	
	public static TheatreService getTheatreService() {
		if (theatreService == null) {
			theatreService = new TheatreService();
		}
		return theatreService;
	}
}
