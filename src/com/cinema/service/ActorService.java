package com.cinema.service;

import java.util.List;

import com.cinema.dao.ActorDAO;
import com.cinema.model.Actor;
import com.cinema.service.core.AbstractService;

public class ActorService extends AbstractService<Actor>{

	private ActorDAO actorDAO = getActorDAO();
	
	private ActorDAO getActorDAO() {
		return new ActorDAO();
	}
	
	@Override
	public Actor save(Actor entity) {		
		return actorDAO.save(entity);
	}

	@Override
	public Actor update(Actor newEntity, Actor oldEntity) {		
		return actorDAO.update(newEntity, oldEntity);
	}

	@Override
	public int delete(Actor entity) {		
		return actorDAO.delete(entity);
	}

	@Override
	public Actor findById(int id) {		
		return actorDAO.findById(id);
	}

	@Override
	public List<Actor> getAll() {		
		return actorDAO.getAll();
	}

}
