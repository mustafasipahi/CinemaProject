package com.cinema.service;

import com.cinema.dao.entity.impl.DirectorDAOImpl;
import com.cinema.model.domain.Director;

public class DirectorService extends AbstarctService<Director>{

	public DirectorService() {
		super(new DirectorDAOImpl());
	}

}
