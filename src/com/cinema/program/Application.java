package com.cinema.program;

import com.cinema.controller.BuyTicketFrameController;
import com.cinema.controller.LoginFrameController;
import com.cinema.controller.MainFrameController;

public class Application {

	private BuyTicketFrameController buyTicketFrameController;
	private LoginFrameController loginFrameController;
	private MainFrameController mainFrameController;
	
	public Application() {
		//buyTicketFrameController = new BuyTicketFrameController();
		loginFrameController = new LoginFrameController();
		
	}
}
