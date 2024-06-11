package it.unirc.pwm.pattern.factory.CorriereExp;

import java.util.Vector;

import it.unirc.pwm.EntityMappingHB.CorriereExp;
import it.unirc.pwm.EntityMappingHB.Spedizione;

	public interface CorriereExpDAO {
		public CorriereExp getCorriere(CorriereExp c);	
		public Vector<CorriereExp> getCorrieriExp();
		public boolean salvaCorriereExp(Spedizione c);
		public boolean eliminaCorriereExp(CorriereExp c);
		public boolean modificaCorriereExp(CorriereExp c);

	
}
