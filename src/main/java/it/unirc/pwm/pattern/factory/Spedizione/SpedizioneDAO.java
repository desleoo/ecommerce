package it.unirc.pwm.pattern.factory.Spedizione;

import java.util.List;
import java.util.Vector;

import it.unirc.pwm.EntityMappingHB.Spedizione;

	public interface SpedizioneDAO {
		public Spedizione getSpedizione(Spedizione s);	
		public List<Spedizione> getSpedizioni();
		public boolean salvaSpedizione(Spedizione s);
		public boolean eliminaSpedizione(Spedizione s);
		public boolean modificaSpedizione(Spedizione s);

}
