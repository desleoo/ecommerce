package it.unirc.pwm.EntityMappingHB;
// Generated 6 ott 2022, 11:41:34 by Hibernate Tools 5.5.7.Final

import java.util.Date;

/**
 * Contrassegno generated by hbm2java
 */
public class Contrassegno extends Pagamento{ //extends per gestire l'eredietariet� TABLE PER CLASS

	private String firmatario;

	public String getFirmatario() {
		return firmatario;
	}

	public void setFirmatario(String firmatario) {
		this.firmatario = firmatario;
	}

	@Override
	public String toString() {
		return "Contrassegno [firmatario=" + firmatario + "]";
	}

	public Contrassegno(int idordine, Date datapagamento, double importo, Ordine ordine, String firmatario) {
		super(idordine, datapagamento, importo, ordine);
		this.firmatario = firmatario;
	}

	public Contrassegno() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Contrassegno(int idordine, Date datapagamento, double importo, Ordine ordine) {
		super(idordine, datapagamento, importo, ordine);
		// TODO Auto-generated constructor stub
	}
	
	
	
}