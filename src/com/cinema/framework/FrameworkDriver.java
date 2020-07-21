package com.cinema.framework;

import java.io.IOException;
import java.util.Properties;

public class FrameworkDriver implements LifeCycle {

	private Application application;

	@Override
	public void initializeApplication() {
		try {
			Properties applicationConfig = ConfigurationLoader.loadConfiguration();
			initializeApplicationContex(applicationConfig);
			application = new Application();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println();
	}

	@Override
	public void startApplication() {
		application.setRunning(true);
		new Thread(application).start();
	}

	@Override
	public void stopApplication() {
		application.setRunning(false);
		System.out.println("Application is stoped");
	}

	public void run() {
		initializeApplication();
		startApplication();
		stopApplication();
	}

	private void initializeApplicationContex(Properties applicationConfig) {
		ApplicationContex.initialize(applicationConfig);
	}
}
