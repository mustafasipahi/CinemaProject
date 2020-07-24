package com.cinema.dao.login;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cinema.connection.MyConnection;
import com.cinema.dao.core.AbstractDAO;
import com.cinema.dao.core.DAOConstants;
import com.cinema.model.login.User;

public class UserDAO extends AbstractDAO<User>{

	@Override
	public User save(User entity) {
		try {
			connection = MyConnection.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(DAOConstants.User_Constants.INSERT_ADMIN_SQL);
			preparedStatement.setInt(1, entity.getId());
			preparedStatement.setString(2, entity.getDescription());
			preparedStatement.setString(3, entity.getUserName());
			preparedStatement.setString(4, entity.getUserPassword());
			int affectedRow = preparedStatement.executeUpdate();
			MyConnection.closeConnection();
			if(affectedRow>0) return entity;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public User update(User newEntity, User oldEntity) {
		delete(oldEntity);
		newEntity.setId(oldEntity.getId());
		save(newEntity);
		return newEntity;
	}

	@Override
	public int delete(User enity) {
		try {
			connection = MyConnection.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(DAOConstants.User_Constants.DELETE_ADMIN_SQL);
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
	public User findById(int id) {
		return null;
	}

	@Override
	public List<User> getAll() {
		List<User> users = new ArrayList<User>();
		try {
			connection = MyConnection.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(DAOConstants.User_Constants.GET_ALL_ADMIN_SQL);
			ResultSet resultSet = preparedStatement.executeQuery();
			MyConnection.closeConnection();
			while(resultSet.next()) {
				User user = new User();
				user.setId(resultSet.getInt(1));
				user.setDescription(resultSet.getString(2));
				user.setUserName(resultSet.getString(3));
				user.setUserPassword(resultSet.getString(4));
				users.add(user);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return users;
	}

}
