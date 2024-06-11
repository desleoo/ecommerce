package it.unirc.pwm.pattern.factory.Contrassegno;

public class ContrassegnoDAOFactory {
	private static ContrassegnoDAO dao = null;
	  
	  private ContrassegnoDAOFactory(){
	  }
	  
	  public static synchronized ContrassegnoDAO  getDAO() {
	    if ( dao == null ) {
	    	dao = new ContrassegnoDAOSimpleImp();
	    }
	    return dao;
	  } 

}
