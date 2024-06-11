package it.unirc.pwm.pattern.factory;

import java.util.Vector;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import it.unirc.pwm.pattern.factory.utente.Utente;
import it.unirc.pwm.pattern.factory.utente.UtenteDAO;
import it.unirc.pwm.pattern.factory.utente.UtenteDAOFactory;

public class Test {
	public static void main(String[] args) {
		Logger l = LogManager.getLogger("Test");
		
		//Uso solo DAO
//		UtenteDAO utenteDao= new UtenteDAOSimpleImpl();
		
		//Uso DAO e Factory
		UtenteDAO utenteDao= UtenteDAOFactory.getDAO();
		
		Vector<Utente> elencoUtenti= new Vector<Utente>();
		elencoUtenti=utenteDao.getUtenti();
		for (Utente utente: elencoUtenti)
			l.info(utente);
	}

}
