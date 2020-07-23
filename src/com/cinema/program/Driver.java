package com.cinema.program;

import javax.swing.SwingUtilities;

import com.cinema.controller.MainFrameController;

public class Driver {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				new MainFrameController();
			}
		});
	}	
}
