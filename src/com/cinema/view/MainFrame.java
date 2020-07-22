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
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

import com.cinema.model.Movie;

public class MainFrame extends JFrame{

	private JPanel mainPanel;
	private JPanel moviesPanel;
	private JPanel detailsPanel;
	private JPanel buttonPanel;
	
	private JList<Movie> movieList;
	private JLabel movieNameLabel;
	private JLabel movieTypeLabel;
	private JTextField movieNameTextField;
	private JTextField movieTypeTextField;
	private JButton byTicketButton;
	
	public MainFrame() {	
		setLayout(new BorderLayout());
		mainPanel = new JPanel(new BorderLayout());
		mainPanel.add(initTablePanel(),BorderLayout.WEST);
		mainPanel.add(initDetailPanel(),BorderLayout.CENTER);		
		
		add(mainPanel,BorderLayout.CENTER);
		creatMainFrame();
	}
	
	private void creatMainFrame() {
		this.setName("WELCOME TO CINEMA PROJECT");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600,600);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
	
	private JPanel initTablePanel() {
		moviesPanel = new JPanel(new BorderLayout());
		moviesPanel.setBorder(BorderFactory.createTitledBorder("                              MOVIES"));
		movieList = new JList<Movie>();
		moviesPanel.add(movieList,BorderLayout.CENTER);
		moviesPanel.setPreferredSize(new Dimension(250, 400));
		return moviesPanel;
	}
	
	private JPanel initDetailPanel() {
		detailsPanel = new JPanel(new BorderLayout());
		detailsPanel.setBorder(BorderFactory.createTitledBorder("                             MOVIE DETAIL"));
		
		JPanel infopanel = new JPanel(new GridLayout(2,2,5,5));
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
		byTicketButton = new JButton("BY TICKET");
		butonPanel.add(byTicketButton);
		
		detailsPanel.add(infopanel,BorderLayout.CENTER);
		detailsPanel.add(butonPanel,BorderLayout.SOUTH);
		return detailsPanel;
	}
	
	public JList<Movie> getMovieList() {
		return movieList;
	}
	public void setMovieList(JList<Movie> movieList) {
		this.movieList = movieList;
	}
	
	public void addActionListener(ActionListener actionListener) {
		byTicketButton.addActionListener(actionListener);
	}
	
	public void setMovieNameTextField(JTextField movieNameTextField) {
		this.movieNameTextField = movieNameTextField;
	}
	public void setMovieTypeTextField(JTextField movieTypeTextField) {
		this.movieTypeTextField = movieTypeTextField;
	}
}
