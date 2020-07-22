package com.cinema.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cinema.connection.MyConnection;
import com.cinema.dao.core.AbstractDAO;
import com.cinema.dao.core.DAOConstants;
import com.cinema.model.Actor;

public class ActorDAO extends AbstractDAO<Actor>{
	
	@Override
	public Actor save(Actor entity) {
		try {
			connection = MyConnection.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(DAOConstants.Actor_Constants.INSERT_ACTOR_SQL);
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
	public Actor update(Actor newEntity, Actor oldEntity) {
		delete(oldEntity);
		newEntity.setId(oldEntity.getId());
		save(newEntity);
		return newEntity;
	}

	@Override
	public int delete(Actor enity) {
		try {
			connection = MyConnection.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(DAOConstants.Actor_Constants.DELETE_ACTOR_SQL);
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
	public Actor findById(int id) {
		try {
			connection = MyConnection.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(DAOConstants.Actor_Constants.FIND_BY_ID_ACTOR_SQL);
			preparedStatement.setInt(1, id);
			ResultSet resultSet = preparedStatement.executeQuery();
			MyConnection.closeConnection();
			while(resultSet.next()) {
				Actor actor = new Actor();
				actor.setId(resultSet.getInt(1));
				actor.setFirstName(resultSet.getString(2));
				actor.setLastName(resultSet.getString(3));
				return actor;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Actor> getAll() {		
		List<Actor> actors = new ArrayList<Actor>();
		try {
			connection = MyConnection.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(DAOConstants.Actor_Constants.GET_ALL_ACTOR_SQL);
			ResultSet resultSet = preparedStatement.executeQuery();			
			MyConnection.closeConnection();
			while(resultSet.next()) {
				Actor actor = new Actor();
				actor.setId(resultSet.getInt(1));
				actor.setFirstName(resultSet.getString(2));
				actor.setLastName(resultSet.getString(3));
				actors.add(actor);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return actors;
	}

}
