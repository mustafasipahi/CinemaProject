package com.cinema.service;

import java.util.List;

import com.cinema.dao.MovieDAO;
import com.cinema.dao.SeanceDAO;
import com.cinema.model.Seance;
import com.cinema.service.core.AbstractService;

public class SeanceService extends AbstractService<Seance>{

	private SeanceDAO seanceDAO = getSeanceDAO();
	
	private SeanceDAO getSeanceDAO() {
		return new SeanceDAO();
	}
	
	@Override
	public Seance save(Seance entity) {
		return seanceDAO.save(entity);
	}

	@Override
	public Seance update(Seance newEntity, Seance oldEntity) {
		return seanceDAO.update(newEntity, oldEntity);
	}

	@Override
	public int delete(Seance entity) {
		return seanceDAO.delete(entity);
	}

	@Override
	public Seance findById(int id) {
		return seanceDAO.findById(id);
	}

	@Override
	public List<Seance> getAll() {
		return seanceDAO.getAll();
	}

}
