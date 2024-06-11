package it.unirc.pwm.pattern.factory.Cartadicredito;

public class CartadicreditoDAOFactory {
	private static CartadicreditoDAO dao = null;
	  
	  private CartadicreditoDAOFactory(){
	  }
	  
	  public static synchronized CartadicreditoDAO getDAO() {
	    if ( dao == null ) {
	    	dao = new CartadicreditoDAOSimpleImp();
	    }
	    return dao;
	  } 

}
