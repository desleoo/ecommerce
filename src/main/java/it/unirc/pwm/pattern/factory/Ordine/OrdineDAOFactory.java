package it.unirc.pwm.pattern.factory.Ordine;


public class OrdineDAOFactory {
	private static OrdineDAO dao = null;
	  
	  private OrdineDAOFactory(){
	  }
	  
	  public static synchronized OrdineDAO getDAO() {
	    if ( dao == null ) {
	    	dao = new OrdineDAOSimpleImp();
	    }
	    return dao;
	  } 
}
