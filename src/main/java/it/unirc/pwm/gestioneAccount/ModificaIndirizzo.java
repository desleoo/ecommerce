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

public class ModificaIndirizzo extends ActionSupport {
	private static final String TAG = "ModificaIndirizzo.java";

	private static final long serialVersionUID = 1L;
	private String indirizzoCitta;
	private String indirizzoVia;
	private String indirizzoCivico;
	private Integer indirizzoCap;
	private String indirizzoDescrizione;
	private Map<String,Object> session;

		public String getIndirizzoCitta() {
		return indirizzoCitta;
	}

	public void setIndirizzoCitta(String indirizzoCitta) {
		this.indirizzoCitta = indirizzoCitta;
	}

	public String getIndirizzoVia() {
		return indirizzoVia;
	}

	public void setIndirizzoVia(String indirizzoVia) {
		this.indirizzoVia = indirizzoVia;
	}

	public String getIndirizzoCivico() {
		return indirizzoCivico;
	}

	public void setIndirizzoCivico(String indirizzoCivico) {
		this.indirizzoCivico = indirizzoCivico;
	}

	public Integer getIndirizzoCap() {
		return indirizzoCap;
	}

	public void setIndirizzoCap(Integer indirizzoCap) {
		this.indirizzoCap = indirizzoCap;
	}

	public String getIndirizzoDescrizione() {
		return indirizzoDescrizione;
	}

	public void setIndirizzoDescrizione(String indirizzoDescrizione) {
		this.indirizzoDescrizione = indirizzoDescrizione;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public String execute() throws Exception{
		
		
		
		System.out.println(TAG+": "+indirizzoCitta+": "+indirizzoVia+": "+indirizzoCap+": "+ indirizzoCivico+": "+indirizzoDescrizione);
		ClienteDAO cDAO=ClienteDAOFactory.getDAO();
		try {
			session = ActionContext.getContext().getSession();
			Account a = (Account)session.get("account");
			Cliente cliente = a.getCliente();
			cliente.setIdcliente(a.getIdcliente());
			
			if(indirizzoCitta.equals("")) {
	    		cliente.setIndirizzoCitta(a.getCliente().getIndirizzoCitta());
	    	}else {cliente.setIndirizzoCitta(indirizzoCitta);}
			
			if(indirizzoVia.equals("")) {
	    		cliente.setIndirizzoVia(a.getCliente().getIndirizzoVia());
	    	}else {cliente.setIndirizzoVia(indirizzoVia);}
			
			if(indirizzoCivico.equals("")) {
	    		cliente.setIndirizzoCivico(a.getCliente().getIndirizzoCivico());
	    	}else {cliente.setIndirizzoCivico(indirizzoCivico);}
			
			
			if(indirizzoCap==null) {
	    		cliente.setIndirizzoCap(a.getCliente().getIndirizzoCap());
	    	}else {cliente.setIndirizzoCap(indirizzoCap);}
			
			if(indirizzoDescrizione.equals("")) {
	    		cliente.setIndirizzoDescrizione(a.getCliente().getIndirizzoDescrizione());
	    	}else {cliente.setIndirizzoDescrizione(indirizzoDescrizione);}
			
		    if(cDAO.modificaCliente(cliente)) {
				return SUCCESS;}
		    else {
		    	return INPUT;
		    }
		} catch (HibernateException e) {
			return null;
		}
	}
	
	//Esempio 8 - Resource Bundles - generare un input non valido poi rinominarlo in base alla lingua inglese
			public void validate(){
				
				System.out.println(TAG+": "+indirizzoCitta+": "+indirizzoVia+": "+indirizzoCap+": "+ indirizzoCivico+": "+indirizzoDescrizione);

				if(getIndirizzoCitta().length()==0){
					this.addFieldError("cliente.indirizzoCitta", this.getText("citta.required"));
				}
				
				if(getIndirizzoVia().length()==0){
					this.addFieldError("cliente.indirizzoVia", getText("via.required"));
				}
				
				if(getIndirizzoCap()==null){
					this.addFieldError("cliente.indirizzoCap", getText("cap.required"));
				}
					
			}

}
