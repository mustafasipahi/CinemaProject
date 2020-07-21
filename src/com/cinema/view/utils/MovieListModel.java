package com.cinema.view.utils;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import com.cinema.model.domain.Movie;

public class MovieListModel extends AbstractTableModel{
	
	private static final long serialVersionUID = 510823734996973695L;
	private final String[] COLUMN_NAME = {"Movie Names"};
	private List<Movie> movies = new ArrayList<Movie>();
		
	@Override
	public int getRowCount() {
		return movies.size();
	}

	@Override
	public int getColumnCount() {
		return COLUMN_NAME.length;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		Object result = null;
		Movie movie = movies.get(rowIndex);
		result = movie.getMovieName();
		return result;
	}
	
	public void setMovies(List<Movie> movies) {
		this.movies = movies;
	}
	
	public List<Movie> getMovies() {
		return movies;
	}

}
