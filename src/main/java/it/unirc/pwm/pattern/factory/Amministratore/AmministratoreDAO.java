package it.unirc.pwm.pattern.factory.Amministratore;

import java.util.List;
import java.util.Vector;

import it.unirc.pwm.EntityMappingHB.Amministratore;

	public interface AmministratoreDAO {
		public Amministratore getAmministratore(Amministratore a);	
		public List<Amministratore> getAmministratori();
		public boolean salvaAmministratore(Amministratore a);
		public boolean eliminaAmministratore(Amministratore a);
		public boolean modificaAmministratore(Amministratore a);

		/*
		 * eventualmente inserire altri metodi per la gestione degli utenti
		 */
}

