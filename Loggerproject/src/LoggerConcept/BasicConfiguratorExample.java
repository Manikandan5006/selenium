package LoggerConcept;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class BasicConfiguratorExample {
	
	static Logger logger = Logger.getLogger(BasicConfiguratorExample.class);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		logger.debug("this is message");
		logger.info("this is message");

	}

}
