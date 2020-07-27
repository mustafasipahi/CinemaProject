package com.cinema.controller;

import com.cinema.view.login.LoginFrame;

public class LoginFrameController {

	private static LoginFrame loginFrame;
	
	public LoginFrameController() {
		loginFrame = new LoginFrame();		
	}
	
	public static LoginFrame getLoginFrame() {
		return loginFrame;
	}
}
