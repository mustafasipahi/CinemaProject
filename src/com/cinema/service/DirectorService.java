package com.cinema.service;

import java.util.List;

import com.cinema.dao.DirectorDAO;
import com.cinema.model.Director;
import com.cinema.service.core.AbstractService;

public class DirectorService extends AbstractService<Director>{

	private DirectorDAO directorDAO = getDirectorDAO();
	
	private DirectorDAO getDirectorDAO() {
		if(directorDAO == null ) {
			directorDAO = new DirectorDAO();
		}
		return directorDAO;
	}
	
	@Override
	public Director save(Director entity) {		
		return directorDAO.save(entity);
	}

	@Override
	public Director update(Director newEntity, Director oldEntity) {
		return directorDAO.update(newEntity, oldEntity);
	}

	@Override
	public int delete(Director entity) {
		return directorDAO.delete(entity);
	}

	@Override
	public Director findById(int id) {
		return directorDAO.findById(id);
	}

	@Override
	public List<Director> getAll() {
		return directorDAO.getAll();
	}

}
