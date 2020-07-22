package com.cinema.model;

import com.cinema.model.core.AbstracEntity;

public class Ticket extends AbstracEntity{

	private Seance seance;
	private Theatre theatre;
	private Integer seatNumber;
	private String ticketDate;
	
	public Seance getSeance() {
		return seance;
	}
	public Theatre getTheatre() {
		return theatre;
	}
	public Integer getSeatNumber() {
		return seatNumber;
	}
	public String getTicketDate() {
		return ticketDate;
	}
	public void setSeance(Seance seance) {
		this.seance = seance;
	}
	public void setTheatre(Theatre theatre) {
		this.theatre = theatre;
	}
	public void setSeatNumber(Integer seatNumber) {
		this.seatNumber = seatNumber;
	}
	public void setTicketDate(String ticketDate) {
		this.ticketDate = ticketDate;
	}
}
