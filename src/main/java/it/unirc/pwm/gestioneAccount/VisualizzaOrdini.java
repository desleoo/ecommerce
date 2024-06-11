package it.unirc.pwm.gestioneAccount;

import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import it.unirc.pwm.EntityMappingHB.Account;
import it.unirc.pwm.EntityMappingHB.Cliente;
import it.unirc.pwm.EntityMappingHB.Ordine;

import it.unirc.pwm.pattern.factory.Ordine.OrdineDAO;
import it.unirc.pwm.pattern.factory.Ordine.OrdineDAOFactory;

public class VisualizzaOrdini extends ActionSupport {
	private static final long serialVersionUID = 1L;
	
	private final static String TAG="VisualizzaOrdini.java";
	
	private  List<Ordine> ordini;
	private Map<String,Object> session; 

	
	public Map<String, Object> getSession() {
		return session;
	}


	public void setSession(Map<String, Object> session) {
		this.session = session;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	public List<Ordine> getOrdini() {
		return ordini;
	}


	public void setOrdini(List<Ordine> ordini) {
		this.ordini = ordini;
	}


	public String execute(){

		session = ActionContext.getContext().getSession();
		Account a = (Account )session.get("account");
		Cliente c = a.getCliente();
		

		OrdineDAO oDAO =OrdineDAOFactory.getDAO();
		ordini=oDAO.getOrdiniCliente(c.getIdcliente());
		return SUCCESS;
			}

}
