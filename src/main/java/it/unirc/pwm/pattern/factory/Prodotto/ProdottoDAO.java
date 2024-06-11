package it.unirc.pwm.pattern.factory.Prodotto;

import java.util.List;
import java.util.Vector;

import it.unirc.pwm.EntityMappingHB.Prodotto;

	public interface ProdottoDAO {
		public Prodotto getProdotto(Prodotto p);	
		public List<Prodotto> getProdotti();
		public boolean salvaProdotto(Prodotto p);
		public boolean eliminaProdotto(Prodotto p);
		public boolean modificaProdotto(Prodotto p);


}
