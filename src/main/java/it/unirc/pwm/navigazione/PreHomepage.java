package it.unirc.pwm.navigazione;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import it.unirc.pwm.EntityMappingHB.Account;
import it.unirc.pwm.EntityMappingHB.Amministratore;
import it.unirc.pwm.EntityMappingHB.Cliente;
import it.unirc.pwm.hibernate.util.HibernateUtil;
import it.unirc.pwm.pattern.factory.Account.AccountDAO;
import it.unirc.pwm.pattern.factory.Account.AccountDAOFactory;

import it.unirc.pwm.pattern.factory.Amministratore.AmministratoreDAO;
import it.unirc.pwm.pattern.factory.Amministratore.AmministratoreDAOFactory;


public class PreHomepage extends ActionSupport{
	
	private List<Amministratore> aList;
	
	
	public String execute()throws Exception {

		
		
				return SUCCESS;
			
}}
