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
import com.cinema.dao.entity.DirectorDAO;
import com.cinema.framework.ApplicationContex;
import com.cinema.model.domain.Director;

public class DirectorDAOImpl extends AbstractDAO<Director> implements DirectorDAO{

	private static final String INSERT_DIRECTOR_SQL = "INSERT INTO cinema.t_directors VALUES (?,?)";
	private static final String SELECT_ALL_DIRECTOR_SQL = "SELECT * FROM ciname.t_directors";
	private static final String FIND_BY_DIRECTOR_ID_SQL = "SELECT * FROM cinema.t_directors WHERE director_id:";
		
	@Override
	public Director save(Director entity) {
		return ApplicationContex.getDaoTemplate().execute(new ConnectionTask<Director>() {

			@Override
			public Director doInConnection(Connection connection) throws SQLException {
				PreparedStatement preparedStatement = connection.prepareStatement(INSERT_DIRECTOR_SQL);
				preparedStatement.setString(1, entity.getFirstName());
				preparedStatement.setString(2, entity.getLastName());
				int affectedRow = preparedStatement.executeUpdate();
				if(affectedRow > 0) return entity;
				return null;
			}
		});
	}

	@Override
	public Director update(Director entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Director findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteById(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Director> getAll() {
		return ApplicationContex.getDaoTemplate().execute(new ConnectionTask<List<Director>>() {

			@Override
			public List<Director> doInConnection(Connection connection) throws SQLException {
				Statement statement = connection.createStatement();
				ResultSet resultSet = statement.executeQuery(SELECT_ALL_DIRECTOR_SQL);
				List<Director> directorList = new ArrayList<Director>();
				while(resultSet.next()) {
					Director director = new Director();
					director.setFirstName(resultSet.getString("first_name"));
					director.setLastName(resultSet.getString("last_name"));
					directorList.add(director);
				}
				return directorList;
			}
		});
	}

}
