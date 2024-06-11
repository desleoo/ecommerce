package it.unirc.pwm.acquistaProdotti;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import it.unirc.pwm.EntityMappingHB.Prodotto;
import it.unirc.pwm.pattern.factory.Prodotto.ProdottoDAO;
import it.unirc.pwm.pattern.factory.Prodotto.ProdottoDAOFactory;


public class VisualizzaP extends ActionSupport{
	private static final long serialVersionUID = 1L;
	private  List<Prodotto> prodotti;
	
	public String execute(){
		ProdottoDAO pDAO=ProdottoDAOFactory.getDAO();
		prodotti=pDAO.getProdotti();
		
		
			return SUCCESS;
		}
	

	public  List<Prodotto> getProdotti() {
		return prodotti;
	}

	public  void setProdotti(List<Prodotto> prodotti) {
		this.prodotti = prodotti;
	}
	
	
	
}
