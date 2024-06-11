package it.unirc.pwm.pattern.factory.utente;

import java.util.Vector;

public interface UtenteDAO {
	public Utente getUtente(Utente u);	
	public Vector<Utente> getUtenti();
	public boolean salvaUtente(Utente u);
	public boolean eliminaUtente(Utente u);
	/*
	 * eventualmente inserire altri metodi per la gestione degli utenti
	 */
}
