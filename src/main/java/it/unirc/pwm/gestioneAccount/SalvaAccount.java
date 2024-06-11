package it.unirc.pwm.gestioneAccount;

import java.util.Map;
import org.hibernate.HibernateException;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import it.unirc.pwm.EntityMappingHB.Account;
import it.unirc.pwm.pattern.factory.Account.AccountDAO;
import it.unirc.pwm.pattern.factory.Account.AccountDAOFactory;



public class SalvaAccount extends ActionSupport {

	private static final long serialVersionUID = 1L;
	private String username;
	private String password;
	private String ripetipassword;
	private Map<String,Object> session; 
	
	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
	
	public String getUsername() {
		return username;
	}


	public String getRipetipassword() {
		return ripetipassword;
	}

	public void setRipetipassword(String ripetipassword) {
		this.ripetipassword = ripetipassword;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String execute() throws Exception{
		AccountDAO aDAO=AccountDAOFactory.getDAO();
		try {
			Account account = new Account();
			session = ActionContext.getContext().getSession();
			Account a = (Account )session.get("account");
			account.setIdcliente(a.getIdcliente());
		    if(!username.equals("")){
		    	account.setUsername(username);
		    	}else{
		    		account.setUsername(a.getUsername());}
		    if(!password.equals("")){
		    	account.setPassword(password);
		    	}else{account.setPassword(a.getPassword());}
		    
		    if(aDAO.modificaAccount(account)) {
		    	session.remove("account");
		    	Account acc=aDAO.getAccount(account);
		    	session.put("account", acc);
				return SUCCESS;}
		    else {
		    	return INPUT;
		    }
		} catch (HibernateException e) {
			return null;
		}
	}
	
	public void validate() {
		
		session = ActionContext.getContext().getSession();
		Account a = (Account )session.get("account");
		
		if(username.length()==0) {//se l'utente non scrive nulla
			this.addFieldError(username, this.getText("username.required"));
		}
		if(!ripetipassword.equals(password)) {
			this.addFieldError(ripetipassword, this.getText("ripetipassword.required"));
		}
		
		if(username.equals(a.getUsername())) {//se l'utente usa lo stesso username che gi� possiede
			this.addFieldError(username, this.getText("username.equals"));
		}
		
		if(password.length()==0) {
			this.addFieldError(password, this.getText("password.required"));
		}
		
		if(password.equals(a.getPassword())) {//se l'utente usa lo stesso username che gi� possiede
			this.addFieldError(password, this.getText("password.equals"));
		}
	}
	

	}
	

