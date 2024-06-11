package it.unirc.pwm.pattern.factory.Cartadicredito;

import java.util.Vector;

import it.unirc.pwm.EntityMappingHB.Cartadicredito;
import it.unirc.pwm.EntityMappingHB.Pagamento;


	public interface CartadicreditoDAO {
		public Cartadicredito getCartadicredito(Cartadicredito c);	
		public Vector<Cartadicredito> getCartedicredito();
		public boolean salvaCartadicredito(Pagamento c);
		public boolean eliminaCartadicredito(Cartadicredito c);
		public boolean modificaCartadicredito(Cartadicredito c);

		/*
		 * eventualmente inserire altri metodi per la gestione degli utenti
		 */
}


