package com.cinema.service;

import com.cinema.dao.entity.impl.ActorDAOImpl;
import com.cinema.model.domain.Actor;

public class ActorService extends AbstarctService<Actor>{

	public ActorService() {
		super(new ActorDAOImpl());
	}

}
