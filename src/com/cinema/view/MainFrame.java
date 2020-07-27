package com.cinema.view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.cinema.controller.MainFrameController;
import com.cinema.model.Movie;
import com.cinema.model.core.AbstracEntity;

public class MainFrame extends JFrame {

	private static final long serialVersionUID = 1239239210664376221L;
	private AbstracEntity entity;
	private JPanel mainPanel;
	private JPanel moviesPanel;
	private JPanel detailsPanel;

	private JList<Movie> movieJList;
	private JLabel movieNameLabel;
	private JLabel movieTypeLabel;
	private JTextField movieNameTextField;
	private JTextField movieTypeTextField;
	private JButton byTicketButton;
	private JButton viewMovieDetailsButton;

	public MainFrame(AbstracEntity entity) {
		this.entity = entity;
		setLayout(new BorderLayout());
		mainPanel = new JPanel(new BorderLayout());
		mainPanel.add(initTablePanel(), BorderLayout.WEST);
		mainPanel.add(initDetailPanel(), BorderLayout.CENTER);
		add(mainPanel, BorderLayout.CENTER);
		createMainFrame();
	}

	private void createMainFrame() {
		this.setTitle("WELCOME TO CINEMA PROJECT");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600, 600);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}

	private JPanel initTablePanel() {
		moviesPanel = new JPanel(new BorderLayout());
		moviesPanel.setBorder(BorderFactory.createTitledBorder("                              MOVIES"));
		moviesPanel.setPreferredSize(new Dimension(250, 400));
		movieJList = new JList(MainFrameController.movieList().toArray());
		viewMovieDetailsButton = new JButton("VIEW MOVIE DETAILS");
		moviesPanel.add(movieJList, BorderLayout.CENTER);	
		moviesPanel.add(viewMovieDetailsButton,BorderLayout.SOUTH);
		return moviesPanel;
	}

	private JPanel initDetailPanel() {
		detailsPanel = new JPanel(new BorderLayout());
		detailsPanel.setBorder(BorderFactory.createTitledBorder("                             MOVIE DETAIL"));

		JPanel infopanel = new JPanel(new GridLayout(2, 2, 5, 5));
		movieNameLabel = new JLabel("                      MOVIE NAME : ");
		movieNameTextField = new JTextField("");
		movieNameTextField.setEnabled(false);
		movieTypeLabel = new JLabel("                      MOVIE TYPE : ");
		movieTypeTextField = new JTextField("");
		movieTypeTextField.setEnabled(false);
		infopanel.add(movieNameLabel);
		infopanel.add(movieNameTextField);
		infopanel.add(movieTypeLabel);
		infopanel.add(movieTypeTextField);

		JPanel butonPanel = new JPanel();
		byTicketButton = new JButton("BUY TICKET");
		butonPanel.add(byTicketButton);

		detailsPanel.add(infopanel, BorderLayout.CENTER);
		detailsPanel.add(butonPanel, BorderLayout.SOUTH);
		return detailsPanel;
	}
	
	public JList<Movie> getMovieJList() {
		return movieJList;
	}

	public void setMovieNameTextField(String movieName) {
		this.movieNameTextField.setText(movieName);
	}

	public void setMovieTypeTextField(String movieType) {
		this.movieTypeTextField.setText(movieType);
	}
	
	public void addMovieDetailButtonListener(ActionListener listener) {
		viewMovieDetailsButton.addActionListener(listener);
	}
	public void addTicketButtonListener(ActionListener listener) {
		byTicketButton.addActionListener(listener);
	}
}
