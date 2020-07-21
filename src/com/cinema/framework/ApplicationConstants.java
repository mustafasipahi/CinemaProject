package com.cinema.framework;

public abstract class ApplicationConstants {

	public static final String CONFIGURATION_ROOT_PATH = "resources/";
	public static final String APPLICATION_CONFIGURATION_FILE = "application.properties";
	
	static class LEGEL_CONFIGURATION_KEYS{		
		public static final String APPLICATION_NAME = "app.name";
		public static final String APPLICATION_VERSION = "app.version";
		public static final String DATASOURCE_URL = "datasource.url";
		public static final String APPLICATION_USERNAME = "datasource.username";
		public static final String APPLICATION_PASSWORD = "datasource.password";
	}
	
	public static class VIEW_CONSTANTS{
		
		public static final String MOVIE_BORDER_TITLE = "MOVIES";
		public static final String MOVIE_DETAIL_TITLE = "MOVIE DETAIL";
	}
}
