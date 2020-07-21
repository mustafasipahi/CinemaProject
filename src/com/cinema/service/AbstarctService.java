package com.cinema.service;

import java.util.List;

import com.cinema.dao.entity.GenericDAO;

public abstract class AbstarctService<E> {

	private GenericDAO<E> dao;
	
	public AbstarctService(GenericDAO<E> dao) {
		this.dao = dao;
	}
	
	public GenericDAO<E> getDao() {
		return dao;
	}
	
	public E save(E entity) {
		return getDao().save(entity);
	}
	
	public E update(E entity) {
		return getDao().update(entity);
	}
	
	public E findById(int id) {
		return getDao().findById(id);
	}
	
	public boolean deleteById(int id) {
		return getDao().deleteById(id);
	}
	
	public List<E> getAll() {
		return getDao().getAll();
	}
}
