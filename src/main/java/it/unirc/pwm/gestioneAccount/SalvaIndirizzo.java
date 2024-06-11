package it.unirc.pwm.gestioneAccount;

import java.util.Map;

import org.hibernate.HibernateException;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import it.unirc.pwm.EntityMappingHB.Account;
import it.unirc.pwm.EntityMappingHB.Cliente;
import it.unirc.pwm.pattern.factory.Account.AccountDAO;
import it.unirc.pwm.pattern.factory.Account.AccountDAOFactory;
import it.unirc.pwm.pattern.factory.Cliente.ClienteDAO;
import it.unirc.pwm.pattern.factory.Cliente.ClienteDAOFactory;

public class SalvaIndirizzo extends ActionSupport {
	private static final long serialVersionUID = 1L;
	private Cliente cliente;
	private Map<String,Object> session; 
	
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

		public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

		public String execute() throws Exception{
			ClienteDAO cDAO=ClienteDAOFactory.getDAO();
			try {
				session = ActionContext.getContext().getSession();
				Account a = (Account )session.get("account");
				Cliente c = a.getCliente();
				if(cliente.getIndirizzoCitta().equals("")) {
					return INPUT;
				}else {
					c.setIndirizzoCitta(cliente.getIndirizzoCitta());
				}
				if(cliente.getIndirizzoVia().equals("")) {
					return INPUT;
				}else {
					c.setIndirizzoVia(cliente.getIndirizzoVia());
				}
				if(cliente.getIndirizzoCivico().equals("")) {
					return INPUT;
				}else {
					c.setIndirizzoCivico(cliente.getIndirizzoCivico());
				}
				if(cliente.getIndirizzoCap().equals("")) {
					return INPUT;
				}else {
					c.setIndirizzoCap(cliente.getIndirizzoCap());
				}
				if(cliente.getIndirizzoDescrizione().equals("")) {
					return INPUT;
				}else {
		    	c.setIndirizzoDescrizione(cliente.getIndirizzoDescrizione());}
				if(cDAO.modificaCliente(cliente)) {
					return SUCCESS;
				} else {return INPUT;
				}
			} catch (HibernateException e) {
				return null;
			}
		}
		

		

	
}