package it.unirc.pwm.gestioneAdmin;

import org.hibernate.HibernateException;

import com.opensymphony.xwork2.ActionSupport;

import it.unirc.pwm.EntityMappingHB.Prodotto;
import it.unirc.pwm.pattern.factory.Prodotto.ProdottoDAO;
import it.unirc.pwm.pattern.factory.Prodotto.ProdottoDAOFactory;

public class VisualizzaInfoP extends ActionSupport{
	
	private static final long serialVersionUID = 1L;
	private int idprodotto;
	private Prodotto p;
	
	
	
	public Prodotto getP() {
		return p;
	}

	public void setP(Prodotto p) {
		this.p = p;
	}

	public int getIdprodotto() {
		return idprodotto;
	}

	public void setIdprodotto(int idprodotto) {
		this.idprodotto = idprodotto;
	}

	public String execute()throws Exception {
		ProdottoDAO pDAO =  ProdottoDAOFactory.getDAO();
		Prodotto prodotto=new Prodotto();
		prodotto.setIdprodotto(getIdprodotto());
		try {
			p = pDAO.getProdotto(prodotto);
			
			if(p==null) 
				return INPUT;
			
			else {
			
				return SUCCESS;
			}
		} catch (HibernateException e) {
			return null;
		}

	}
	
	
	
}
