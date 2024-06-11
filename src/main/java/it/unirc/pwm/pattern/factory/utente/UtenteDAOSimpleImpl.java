package it.unirc.pwm.pattern.factory.utente;

import java.util.Vector;

public class UtenteDAOSimpleImpl implements UtenteDAO{
	
	//modifico istanziazione del DAO
	protected UtenteDAOSimpleImpl(){};
	
	//Implementazione fittizia
	public Utente getUtente(Utente u){
		//inserimento di valori fittizi
		u.setId(u.getId());
		u.setNome("x");
		u.setLavoro("y");
		return u;	
	}
	public Vector<Utente> getUtenti(){
		Vector<Utente> vu = new Vector<Utente>();
		vu.add(new Utente());		
		return vu;
	}
	public boolean salvaUtente(Utente u){
		return true;
	}
	public boolean eliminaUtente(Utente u){
		return true;
	}
}
