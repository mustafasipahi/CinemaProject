package com.cinema.controller;

import com.cinema.view.login.RegisterFrame;

public class RegisterFrameController {

	private static RegisterFrame registerFrame;
	
	public RegisterFrameController() {
		registerFrame = new RegisterFrame();
	}
	
	public static RegisterFrame getRegisterFrame() {		
		return registerFrame;
	}
}
