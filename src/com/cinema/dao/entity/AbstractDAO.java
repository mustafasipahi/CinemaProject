package com.cinema.dao.entity;

import com.cinema.dao.core.DAOTemplate;

public abstract class AbstractDAO<E> implements GenericDAO<E>{

	private DAOTemplate template;
	
	public void setTemplate(DAOTemplate template) {
		this.template = template;
	}
	public DAOTemplate getTemplate() {
		return template;
	}
}
