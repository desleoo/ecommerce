package it.unirc.pwm.gestioneAccount;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
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


public class SalvaCliente extends ActionSupport {

	private static final long serialVersionUID = 1L;
	private Cliente cliente;
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

	//	@SuppressWarnings("null")
	//	public String execute() throws Exception{
	//		AccountDAO aDAO=AccountDAOFactory.getDAO();
	//		ClienteDAO cDAO=ClienteDAOFactory.getDAO();
	//		try {
	//			session = ActionContext.getContext().getSession();
	//			Account a = (Account )session.get("account");
	//			//Cliente c = (Cliente)session.get("cliente");
	//			//int idc = a.getCliente().getIdcliente();
	//			int idc=a.getIdcliente();
	//			String indcitta = a.getCliente().getIndirizzoCitta();
	//			String indvia= a.getCliente().getIndirizzoVia();
	//			String indciv= a.getCliente().getIndirizzoCivico();
	//			String desc= a.getCliente().getIndirizzoDescrizione();
	//			
	//			Integer cap= null;
	//			
	//			if(a.getCliente().getIndirizzoCap()==null) {
	//				
	//
	//			} else {
	//				cap = a.getCliente().getIndirizzoCap();
	//				}
	//	    	cliente.setIdcliente(idc);
	//	    	cliente.setIndirizzoCitta(indcitta);
	//	    	cliente.setIndirizzoVia(indvia);
	//	    	cliente.setIndirizzoCivico(indciv);
	//	    	cliente.setIndirizzoDescrizione(desc);
	//	    	cliente.setIndirizzoCap(cap);
	//	    	
	//	    	if(cliente.getNome().equals("")) {
	//	    		cliente.setNome(a.getCliente().getNome());
	//	    	}
	//	    	if(cliente.getCognome().equals("")) {
	//	    		cliente.setCognome(a.getCliente().getCognome());
	//	    	}
	//	    	DateFormat dateFormat = new SimpleDateFormat("dd-mm-yyyy");  
	//            String datanascita = dateFormat.format(cliente.getDatanascita());  
	//	    	if(datanascita.equals("")) {
	//	    		cliente.setDatanascita(a.getCliente().getDatanascita());
	//	    	}
	//	    	
	//	    	String Telefono = Long.toString(cliente.getTelefono());
	//	    	if (Telefono.equals(null)) {
	//	    	    cliente.setTelefono(a.getCliente().getTelefono());
	//	    	}
	//	    	
	//	    	if(cliente.getEmail().equals("")) {
	//	    		cliente.setEmail(a.getCliente().getEmail());
	//	    	}
	//	    	
	//	    	
	//	    	if(cDAO.modificaCliente(cliente)) {
	//				session.remove("account");
	//		    	Account acc=aDAO.getAccount(a);
	//		    	session.put("account", acc);
	//				return SUCCESS;
	//		}
	//			else{
	//				return INPUT;}}
	//			catch (HibernateException e) {
	//		
	//			return null;
	//	   
	//			}	
	//	}

	public String execute() throws Exception{
		ClienteDAO cDAO=ClienteDAOFactory.getDAO();
		AccountDAO aDAO=AccountDAOFactory.getDAO();
		Cliente c= new Cliente();
		try {
			session = ActionContext.getContext().getSession();
			Account a = (Account )session.get("account");
			c =	a.getCliente();

			if(cliente.getNome().equals("")) {
				c.setNome(a.getCliente().getNome());
			} else {
			c.setNome(cliente.getNome());}

			if(cliente.getCognome().equals("")) {
				c.setCognome(a.getCliente().getCognome());
			} else {
			c.setCognome(cliente.getCognome());}

			if(cliente.getEmail().equals("")) {
				c.setEmail(a.getCliente().getEmail());
			}else {
			c.setEmail(cliente.getEmail());}

			//String Telefono = Long.toString(cliente.getTelefono());
			if (cliente.getTelefono()==0) {
				 c.setTelefono(a.getCliente().getTelefono());
			}else {
				c.setTelefono(cliente.getTelefono());
			}

			if(cliente.getDatanascita().equals("")) {
				c.setDatanascita(a.getCliente().getDatanascita());
			}else {
			c.setDatanascita(cliente.getDatanascita()); } 
			

			
			if(cDAO.modificaCliente(c)) {
				
				session.remove("account");
				Account acc=aDAO.getAccount(a);
				session.put("account", acc);
				
				
				return SUCCESS;
			}
			else {
				return INPUT;
			}
		}
		catch (Exception e) {
			return INPUT;

		}

	}
}
