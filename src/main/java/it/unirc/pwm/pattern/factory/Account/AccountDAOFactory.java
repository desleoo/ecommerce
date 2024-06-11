package it.unirc.pwm.pattern.factory.Account;

public class AccountDAOFactory {
	private static AccountDAO dao = null;
	  
	  private AccountDAOFactory(){
	  }
	  
	  public static synchronized AccountDAO  getDAO() {
	    if ( dao == null ) {
	    	dao = new AccountDAOSimpleImp();
	    }
	    return dao;
	  } 

}

