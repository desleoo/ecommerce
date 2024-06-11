package it.unirc.pwm.pattern.factory.Cliente;

import java.util.List;
import java.util.Vector;

import it.unirc.pwm.EntityMappingHB.Cliente;



	public interface ClienteDAO {
		public Cliente getCliente(Cliente c);	
		public List<Cliente> getClienti();
		public boolean salvaCliente(Cliente c);
		public boolean eliminaCliente(Cliente c);
		public boolean modificaCliente(Cliente c);

		/*
		 * eventualmente inserire altri metodi per la gestione degli utenti
		 */
}
