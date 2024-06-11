package it.unirc.pwm.log4J;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ProvaLog4J {

	private static Logger logger =LogManager.getLogger("Nome del logger"); 
	public static void main(String[] args){
				logger.fatal("Esempio di log fatal");
				logger.error("Esempio di log error");
				logger.info("Esempio di log info");
			}

}
