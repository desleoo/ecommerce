package it.unirc.pwm.EntityMappingMy;

public class Indirizzo {
	private String citta;
	private String via;
	private String civico;
	private int cap;
	private String descrizione;
	
	public String getCitta() {
		return citta;
	}
	public void setCitta(String citta) {
		this.citta = citta;
	}
	public String getVia() {
		return via;
	}
	public void setVia(String via) {
		this.via = via;
	}
	public String getCivico() {
		return civico;
	}
	public void setCivico(String civico) {
		this.civico = civico;
	}
	public int getCap() {
		return cap;
	}
	public void setCap(int cap) {
		this.cap = cap;
	}
	public String getDescrizione() {
		return descrizione;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	@Override
	public String toString() {
		return "Indirizzo [citta=" + citta + ", via=" + via + ", civico=" + civico + ", cap=" + cap + ", descrizione="
				+ descrizione + "]";
	}
	public Indirizzo(String citta, String via, String civico, int cap, String descrizione) {
		super();
		this.citta = citta;
		this.via = via;
		this.civico = civico;
		this.cap = cap;
		this.descrizione = descrizione;
	}
	public Indirizzo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
