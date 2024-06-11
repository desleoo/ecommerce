package it.unirc.pwm.autenticazione;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ActionContext;


public class Logout extends ActionSupport implements SessionAware{
	private static final long serialVersionUID = 1L;
	private Map<String,Object> session; 

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public String execute(){
		session = ActionContext.getContext().getSession();
		session.remove("account");
		session.remove("admin");
		session.clear();

		return SUCCESS;
	}
}
