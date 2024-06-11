package it.unirc.pwm.pattern.factory.Amministratore;

public class AmministratoreDAOFactory {
	private static AmministratoreDAO dao = null;
	  
	  private AmministratoreDAOFactory(){
	  }
	  
	  public static synchronized AmministratoreDAO getDAO() {
	    if ( dao == null ) {
	    	dao = new AmministratoreDAOSimpleImp();
	    }
	    return dao;
	  } 

}
