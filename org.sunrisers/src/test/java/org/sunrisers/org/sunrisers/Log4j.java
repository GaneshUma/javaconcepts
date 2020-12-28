package org.sunrisers.org.sunrisers;

import java.util.logging.Logger;

import org.apache.log4j.PropertyConfigurator;

public class Log4j {
	
	static Logger log = Logger.getAnonymousLogger();
	
	public static void main(String[] args) {
		//PropertiesConfigurator is used to configure logger from a properties file
        PropertyConfigurator.configure("‪C:\\log4j.properties");

        //log the message to file

        log.info("This is an info message");
	}

}
