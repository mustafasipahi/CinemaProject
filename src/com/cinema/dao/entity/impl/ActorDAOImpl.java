package com.cinema.dao.entity.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.cinema.dao.core.ConnectionTask;
import com.cinema.dao.entity.AbstractDAO;
import com.cinema.dao.entity.ActorDAO;
import com.cinema.framework.ApplicationContex;
import com.cinema.model.domain.Actor;

public class ActorDAOImpl extends AbstractDAO<Actor> implements ActorDAO{

	private static final String INSERT_ACTOR_SQL = "INSERT INTO cinema.t_actor values (?,?)";
	private static final String SELECT_ALL_ACTOR_SQL = "SELECT * FROM cinema.t_actors";
	private static final String FIND_BY_ACTOR_ID_SQL = "SELECT * FROM cinema.t_actors WHERE actor_id:";
	
	@Override
	public Actor save(Actor entity) {
		return ApplicationContex.getDaoTemplate().execute(new ConnectionTask<Actor>() {

			@Override
			public Actor doInConnection(Connection connection) throws SQLException{				
				PreparedStatement preparedStatement = connection.prepareStatement(INSERT_ACTOR_SQL);
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
		ApplicationContex.getDaoTemplate().execute(new ConnectionTask<Actor>() {

			@Override
			public Actor doInConnection(Connection connection) throws SQLException {
				
				return null;
			}
		});
		return null;
	}

	@Override
	public boolean deleteById(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Actor> getAll() {
		return ApplicationContex.getDaoTemplate().execute(new ConnectionTask<List<Actor>>() {

			@Override
			public List<Actor> doInConnection(Connection connection) throws SQLException {
				Statement statement = connection.createStatement();
				ResultSet resultSet = statement.executeQuery(SELECT_ALL_ACTOR_SQL);
				List<Actor> actorList = new ArrayList<Actor>();
				while(resultSet.next()) {
					Actor actor = new Actor();
					actor.setFirstName(resultSet.getString("first_name"));
					actor.setLastName(resultSet.getString("last_name"));
					actorList.add(actor);
				}
				return actorList;
			}
		});
	}

}
