package com.cinema.service;

import java.util.List;

import com.cinema.dao.MovieDAO;
import com.cinema.model.Movie;
import com.cinema.service.core.AbstractService;

public class MovieService extends AbstractService<Movie>{

	private MovieDAO movieDAO = getMovieDAO();
	
	private MovieDAO getMovieDAO() {
		return new MovieDAO();
	}
	
	@Override
	public Movie save(Movie entity) {		
		return movieDAO.save(entity);
	}

	@Override
	public Movie update(Movie newEntity, Movie oldEntity) {		
		return movieDAO.update(newEntity, oldEntity);
	}

	@Override
	public int delete(Movie entity) {		
		return movieDAO.delete(entity);
	}

	@Override
	public Movie findById(int id) {		
		return movieDAO.findById(id);
	}

	@Override
	public List<Movie> getAll() {		
		return movieDAO.getAll();
	}

}
