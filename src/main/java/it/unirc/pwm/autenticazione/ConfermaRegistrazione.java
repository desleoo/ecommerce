package it.unirc.pwm.autenticazione;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.hibernate.HibernateException;

import com.opensymphony.xwork2.ActionSupport;

import it.unirc.pwm.EntityMappingHB.Account;
import it.unirc.pwm.EntityMappingHB.Cliente;
import it.unirc.pwm.pattern.factory.Account.AccountDAO;
import it.unirc.pwm.pattern.factory.Account.AccountDAOFactory;
import it.unirc.pwm.pattern.factory.Cliente.ClienteDAO;
import it.unirc.pwm.pattern.factory.Cliente.ClienteDAOFactory;
import it.unirc.pwm.utils.DateManager;

public class ConfermaRegistrazione extends ActionSupport {
	private static final long serialVersionUID = 1L;
	
	private Account account;
	private Cliente cliente;

	public String execute() throws Exception{
		ClienteDAO cDAO=ClienteDAOFactory.getDAO();
		AccountDAO aDAO=AccountDAOFactory.getDAO();
		try {
			account.setCliente(cliente);
			if(cDAO.salvaCliente(cliente)&&(aDAO.salvaAccount(account))) {
				return SUCCESS;
			} else {return INPUT;
			}
		} catch (HibernateException e) {
			return null;
		}
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	
	//ERRORI E AVVISI, ESEMPIO 6
	public void validate(){
		
		System.out.println("ERRORI E AVVISI, ESEMPIO 6");
		//USERNAME
		if( account.getUsername().length()==0){
			this.addFieldError("username", "Inserire Username.");
		}
		
		if( account.getUsername().length()<4){
			this.addFieldError("username", "Lo username deve contenere almeno 4 caratteri.");
		}
		
		
		//PASSWORD
		//if( account.getPassword().length()==0){
		//	this.addFieldError("password", "Inserire password");
		//}
		
		//if(account.getPassword().length()<6){
		//	this.addFieldError("password", "La password deve contenere almeno 6 caratteri.");
		//}
		//NOME
		if( cliente.getNome().length()==0){
			this.addFieldError("nome", "Inserire il tuo nome.");
		}
		
		//COGNOME
		if( cliente.getCognome().length()==0){
			this.addFieldError("cognome", "Inserire il tuo cognome.");
		}	
		//DATA DI NASCITA
//		Date datanascitain=(Date) cliente.getDatanascita();
//		DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");
//		String datanascitaSTR = dateFormat.format(datanascitain);  
		
//		boolean d=false;
//		d=DateManager.confrontoDate(datanascitaSTR);
//		
//		if( d=true){
//			this.addFieldError("datanascita", "inserire una data di nascita precedente ad oggi.");
//		}
//		
//		if(datanascitain==null){
//			this.addFieldError("datanascita", "inserire una data di nascita.");
//		}
		
		//TELEFONO
		if(cliente.getTelefono()==0){
			this.addActionError(getText("telefono",  "Inserire il tuo numero di telefono"));
		}
		
		if((cliente.getTelefono()<8)){
			this.addActionError(getText("telefono",  "il numero di telefono deve contenere almeno 8 cifre"));
		}
		
		//EMAIL
//		if(cliente.getEmail().length()==0){
//			this.addActionError(getText("email",  "inserire il tuo indirizzo email."));
//		}
		
	}
	
}

	