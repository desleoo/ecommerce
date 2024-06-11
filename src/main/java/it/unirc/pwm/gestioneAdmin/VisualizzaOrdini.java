package it.unirc.pwm.gestioneAdmin;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import it.unirc.pwm.EntityMappingHB.Ordine;
import it.unirc.pwm.pattern.factory.Ordine.OrdineDAO;
import it.unirc.pwm.pattern.factory.Ordine.OrdineDAOFactory;



public class VisualizzaOrdini extends ActionSupport{
	private static final long serialVersionUID = 1L;
	private  List<Ordine> ordini;
	
	
	public List<Ordine> getOrdini() {
		return ordini;
	}

	public void setOrdini(List<Ordine> ordini) {
		this.ordini = ordini;
	}

	public String execute(){
		OrdineDAO oDAO= OrdineDAOFactory.getDAO();
		ordini=oDAO.getOrdini();
		return SUCCESS;
			}
}


