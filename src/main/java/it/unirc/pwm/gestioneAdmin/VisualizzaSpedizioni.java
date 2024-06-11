package it.unirc.pwm.gestioneAdmin;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import it.unirc.pwm.EntityMappingHB.Spedizione;
import it.unirc.pwm.pattern.factory.Ordine.OrdineDAO;
import it.unirc.pwm.pattern.factory.Ordine.OrdineDAOFactory;
import it.unirc.pwm.pattern.factory.Spedizione.SpedizioneDAO;
import it.unirc.pwm.pattern.factory.Spedizione.SpedizioneDAOFactory;


public class VisualizzaSpedizioni extends ActionSupport{
	private static final long serialVersionUID = 1L;
	
	
	private  List<Spedizione> spedizioni;
	
	public List<Spedizione> getSpedizioni() {
		return spedizioni;
	}
	
	
	public void setSpedizioni(List<Spedizione> spedizioni) {
		this.spedizioni = spedizioni;
	}	
		
		public String execute(){
			SpedizioneDAO sDAO= SpedizioneDAOFactory.getDAO();
			spedizioni=sDAO.getSpedizioni();
			
			
			for (Spedizione sp : spedizioni) {
				System.out.println(sp.toString());
			}
			return SUCCESS;
				}
	}
