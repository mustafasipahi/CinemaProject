package com.cinema.controller.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.cinema.controller.BuyTicketFrameController;

public class ByTicketButtonListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		
		new BuyTicketFrameController();
	}

}
