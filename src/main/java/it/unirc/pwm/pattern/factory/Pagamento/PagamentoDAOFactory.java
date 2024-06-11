package it.unirc.pwm.pattern.factory.Pagamento;

public class PagamentoDAOFactory {
	private static PagamentoDAO dao = null;
	  
	  private PagamentoDAOFactory(){
	  }
	  
	  public static synchronized PagamentoDAO getDAO() {
	    if ( dao == null ) {
	    	dao = new PagamentoDAOSimpleImp();
	    }
	    return dao;
	  } 

}
