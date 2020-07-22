package com.cinema.service;

import java.util.List;

import com.cinema.dao.TheatreDAO;
import com.cinema.model.Theatre;
import com.cinema.service.core.AbstractService;

public class TheatreService extends AbstractService<Theatre>{

	private TheatreDAO theatreDAO = getTheatreDAO();
	
	private TheatreDAO getTheatreDAO() {
		return new TheatreDAO();
	}
	
	@Override
	public Theatre save(Theatre entity) {		
		return theatreDAO.save(entity);
	}

	@Override
	public Theatre update(Theatre newEntity, Theatre oldEntity) {
		return theatreDAO.update(newEntity, oldEntity);
	}

	@Override
	public int delete(Theatre entity) {
		return theatreDAO.delete(entity);
	}

	@Override
	public Theatre findById(int id) {
		return theatreDAO.findById(id);
	}

	@Override
	public List<Theatre> getAll() {
		return theatreDAO.getAll();
	}

}
