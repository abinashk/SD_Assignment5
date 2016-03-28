package assignment5;
import org.apache.log4j.Logger;

class LoggingClass {
	
	static final Logger logger = Logger.getRootLogger();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		logger.debug("Sample debug message");
		logger.info("Sample info message");
		logger.warn("Sample warn message");
		logger.error("Sample error message");
		logger.fatal("Sample fatal message");
	}

}
