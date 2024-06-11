package it.unirc.pwm.pattern.factory.Ordine;

import java.util.List;


import it.unirc.pwm.EntityMappingHB.Ordine;


	public interface OrdineDAO {
		public Ordine getOrdine(Ordine o);	
		public List<Ordine> getOrdini();
		public List<Ordine> getOrdiniCliente(int c);
		public boolean salvaOrdine(Ordine o);
		public boolean eliminaOrdine(Ordine o);
		public boolean modificaOrdine(Ordine o);


}
