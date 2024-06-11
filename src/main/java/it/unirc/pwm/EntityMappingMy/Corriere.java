package it.unirc.pwm.EntityMappingMy;

import java.util.Date;


public class Corriere extends Spedizione{ //extends per l'eredietarietà
	
	private int spesaspedizione;
	private Date dataspedizione;
	private Date dataconsegna;
	
	public int getSpesaspedizione() {
		return spesaspedizione;
	}
	public void setSpesaspedizione(int spesaspedizione) {
		this.spesaspedizione = spesaspedizione;
	}
	public Date getDataspedizione() {
		return dataspedizione;
	}
	public void setDataspedizione(Date dataspedizione) {
		this.dataspedizione = dataspedizione;
	}
	public Date getDataconsegna() {
		return dataconsegna;
	}
	public void setDataconsegna(Date dataconsegna) {
		this.dataconsegna = dataconsegna;
	}
	@Override
	public String toString() {
		return "Corriere [spesaspedizione=" + spesaspedizione + ", dataspedizione=" + dataspedizione + ", dataconsegna="
				+ dataconsegna + "]";
	}
	public Corriere(int idordine, String nomecorriere, Date datapartenza, Date dataconsegna, Ordine ordine,
			int spesaspedizione, Date dataspedizione, Date dataconsegna2) {
		super(idordine, nomecorriere, datapartenza, dataconsegna, ordine);
		this.spesaspedizione = spesaspedizione;
		this.dataspedizione = dataspedizione;
		dataconsegna = dataconsegna2;
	}
	public Corriere() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Corriere(int idordine, String nomecorriere, Date datapartenza, Date dataconsegna, Ordine ordine) {
		super(idordine, nomecorriere, datapartenza, dataconsegna, ordine);
		// TODO Auto-generated constructor stub
	}
	
	
	
}
