package com.cinema.connection;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;

public class Configuration {

	private static Properties properties;
	
	public static Properties loadConfiguration() throws FileNotFoundException, IOException{
		
		Path path = Paths.get(ConnctionConstants.CONFIGURATION_ROOT_PATH)
				.toAbsolutePath().resolve(ConnctionConstants.APPLICATION_CONFIGURATION_FILE);
		
		Properties connectionProperties = new Properties();
		connectionProperties.load(new FileInputStream(path.toString()));
		
		return connectionProperties;
	}	
	
	public static String setCONNECTION_URL() {
		try {
			properties = loadConfiguration();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return properties.getProperty("datasource.url");
	}
	public static String setCONNCTION_USER_NAME() {
		try {
			properties = loadConfiguration();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return properties.getProperty("datasource.username");
	}
	public static String setCONNCTION_PASSWOR() {
		try {
			properties = loadConfiguration();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return properties.getProperty("datasource.password");
	}
}
