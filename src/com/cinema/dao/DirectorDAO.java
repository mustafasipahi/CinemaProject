package com.cinema.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cinema.connection.MyConnection;
import com.cinema.dao.core.AbstractDAO;
import com.cinema.dao.core.DAOConstants;
import com.cinema.model.Director;

public class DirectorDAO extends AbstractDAO<Director>{

	@Override
	public Director save(Director entity) {
		try {
			connection = MyConnection.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(DAOConstants.Director_Constants.INSERT_DIRECTOR_SQL);
			preparedStatement.setInt(1, entity.getId());
			preparedStatement.setString(2, entity.getFirstName());
			preparedStatement.setString(3, entity.getLastName());
			int affectedRow = preparedStatement.executeUpdate();
			MyConnection.closeConnection();
			if (affectedRow > 0) return entity;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Director update(Director newEntity, Director oldEntity) {
		delete(oldEntity);
		newEntity.setId(oldEntity.getId());
		save(newEntity);
		return newEntity;
	}

	@Override
	public int delete(Director enity) {
		try {
			connection = MyConnection.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(DAOConstants.Director_Constants.DELETE_DIRECTOR_SQL);
			preparedStatement.setInt(1, enity.getId());
			int affectedRow = preparedStatement.executeUpdate();
			MyConnection.closeConnection();
			if(affectedRow > 0) return affectedRow;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public Director findById(int id) {
		try {
			connection = MyConnection.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(DAOConstants.Director_Constants.FIND_BY_ID_DIRECTOR_SQL);
			preparedStatement.setInt(1, id);
			ResultSet resultSet = preparedStatement.executeQuery();
			MyConnection.closeConnection();
			while(resultSet.next()) {
				Director director = new Director();
				director.setId(resultSet.getInt(1));
				director.setFirstName(resultSet.getString(2));
				director.setLastName(resultSet.getString(3));
				return director;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Director> getAll() {
		List<Director> directors = new ArrayList<Director>();
		try {
			connection = MyConnection.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(DAOConstants.Director_Constants.GET_ALL_DIRECTOR_SQL);
			ResultSet resultSet = preparedStatement.executeQuery();			
			MyConnection.closeConnection();
			while(resultSet.next()) {
				Director director = new Director();
				director.setId(resultSet.getInt(1));
				director.setFirstName(resultSet.getString(2));
				director.setLastName(resultSet.getString(3));
				directors.add(director);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return directors;
	}

}
