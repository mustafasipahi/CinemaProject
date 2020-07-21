package com.cinema.framework;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import com.cinema.view.MainFrame;

public class Application implements Runnable,ActionListener{

	private boolean isRunning;
	private MainFrame mainFrame;
	
	public void startApplication() {
		SwingUtilities.invokeLater(this);
	}
	
	@Override
	public void run() {
		mainFrame = new MainFrame();
		initMainFrame(mainFrame);
		mainFrame.setMovies(new ArrayList<>());
		mainFrame.addGetticketButtonListener(this);
	}
	
	public void setRunning(boolean isRunning) {
		this.isRunning = isRunning;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Button Clicked");
	}
	
	public void initMainFrame(JFrame frame) {
		frame.setSize(800,600);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
