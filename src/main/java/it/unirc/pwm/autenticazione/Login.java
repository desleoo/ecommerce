package it.unirc.pwm.autenticazione;

import java.util.ArrayList;
import java.util.Map;
import javax.servlet.ServletInputStream;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.struts2.interceptor.SessionAware;
import org.hibernate.HibernateException;
import org.json.simple.JSONObject;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ActionContext;
import it.unirc.pwm.EntityMappingHB.Account;
import it.unirc.pwm.EntityMappingHB.Amministratore;
import it.unirc.pwm.EntityMappingHB.Cliente;
import it.unirc.pwm.pattern.factory.Account.*;


public class Login extends ActionSupport implements SessionAware {

	private static final long serialVersionUID = 1L;
	private String username;
	private String password;
	private Map<String,Object> session; 
	//private ArrayList<Account> resultAccount;
	private ArrayList<Cliente> resultCliente;
	private ArrayList<Boolean> admin;

	

	
	

	

//	public ArrayList<Account> getResultAccount() {
//		return resultAccount;
//	}
//
//	public void setResultAccount(ArrayList<Account> resultAccount) {
//		this.resultAccount = resultAccount;
//	}

	

	

	public ArrayList<Boolean> getAdmin() {
		return admin;
	}

	public void setAdmin(ArrayList<Boolean> admin) {
		this.admin = admin;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public ArrayList<Cliente> getResultCliente() {
		return resultCliente;
	}

	public void setResultCliente(ArrayList<Cliente> resultCliente) {
		this.resultCliente = resultCliente;
	}

	public String getUsername() {
		return username;
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
	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public String execute()throws Exception {

		AccountDAO aDAO =  AccountDAOFactory.getDAO();
		
		Account account = new Account();
		account.setUsername(getUsername());
		account.setPassword(getPassword());
		try {
			Account a = aDAO.getAccount(account);
			if(a==null) {

				return INPUT;
			}else {
				session = ActionContext.getContext().getSession();
				session.put("account", a);
				//session.put("cliente", a.getCliente());
				return SUCCESS;
			}
		} catch (HibernateException e) {
			return null;
		}
	}

	
	
	public String mobile() {
		admin=new ArrayList<Boolean>();
		boolean adminB=false;
		resultCliente=new ArrayList<Cliente>();

		AccountDAO aDAO =  AccountDAOFactory.getDAO();
		Account account = new Account();
		
		Cliente cliente = new Cliente();
		Amministratore amministratore=new Amministratore();
		
		account.setUsername(getUsername());
		account.setPassword(getPassword());
		try {
			Account a = aDAO.getAccount(account);
			if(a==null) {
				return INPUT;
			}else {
				cliente=a.getCliente();
				amministratore=a.getCliente().getAmministratore();
				resultCliente.add(cliente);
				if(amministratore!=null) {
					adminB=true;
					admin.add(adminB);
					
				}else {
					return SUCCESS;
				}
				return SUCCESS;

			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;

		}
	
	//Validazione (con Workflow) - ESEMPIO 4 - NON FUNZIONA PERCHè
		public void validate(){
			System.out.println(	"Validazione (con Workflow) - ESEMPIO 4");
			//USERNAME
			if( getUsername().length()==0){
				this.addFieldError("username", "Inserire Username");
			}
			
			//PASSWORD
			if( getPassword().length()==0){
				this.addFieldError("password", "Inserire password");
			}
			
		}
	
}
