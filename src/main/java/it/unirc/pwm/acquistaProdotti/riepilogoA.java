package it.unirc.pwm.acquistaProdotti;


import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;



public class riepilogoA extends ActionSupport {

	
	private static final long serialVersionUID = 1L;
	private int idprodotto;
	private Map<String,Object> session; 

	
	 


	public Map<String, Object> getSession() {
		return session;
	}



	public void setSession(Map<String, Object> session) {
		this.session = session;
	}



	public int getIdprodotto() {
		return idprodotto;
	}



	public void setIdprodotto(int idprodotto) {
		this.idprodotto = idprodotto;
	}



	public static long getSerialversionuid() {
		return serialVersionUID;
	}



	public String execute()throws Exception {
		session = ActionContext.getContext().getSession();
		session.put("idprodotto", idprodotto);
			return SUCCESS;
			
	}
	
}
