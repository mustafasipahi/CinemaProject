package com.cinema.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cinema.connection.MyConnection;
import com.cinema.dao.core.AbstractDAO;
import com.cinema.dao.core.DAOConstants;
import com.cinema.model.Movie;

public class MovieDAO extends AbstractDAO<Movie>{

	@Override
	public Movie save(Movie entity) {
		try {
			connection = MyConnection.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(DAOConstants.Movie_Constants.INSERT_MOVIE_SQL);
			preparedStatement.setInt(1, entity.getId());
			preparedStatement.setString(2, entity.getMovieName());
			preparedStatement.setString(3, entity.getMovieType());
			preparedStatement.setInt(4, entity.getTheatre().getId());
			int affectedRow = preparedStatement.executeUpdate();
			MyConnection.closeConnection();
			if(affectedRow > 0) return entity;
		} catch (SQLException e) {
			e.printStackTrace();
		}		
		return null;
	}

	@Override
	public Movie update(Movie newEntity, Movie oldEntity) {
		delete(oldEntity);
		newEntity.setId(oldEntity.getId());
		save(newEntity);
		return newEntity;
	}

	@Override
	public int delete(Movie enity) {
		try {
			connection = MyConnection.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(DAOConstants.Movie_Constants.DELETE_MOVIE_SQL);
			preparedStatement.setInt(1, enity.getId());
			int affectedRow = preparedStatement.executeUpdate();
			MyConnection.closeConnection();
			if(affectedRow>0) return affectedRow;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public Movie findById(int id) {
		try {
			connection = MyConnection.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(DAOConstants.Movie_Constants.FIND_BY_ID_MOVIE_SQL);
			preparedStatement.setInt(1, id);
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				Movie movie = new Movie();
				movie.setId(resultSet.getInt(1));
				movie.setMovieName(resultSet.getString(2));
				movie.setMovieType(resultSet.getString(3));
				return movie;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Movie> getAll() {
		List<Movie> movies = new ArrayList<Movie>();
		try {
			connection = MyConnection.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(DAOConstants.Movie_Constants.GET_ALL_MOVIE_SQL);
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				Movie movie = new Movie();
				movie.setId(resultSet.getInt(1));
				movie.setMovieName(resultSet.getString(2));
				movie.setMovieType(resultSet.getString(3));
				movies.add(movie);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return movies;
	}

}
