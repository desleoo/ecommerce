package it.unirc.pwm.pattern.factory.Cliente;


public class ClienteDAOFactory {
	private static ClienteDAO dao = null;
	  
	  private ClienteDAOFactory(){
	  }
	  
	  public static synchronized ClienteDAO getDAO() {
	    if ( dao == null ) {
	    	dao = new ClienteDAOSimpleImp();
	    }
	    return dao;
	  } 

}
