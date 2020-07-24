package com.cinema.service;

import com.cinema.service.login.AdminService;
import com.cinema.service.login.UserService;

public class ServiceContex {

	private static ActorService actorService;
	private static DirectorService directorService;
	private static MovieService movieService;
	private static TheatreService theatreService;
	private static SeanceService seanceService;
	private static AdminService adminService;
	private static UserService userService;
	
	public static ActorService getActorService() {
		if(actorService == null) {
			actorService = new ActorService();
		}
		return actorService;
	}
	
	public static DirectorService getDirectorService() {
		if(directorService == null) {
			directorService = new DirectorService();
		}
		return directorService;
	}
	
	public static MovieService getMovieService() {
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
	
	public static SeanceService getSeanceService() {
		if (seanceService == null) {
		    seanceService = new SeanceService();
		}
		return seanceService;
	}
	
	public static AdminService getAdminService() {
		if (adminService == null) {
			adminService = new AdminService();
		}
		return adminService;
	}
	
	public static UserService getUserService() {
		if (userService == null) {
			userService = new UserService();
		}
		return userService;
	}
}
