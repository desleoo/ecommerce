package it.unirc.pwm.pattern.factory.Spedizione;

public class SpedizioneDAOFactory {
	private static SpedizioneDAO dao = null;
	  
	  private SpedizioneDAOFactory(){
	  }
	  
	  public static synchronized SpedizioneDAO getDAO() {
	    if ( dao == null ) {
	    	dao = new SpedizioneDAOSimpleImp();
	    }
	    return dao;
	  } 
}
