package com.cinema.dao.login;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cinema.connection.MyConnection;
import com.cinema.dao.core.AbstractDAO;
import com.cinema.dao.core.DAOConstants;
import com.cinema.model.login.Admin;

public class AdminDAO extends AbstractDAO<Admin>{

	@Override
	public Admin save(Admin entity) {
		try {
			connection = MyConnection.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(DAOConstants.Admin_Constants.INSERT_ADMIN_SQL);
			preparedStatement.setInt(1, entity.getId());
			preparedStatement.setString(2, entity.getDescription());
			preparedStatement.setString(3, entity.getAdminName());
			preparedStatement.setString(4, entity.getAdminpassword());
			preparedStatement.setString(5, entity.getRole());
			int affectedRow = preparedStatement.executeUpdate();
			MyConnection.closeConnection();
			if(affectedRow>0) return entity;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Admin update(Admin newEntity, Admin oldEntity) {
		delete(oldEntity);
		newEntity.setId(oldEntity.getId());
		save(newEntity);
		return newEntity;
	}

	@Override
	public int delete(Admin enity) {
		try {
			connection = MyConnection.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(DAOConstants.Admin_Constants.DELETE_ADMIN_SQL);
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
	public Admin findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Admin> getAll() {
		List<Admin> admins = new ArrayList<Admin>();
		try {
			connection = MyConnection.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(DAOConstants.Admin_Constants.GET_ALL_ADMIN_SQL);
			ResultSet resultSet = preparedStatement.executeQuery();
			MyConnection.closeConnection();
			while(resultSet.next()) {
				Admin admin = new Admin();
				admin.setId(resultSet.getInt(1));
				admin.setDescription(resultSet.getString(2));
				admin.setAdminName(resultSet.getString(3));
				admin.setAdminpassword(resultSet.getString(4));
				admin.setRole(resultSet.getString(5));
				admins.add(admin);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return admins;
	}

}
