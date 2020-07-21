package com.cinema.framework;

import java.util.Properties;

import com.cinema.dao.core.DAOTemplate;
import com.cinema.dao.core.Datasource;
import com.cinema.dao.core.DatasourceImpl;
import com.cinema.exception.DAOTemplateNotInitializingException;

public class ApplicationContex {

	private static DAOTemplate daoTemplate;
	private static DatasourceImpl datasourceImpl;
	
	public static DAOTemplate getDaoTemplate() {
		if (daoTemplate == null) {
			throw new DAOTemplateNotInitializingException();
		}
		return daoTemplate;
	}
	
	private static void initializationDAOAccessTemplate(Datasource datasource) {
		if (daoTemplate !=null) {
			return;
		}
		daoTemplate = new DAOTemplate(datasource);		
	}
	
	private static Datasource initializeDatasource(Properties applicationConfig) {
		if (datasourceImpl== null) {
			datasourceImpl = new DatasourceImpl()
					.withDatasourceURL(ApplicationConstants.LEGEL_CONFIGURATION_KEYS.DATASOURCE_URL)
					.withDatasourceUsername(ApplicationConstants.LEGEL_CONFIGURATION_KEYS.APPLICATION_USERNAME)
					.withDatasourcePassword(ApplicationConstants.LEGEL_CONFIGURATION_KEYS.APPLICATION_PASSWORD);
		}		
		return datasourceImpl;
	}
	
	public static void initialize(Properties applicationConfig) {
		printApplicationInfo(applicationConfig);
		initializationDAOAccessTemplate(initializeDatasource(applicationConfig));
	}
	
	private static void printApplicationInfo(Properties applicationConfig) {
		System.out.println(applicationConfig.getProperty(ApplicationConstants.LEGEL_CONFIGURATION_KEYS.APPLICATION_NAME)+ " is starting..");
		System.out.println("version : "+applicationConfig.getProperty(ApplicationConstants.LEGEL_CONFIGURATION_KEYS.APPLICATION_VERSION));
	}
}
