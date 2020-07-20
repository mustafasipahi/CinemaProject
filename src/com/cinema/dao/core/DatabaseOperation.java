package com.cinema.dao.core;

public interface DatabaseOperation {

	<T> T execute(StatementTask<T> task);
	
	<T> T execute(ConnectionTask<T> task);
	void execute(String sql);
	
}
