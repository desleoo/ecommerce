package it.unirc.pwm.pattern.factory.Prodotto;

public class ProdottoDAOFactory {
		private static ProdottoDAO dao = null;
		  
		  private ProdottoDAOFactory(){
		  }
		  
		  public static synchronized ProdottoDAO getDAO() {
		    if ( dao == null ) {
		    	dao = new ProdottoDAOSimpleImp();
		    }
		    return dao;
		  } 
}
