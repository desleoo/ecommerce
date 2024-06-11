package it.unirc.pwm.EntityMappingHB;

import java.util.Date;

public class CorriereExp  extends Spedizione { //extends per gestire l'eredietarietà JOINED

	private static final long serialVersionUID = 1L;
	private double prezzoExtra;
	
	public double getPrezzoExtra() {
		return prezzoExtra;
	}
	public void setPrezzoExtra(double prezzoExtra) {
		this.prezzoExtra = prezzoExtra;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "CorriereExp [prezzoExtra=" + prezzoExtra + "]";
	}
	public CorriereExp(double prezzoExtra) {
		super();
		this.prezzoExtra = prezzoExtra;
	}
	
	public CorriereExp(Date datapartenza, Date dataconsegna, Ordine ordine, double prezzoExtra) {
		this.setDatapartenza(datapartenza);
		this.setDataconsegna(dataconsegna);
		this.setOrdine(ordine);
		this.setPrezzoExtra(prezzoExtra);
	}
	
	public CorriereExp() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
}
