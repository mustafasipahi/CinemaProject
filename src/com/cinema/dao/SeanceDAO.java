package com.cinema.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cinema.connection.MyConnection;
import com.cinema.dao.core.AbstractDAO;
import com.cinema.dao.core.DAOConstants;
import com.cinema.model.Seance;

public class SeanceDAO extends AbstractDAO<Seance>{

	@Override
	public Seance save(Seance entity) {
		try {
			connection = MyConnection.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(DAOConstants.Seance_Constants.INSERT_SEANCE_SQL);
			preparedStatement.setInt(1, entity.getId());
			preparedStatement.setString(2, entity.getDescription());
			preparedStatement.setString(3, entity.getStartTime());
			preparedStatement.setString(4, entity.getEndTime());
			int affectedRow = preparedStatement.executeUpdate();
			MyConnection.closeConnection();
			if(affectedRow>0) return entity;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Seance update(Seance newEntity, Seance oldEntity) {
		delete(oldEntity);
		newEntity.setId(oldEntity.getId());
		save(newEntity);
		return newEntity;
	}

	@Override
	public int delete(Seance enity) {
		try {
			connection = MyConnection.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(DAOConstants.Seance_Constants.DELETE_SEANCE_SQL);
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
	public Seance findById(int id) {
		try {
			connection = MyConnection.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(DAOConstants.Seance_Constants.FIND_BY_ID_SEANCE_SQL);
			preparedStatement.setInt(1, id);
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				Seance seance = new Seance();
				seance.setId(resultSet.getInt(1));
				seance.setDescription(resultSet.getString(2));
				seance.setStartTime(resultSet.getString(3));
				seance.setEndTime(resultSet.getString(4));
				return seance;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}		
		return null;
	}

	@Override
	public List<Seance> getAll() {
		List<Seance> seances = new ArrayList<Seance>();
		try {
			connection = MyConnection.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(DAOConstants.Seance_Constants.GET_ALL_SEANCE_SQL);
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				Seance seance = new Seance();
				seance.setId(resultSet.getInt(1));
				seance.setDescription(resultSet.getString(2));
				seance.setStartTime(resultSet.getString(3));
				seance.setEndTime(resultSet.getString(4));
				seances.add(seance);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}		
		return seances;
	}

}
