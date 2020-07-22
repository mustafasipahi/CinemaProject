package com.cinema.dao.core;

import java.util.List;

public interface IDAO<E> {

	public E save(E entity);
	public E update(E newEntity,E oldEntity);
	public int delete(E enity);
	public E findById(int id);
	public List<E> getAll();
}
