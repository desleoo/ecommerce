package it.unirc.pwm.pattern.factory.Pagamento;

import java.util.Vector;

import it.unirc.pwm.EntityMappingHB.Pagamento;

	public interface PagamentoDAO {
		public Pagamento getPagamento(Pagamento p);	
		public Vector<Pagamento> getPagamenti();
		public boolean salvaPagamento(Pagamento p);
		public boolean eliminaPagamento(Pagamento p);
		public boolean modificaPagamento(Pagamento p);


}
