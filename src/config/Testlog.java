package config;

import org.apache.log4j.Logger;

public class Testlog {
	
	
	static Logger log = Logger.getLogger(Testlog.class);
	public static void main(String[] args) {
		
		log.debug("This is debug log");
		log.info("This is info log");
		log.error("Erorr is a Project");
		
		
	}

}
