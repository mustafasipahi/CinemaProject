package com.cinema.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cinema.connection.MyConnection;
import com.cinema.dao.core.AbstractDAO;
import com.cinema.dao.core.DAOConstants;
import com.cinema.model.Theatre;

public class TheatreDAO extends AbstractDAO<Theatre>{

	@Override
	public Theatre save(Theatre entity) {
		try {
			connection = MyConnection.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(DAOConstants.Theatre_Constants.INSERT_MOVIE_SQL);
			preparedStatement.setInt(1, entity.getId());
			preparedStatement.setString(2, entity.getTheatreName());
			preparedStatement.setInt(3, entity.getCapacity());
			preparedStatement.setInt(4, entity.getMovie().getId());
			int affectedRow = preparedStatement.executeUpdate();
			MyConnection.closeConnection();
			if(affectedRow>0) return entity;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Theatre update(Theatre newEntity, Theatre oldEntity) {
		delete(oldEntity);
		newEntity.setId(oldEntity.getId());
		save(newEntity);
		return newEntity;
	}

	@Override
	public int delete(Theatre enity) {
		try {
			connection = MyConnection.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(DAOConstants.Theatre_Constants.DELETE_MOVIE_SQL);
			preparedStatement.setInt(1, enity.getId());
			int affectedRow = preparedStatement.executeUpdate();
			MyConnection.closeConnection();
			if(affectedRow>0) return affectedRow;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public Theatre findById(int id) {
		try {
			connection = MyConnection.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(DAOConstants.Theatre_Constants.FIND_BY_ID_MOVIE_SQL);
			preparedStatement.setInt(1, id);
			ResultSet resultSet = preparedStatement.executeQuery();
			MyConnection.closeConnection();
			while(resultSet.next()) {
				Theatre theatre = new Theatre();
				theatre.setId(resultSet.getInt(1));
				theatre.setTheatreName(resultSet.getString(2));
				theatre.setCapacity(resultSet.getInt(3));
				return theatre;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		return null;
	}

	@Override
	public List<Theatre> getAll() {
		List<Theatre> theatres = new ArrayList<Theatre>();
		try {
			connection = MyConnection.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(DAOConstants.Theatre_Constants.GET_ALL_MOVIE_SQL);
			ResultSet resultSet = preparedStatement.executeQuery();
			MyConnection.closeConnection();
			while(resultSet.next()) {
				Theatre theatre = new Theatre();
				theatre.setId(resultSet.getInt(1));
				theatre.setTheatreName(resultSet.getString(2));
				theatre.setCapacity(resultSet.getInt(3));
				theatres.add(theatre);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return theatres;
	}

}
