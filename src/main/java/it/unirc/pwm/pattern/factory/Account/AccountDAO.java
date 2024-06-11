package it.unirc.pwm.pattern.factory.Account;

import java.util.Vector;

import it.unirc.pwm.EntityMappingHB.Account;


	public interface AccountDAO {
		public Account getAccount(Account a);	
		public Vector<Account> getAccounts();
		public boolean salvaAccount(Account a);
		public boolean eliminaAccount(Account a);
		public boolean modificaAccount(Account a);

		/*
		 * eventualmente inserire altri metodi per la gestione degli utenti
		 */
}



