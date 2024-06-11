package it.unirc.pwm.pattern.factory.utente;

public class UtenteDAOFactory {

  private static UtenteDAO dao = null;
  
  private UtenteDAOFactory(){
  }
  
  public static synchronized UtenteDAO getDAO() {
    if ( dao == null ) {
    	dao = new UtenteDAOSimpleImpl();
    }
    return dao;
  } 
}