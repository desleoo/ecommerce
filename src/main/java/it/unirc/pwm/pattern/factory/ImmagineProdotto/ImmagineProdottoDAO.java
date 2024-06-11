package it.unirc.pwm.pattern.factory.ImmagineProdotto;

import java.util.List;
import java.util.Vector;

import it.unirc.pwm.EntityMappingHB.ImmagineProdotto;


	public interface ImmagineProdottoDAO {
		
		public boolean salvaImmagineProdotto (ImmagineProdotto imgT);
		public boolean EliminaImmagineProdotto(ImmagineProdotto imgT);
		public boolean modificaImmagineTitolo(ImmagineProdotto imgT);
		

		/*
		 * eventualmente inserire altri metodi per la gestione degli utenti
		 */
}



