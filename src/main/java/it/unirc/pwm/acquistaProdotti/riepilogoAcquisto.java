package it.unirc.pwm.acquistaProdotti;


import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;



public class riepilogoAcquisto extends ActionSupport {

	
	private static final long serialVersionUID = 1L;

	 List<String> spedizioni = new ArrayList<String>();
	 List<String> pagamenti = new ArrayList<String>();

	 

	public List<String> getSpedizioni() {
		return spedizioni;
	}



	public void setSpedizioni(List<String> spedizioni) {
		this.spedizioni = spedizioni;
	}



	public List<String> getPagamenti() {
		return pagamenti;
	}



	public void setPagamenti(List<String> pagamenti) {
		this.pagamenti = pagamenti;
	}



	public static long getSerialversionuid() {
		return serialVersionUID;
	}



	public String execute()throws Exception {
		
		String s1="Spedizione Standard - gratuita";
		String s2="Spedizione Express - 10 euro";

		String p1="Contrassegno";
		String p2="Carta di credito";

		spedizioni.add(s1);
		spedizioni.add(s2);

		pagamenti.add(p1);
		pagamenti.add(p2);
		
				return SUCCESS;
			
	}
	
}
