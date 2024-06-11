package it.unirc.pwm.autenticazione;
 
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import it.unirc.pwm.EntityMappingHB.Account;
import it.unirc.pwm.EntityMappingHB.Amministratore;
import it.unirc.pwm.EntityMappingHB.Cliente;
import it.unirc.pwm.autenticazione.util.AccountAware;

public class Autenticato extends ActionSupport implements AccountAware, Action {

	private static final long serialVersionUID = 1L;

	private Account account;
	private	Cliente cliente;
	private Amministratore amministratore;
	private Map<String,Object> session; 

	
	
	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Amministratore getAmministratore() {
		return amministratore;
	}

	public void setAmministratore(Amministratore amministratore) {
		this.amministratore = amministratore;
	}

	public String execute(){
		Cliente cliente = account.getCliente();
		Amministratore am=new Amministratore();
		if(cliente.getAmministratore()!=null) {
			am=cliente.getAmministratore();
			session = ActionContext.getContext().getSession();
			session.put("admin", am);
			return SUCCESS;
		} else {
			return SUCCESS;
		}
	}
	
	public Account getAccount(){
		return account;
	}
	
@Override
	public void setAccount(Account account) {
		this.account=account;
		
	}

}
