package com.cinema.dao.entity.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.cinema.dao.core.ConnectionTask;
import com.cinema.dao.entity.AbstractDAO;
import com.cinema.dao.entity.MovieDAO;
import com.cinema.framework.ApplicationContex;
import com.cinema.model.domain.Movie;

public class MovieDAOImpl extends AbstractDAO<Movie> implements MovieDAO{

	private static final String INSERT_MOVIE_SQL = "INSERT INTO cinema.t_movies VALUES (?,?)";
	private static final String SELECT_ALL_MOVIE_SQL = "SELECT * FROM ciname.t_movies";
	private static final String FIND_BY_MOVIE_ID_SQL = "SELECT * FROM cinema.t_movies WHERE movie_id:";
		
	@Override
	public Movie save(Movie entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Movie update(Movie entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Movie findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteById(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Movie> getAll() {
		return ApplicationContex.getDaoTemplate().execute(new ConnectionTask<List<Movie>>() {

			@Override
			public List<Movie> doInConnection(Connection connection) throws SQLException {
				Statement statement = connection.createStatement();
				ResultSet resultSet = statement.executeQuery(SELECT_ALL_MOVIE_SQL);
				List<Movie> list = new ArrayList<Movie>();
				while(resultSet.next()) {
					Movie movie = new Movie();
					movie.setMovieName(resultSet.getString("movie_name"));
					movie.setType(resultSet.getString("movie_type"));
					list.add(movie);
				}
				return list;
			}
		});
	}

}
