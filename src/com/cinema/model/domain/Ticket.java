package com.cinema.model.domain;

import java.time.LocalDate;

import com.cinema.model.domain.core.AbstractEntity;

public class Ticket extends AbstractEntity{

	private Seance seance;
	private Theatre theatre;
	private int seatNumber;
	private LocalDate ticketDate;
	
	public void setSeance(Seance seance) {
		this.seance = seance;
	}
	public void setSeatNumber(int seatNumber) {
		this.seatNumber = seatNumber;
	}
	public void setTheatre(Theatre theatre) {
		this.theatre = theatre;
	}
	public void setTicketDate(LocalDate ticketDate) {
		this.ticketDate = ticketDate;
	}
	public Seance getSeance() {
		return seance;
	}
	public int getSeatNumber() {
		return seatNumber;
	}
	public Theatre getTheatre() {
		return theatre;
	}
	public LocalDate getTicketDate() {
		return ticketDate;
	}
	
	@Override
	public int getId() {
		// TODO Auto-generated method stub
		return 0;
	}

}
