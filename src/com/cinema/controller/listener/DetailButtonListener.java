package com.cinema.controller.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.cinema.controller.MainFrameController;

public class DetailButtonListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		
		String name = MainFrameController
						.getMainFrame()
						.getMovieJList()
						.getSelectedValue()
						.getMovieName();
		
		String type = MainFrameController
						.getMainFrame()
						.getMovieJList()
						.getSelectedValue()
						.getMovieType();
		
		MainFrameController.getMainFrame().setMovieNameTextField("    "+name);
		MainFrameController.getMainFrame().setMovieTypeTextField("    "+type);
				
	}
}
