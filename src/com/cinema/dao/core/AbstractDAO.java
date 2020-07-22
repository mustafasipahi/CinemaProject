package com.cinema.dao.core;

import java.sql.Connection;

public abstract class AbstractDAO<E> implements IDAO<E>{
	
	public Connection connection;
}
