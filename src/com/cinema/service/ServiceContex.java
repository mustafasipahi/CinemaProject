package com.cinema.service;

public class ServiceContex {

	private static ActorService actorService;
	private static DirectorService directorService;
	private static MovieService movieService;
	private static TheatreService theatreService;
	private static SeanceService seanceService;
	
	public ActorService getActorService() {
		if(actorService == null) {
			actorService = new ActorService();
		}
		return actorService;
	}
	
	public DirectorService getDirectorService() {
		if(directorService == null) {
			directorService = new DirectorService();
		}
		return directorService;
	}
	
	public MovieService getMovieService() {
		if (movieService == null) {
			movieService = new MovieService();
		}
		return movieService;
	}
	
	public TheatreService getTheatreService() {
		if (theatreService == null) {
			theatreService = new TheatreService();
		}
		return theatreService;
	}
	public static SeanceService getSeanceService() {
		if (seanceService == null) {
		    seanceService = new SeanceService();
		}
		return seanceService;
	}
}
