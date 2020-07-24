package com.cinema.service.login;

import java.util.List;

import com.cinema.dao.login.AdminDAO;
import com.cinema.model.login.Admin;
import com.cinema.service.core.AbstractService;

public class AdminService extends AbstractService<Admin>{

	private AdminDAO adminDAO = getAdminDAO();
	
	private AdminDAO getAdminDAO() {
		return new AdminDAO();
	}
	
	@Override
	public Admin save(Admin entity) {
		return adminDAO.save(entity);
	}

	@Override
	public Admin update(Admin newEntity, Admin oldEntity) {
		return adminDAO.update(newEntity, oldEntity);
	}

	@Override
	public int delete(Admin entity) {
		return adminDAO.delete(entity);
	}

	@Override
	public Admin findById(int id) {
		return null;
	}

	@Override
	public List<Admin> getAll() {
		return adminDAO.getAll();
	}

}
