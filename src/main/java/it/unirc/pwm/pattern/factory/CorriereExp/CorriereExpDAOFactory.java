package it.unirc.pwm.pattern.factory.CorriereExp;

public class CorriereExpDAOFactory {
	private static CorriereExpDAO dao = null;
	  
	  private CorriereExpDAOFactory(){
	  }
	  
	  public static synchronized CorriereExpDAO getDAO() {
	    if ( dao == null ) {
	    	dao = new CorriereExpDAOSimpleImp();
	    }
	    return dao;
	  } 

}
