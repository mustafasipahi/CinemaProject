package com.cinema.dao.core;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.cinema.exception.DatabaseAccesException;

public class DAOTemplate implements DatabaseOperation{
	
	private Datasource datasource;
	
	public DAOTemplate(Datasource datasource) {
		this.datasource = datasource;
	}
	public Datasource getDatasource() {
		return datasource;
	}
	
	@Override
	public <T> T execute(StatementTask<T> task) throws DatabaseAccesException{
		Connection connection = DatasourceUtils.getConnection(getDatasource());
		Statement statement = null;
		try {
			statement = connection.createStatement();
			return task.doInStatement(statement);
		}catch (SQLException e) {
			statement = null;
			connection = null;
			throw new DatabaseAccesException();
		}finally {
			JDBCUtils.closeStatement(statement);
		}
	}
	
	@Override
	public <T> T execute(ConnectionTask<T> task) throws DatabaseAccesException{
		
		Connection connection = DatasourceUtils.getConnection(getDatasource());			
		try {
			return task.doInConnection(connection);
		} catch (Exception e) {
			connection = null;
			throw new DatabaseAccesException();
		}
	}

	@Override
	public void execute(String sql) {
		
	}
}
