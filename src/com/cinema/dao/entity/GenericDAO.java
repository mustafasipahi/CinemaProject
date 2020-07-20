package com.cinema.dao.entity;

import java.util.List;

public interface GenericDAO<E> {

	E save(E entity);
	E update(E entity);
	E findById(int id);
	boolean deleteById(int id);
	List<E> getAll();
}
