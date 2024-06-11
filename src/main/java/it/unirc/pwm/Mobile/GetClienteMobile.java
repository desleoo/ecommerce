package it.unirc.pwm.Mobile;

import java.util.ArrayList;

import com.opensymphony.xwork2.ActionSupport;

import it.unirc.pwm.EntityMappingHB.Cliente;
import it.unirc.pwm.pattern.factory.Cliente.ClienteDAO;
import it.unirc.pwm.pattern.factory.Cliente.ClienteDAOFactory;

public class GetClienteMobile extends ActionSupport{

	private static final long serialVersionUID = 1L;
	private ArrayList<Cliente> resultCliente;
	private int idcliente;
	
	
	public ArrayList<Cliente> getResultCliente() {
		return resultCliente;
	}
	public void setResultCliente(ArrayList<Cliente> resultCliente) {
		this.resultCliente = resultCliente;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	public int getIdcliente() {
		return idcliente;
	}
	public void setIdcliente(int idcliente) {
		this.idcliente = idcliente;
	}
	
	
	public String execute()throws Exception {
		resultCliente=new ArrayList<Cliente>();

		ClienteDAO cDAO =  ClienteDAOFactory.getDAO();
		Cliente cTemp = new Cliente();
		cTemp.setIdcliente(idcliente);
		
			try {
			Cliente cliente = cDAO.getCliente(cTemp);

			if(cliente == null) {
				return INPUT;
			}else {
				resultCliente.add(cliente);
				return SUCCESS;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;	
}
}