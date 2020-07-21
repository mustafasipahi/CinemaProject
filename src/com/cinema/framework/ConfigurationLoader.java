package com.cinema.framework;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;

public class ConfigurationLoader {

	public static Properties loadConfiguration() throws IOException{
		
		Path configurationAbsoluteRootPath = Paths.get("resources/").toAbsolutePath().resolve("application.properties");
		Properties applicationConfigurationProperties = new Properties();
		applicationConfigurationProperties.load(new FileInputStream(configurationAbsoluteRootPath.toString()));
		return applicationConfigurationProperties;
	}	
}
