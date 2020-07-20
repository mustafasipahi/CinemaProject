package com.cinema.dao.entity.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.cinema.dao.core.ConnectionTask;
import com.cinema.dao.entity.AbstractDAO;
import com.cinema.dao.entity.ActorDAO;
import com.cinema.model.domain.Actor;

public class ActorDAOImpl extends AbstractDAO<Actor> implements ActorDAO{

	private String insertActorSql = "INSERT INTO t_actor values (?,?)";
	
	@Override
	public Actor save(Actor entity) {
		return getTemplate().execute(new ConnectionTask<Actor>() {

			@Override
			public Actor doInConnection(Connection connection) throws SQLException{
				PreparedStatement preparedStatement;
				preparedStatement = connection.prepareStatement(insertActorSql);
				preparedStatement.setString(1, entity.getFirstName());
				preparedStatement.setString(2, entity.getLastName());
				int affectedRow = preparedStatement.executeUpdate();
				if (affectedRow > 0) return entity; 
				return null;			
			}
		});
	}

	@Override
	public Actor update(Actor entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Actor findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteById(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Actor> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
