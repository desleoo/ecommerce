package it.unirc.pwm.pattern.factory.ImmagineProdotto;

public class ImmagineProdottoDAOFactory {
	private static ImmagineProdottoDAO dao = null;
	  
	  private ImmagineProdottoDAOFactory(){
	  }
	  
	  public static synchronized ImmagineProdottoDAO  getDAO() {
	    if ( dao == null ) {
	    	dao = new ImmagineProdottoDAOSimpleImp();
	    }
	    return dao;
	  } 

}

