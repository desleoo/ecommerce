package it.unirc.pwm.pattern.factory.Contrassegno;

import java.util.Vector;

import it.unirc.pwm.EntityMappingHB.Contrassegno;
import it.unirc.pwm.EntityMappingHB.Pagamento;


	public interface ContrassegnoDAO {
		public Contrassegno getContrassegno(Contrassegno c);	
		public Vector<Contrassegno> getContrassegni();
		public boolean salvaContrassegno(Pagamento c);
		public boolean eliminaContrassegno(Contrassegno c);
		public boolean modificaContrassegno(Contrassegno c);

		/*
		 * eventualmente inserire altri metodi per la gestione degli utenti
		 */
}

