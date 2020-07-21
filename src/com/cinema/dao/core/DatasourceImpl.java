package com.cinema.dao.core;

import java.sql.Connection;
import java.sql.SQLException;

public class DatasourceImpl implements Datasource{

	private String datasourceURL;
	private String datasourceUsername;
	private String datasourcePassword;
	
	public DatasourceImpl withDatasourceURL(String datasourceURL) {
		this.datasourceURL = datasourceURL;
		return this;
	}
	
	public DatasourceImpl withDatasourceUsername(String datasourceUsername) {
		this.datasourceUsername = datasourceUsername;
		return this;
	}
	
	public DatasourceImpl withDatasourcePassword(String datasourcePassword) {
		this.datasourcePassword = datasourcePassword;
		return this;
	}
	
	@Override
	public Connection getConnection() throws SQLException {
		
		return null;
	}

	@Override
	public Connection getConnection(String userName, String password) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
