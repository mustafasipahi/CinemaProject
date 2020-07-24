package com.cinema.controller;

import java.util.List;

import com.cinema.controller.listener.ByTicketButtonListener;
import com.cinema.controller.listener.DetailButtonListener;
import com.cinema.model.Movie;
import com.cinema.service.ServiceContex;
import com.cinema.view.MainFrame;

public class MainFrameController {
	
	private static MainFrame mainFrame;
	
	public MainFrameController() {
		mainFrame = new MainFrame();		
		mainFrame.addMovieDetailButtonListener(new DetailButtonListener());
		mainFrame.addTicketButtonListener(new ByTicketButtonListener());
	}
	
	public static List<Movie> movieList(){
		List<Movie> movies = new ServiceContex().getMovieService().getAll();
		return movies;
	}

	public static MainFrame getMainFrame() {
		return mainFrame;
	}
}
