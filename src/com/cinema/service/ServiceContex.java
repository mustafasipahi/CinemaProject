package com.cinema.service;

public class ServiceContex {

	private static ActorService actorService;
	private static DirectorService directorService;
	private static MovieService movieService;
	
	public static ActorService getActorService() {
		synchronized (ServiceContex.class) {
			if (actorService == null) {			
				actorService = new ActorService();				
			}
		}
		return actorService;
	}
	
	public static DirectorService getDirectorService() {
		synchronized (ServiceContex.class) {
			if (directorService == null) {			
				directorService = new DirectorService();				
			}
		}
		return directorService;
	}
	
	public static MovieService getMovieService() {
		synchronized (ServiceContex.class) {
			if (movieService == null) {			
				movieService = new MovieService();				
			}
		}
		return movieService;
	}
}
