package com.cinema.controller;

import java.util.List;

import com.cinema.model.Seance;
import com.cinema.service.ServiceContex;
import com.cinema.view.BuyTicketFrame;

public class BuyTicketFrameController {

	private static BuyTicketFrame buyTicketFrame;
	
	public BuyTicketFrameController() {
		buyTicketFrame = new BuyTicketFrame();		
	}
	
	public static List<Seance> getSeances(){
		return new ServiceContex().getSeanceService().getAll();
	}
	
	public static int getCapacity() {
		return new ServiceContex().getTheatreService().findById(1).getCapacity();
	}
}
