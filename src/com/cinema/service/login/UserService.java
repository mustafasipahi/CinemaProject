package com.cinema.service.login;

import java.util.List;

import com.cinema.dao.login.UserDAO;
import com.cinema.model.login.User;
import com.cinema.service.core.AbstractService;

public class UserService extends AbstractService<User>{

	private UserDAO userDAO = getUserDAO();
	
	private UserDAO getUserDAO() {
		return new UserDAO();
	}
	
	@Override
	public User save(User entity) {
		return userDAO.save(entity);
	}

	@Override
	public User update(User newEntity, User oldEntity) {
		return userDAO.update(newEntity, oldEntity);
	}

	@Override
	public int delete(User entity) {
		return userDAO.delete(entity);
	}

	@Override
	public User findById(int id) {
		return null;
	}
	
	public int findCount() {
		return userDAO.findCount();
	}

	@Override
	public List<User> getAll() {
		return userDAO.getAll();
	}

}
