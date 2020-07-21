package com.cinema.service;

import com.cinema.dao.entity.impl.MovieDAOImpl;
import com.cinema.model.domain.Movie;

public class MovieService extends AbstarctService<Movie>{

	public MovieService() {
		super(new MovieDAOImpl());
	}

}
