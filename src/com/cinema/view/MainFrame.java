package com.cinema.view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.border.TitledBorder;

import com.cinema.framework.ApplicationConstants;
import com.cinema.model.domain.Movie;
import com.cinema.view.utils.MovieListModel;

public class MainFrame extends JFrame {

	private MovieListModel movieListModel;
	private JTable movieList;
	private JTextField movieNameTextField;
	private JTextField movieTypeTextField;
	private JButton buton;

	public MainFrame() {
		this.setLayout(new BorderLayout());
		this.add(initMoviePanel(), BorderLayout.WEST);
		this.add(initDetailPanel(),BorderLayout.CENTER);
	}

	private JPanel initMoviePanel() {
		JPanel moviesPanel = new JPanel(new BorderLayout());
		moviesPanel.setBorder(new TitledBorder(ApplicationConstants.VIEW_CONSTANTS.MOVIE_BORDER_TITLE));
		movieListModel = new MovieListModel();
		movieList = new JTable(movieListModel);
		movieList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		JScrollPane scrollPane = new JScrollPane(movieList);
		scrollPane.setPreferredSize(new Dimension(250, 400));
		moviesPanel.add(scrollPane, BorderLayout.CENTER);

		return moviesPanel;
	}

	private JPanel initDetailPanel() {
		JPanel movieDetailPanel = new JPanel(new BorderLayout());
		JPanel movieInfoPanel = new JPanel(new GridLayout(2, 2, 5, 5));
		
		movieInfoPanel.setBorder(new TitledBorder(ApplicationConstants.VIEW_CONSTANTS.MOVIE_DETAIL_TITLE));
		movieInfoPanel.add(new JLabel("                         MOVIE NAME : "));
		movieNameTextField = new JTextField();
		movieNameTextField.setEnabled(false);
		movieInfoPanel.add(movieNameTextField);
		
		movieInfoPanel.add(new JLabel("                         MOVIE TYPE : "));
		movieTypeTextField = new JTextField();
		movieTypeTextField.setEnabled(false);
		movieInfoPanel.add(movieTypeTextField);
		
		movieDetailPanel.add(movieInfoPanel,BorderLayout.CENTER);
		movieDetailPanel.add(initButonPanel(),BorderLayout.SOUTH);
		
		return movieDetailPanel;
	}
	
	private JPanel initButonPanel() {
		JPanel butonPanel = new JPanel();
		buton = new JButton("By TICKET");
		butonPanel.add(buton);
		
		return butonPanel;
	}
	
	public void setMovies(List<Movie> movies) {
		movieListModel.setMovies(movies);
	}
	
	public Movie getSelectedMovie() {
		int index = movieList.getSelectedRow();
		return movieListModel.getMovies().get(index);
	}
	
	public void addGetticketButtonListener(ActionListener listener) {
		buton.addActionListener(listener);
	}
	
	public void updateMovieValues(Movie movie) {
		movieNameTextField.setText(movie.getMovieName());
		movieTypeTextField.setText(movie.getType());
	}
}
