package it.unirc.pwm.Mobile;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.opensymphony.xwork2.ActionSupport;


import it.unirc.pwm.EntityMappingHB.Ordine;
import it.unirc.pwm.EntityMappingHB.Prodotto;
import it.unirc.pwm.pattern.factory.Ordine.OrdineDAO;
import it.unirc.pwm.pattern.factory.Ordine.OrdineDAOFactory;

public class GetOrdiniCliente extends ActionSupport{
	private int idcliente;
	private  List<Ordine> ordini;
	private  List<Prodotto> prodotti;
	
	

	
	
	
	
public List<Prodotto> getProdotti() {
		return prodotti;
	}





	public void setProdotti(List<Prodotto> prodotti) {
		this.prodotti = prodotti;
	}





public List<Ordine> getOrdini() {
		return ordini;
	}





	public void setOrdini(List<Ordine> ordini) {
		this.ordini = ordini;
	}





public int getIdcliente() {
		return idcliente;
	}





	public void setIdcliente(int idcliente) {
		this.idcliente = idcliente;
	}





public String execute(){
	
		Set<Prodotto> prodottosSet = new HashSet<Prodotto> (); 
		prodotti=new ArrayList<Prodotto>(); 
	
		OrdineDAO oDAO =OrdineDAOFactory.getDAO();
		ordini=oDAO.getOrdiniCliente(idcliente);
		for (Ordine o: ordini) {
			prodottosSet=o.getProdottos();
	        List<Prodotto> prodottitemp = new ArrayList<Prodotto>(prodottosSet); 
	        for(Prodotto pr: prodottitemp) {
	        	prodotti.add(pr);
	        }
		}
		
		return SUCCESS;
		
		
			}
	
	
}
