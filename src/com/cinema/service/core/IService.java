package com.cinema.service.core;

import java.util.List;

public interface IService<E> {

	public E save(E entity);
	public E update(E newEntity,E oldEntity);
	public int delete(E entity);
	public E findById(int id);
	public List<E> getAll();
}
