package LoggerConcept;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.logging.log4j.core.config.properties.PropertiesConfiguration;

public class Propertylog4jExample {
	
	// ippo nan logger ahh get pannika poran
	static Logger logger =Logger.getLogger(Propertylog4jExample.class);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// enoda log entha format la irukkanunu log4j.properties ndra file sollitan but anth file 
//		ahh inga konduthu sollanunm intha file la ennoda format irukkunu so athuku thaan ithu
		
		PropertyConfigurator.configure("Log4j.properties");
		logger.debug("this is message");
		logger.info("this is message");

	}

}
