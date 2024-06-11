package it.unirc.pwm.gestioneAdmin;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import it.unirc.pwm.EntityMappingHB.Cliente;
import it.unirc.pwm.pattern.factory.Cliente.ClienteDAO;
import it.unirc.pwm.pattern.factory.Cliente.ClienteDAOFactory;

public class VisualizzaClienti extends ActionSupport{
	private static final long serialVersionUID = 1L;
	private  List<Cliente> clienti;
	
	public List<Cliente> getClienti() {
		return clienti;
	}
	public void setClienti(List<Cliente> clienti) {
		this.clienti = clienti;
	}
	
	public String execute(){
		ClienteDAO cDAO = ClienteDAOFactory.getDAO();
		clienti=cDAO.getClienti();
		return SUCCESS;
			}
}