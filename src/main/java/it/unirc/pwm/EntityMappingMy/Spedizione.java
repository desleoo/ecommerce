package it.unirc.pwm.EntityMappingMy;

import java.util.Date;

public class Spedizione {
	private int idordine;//si porta dietro idordine poichè c'è l'id esterno -> ONE TO ONE CLASSICA
	private Ordine ordine;//ha un riferimento all'ordine -> ONE TO ONE CLASSICA
	private String nomecorriere;
	private Date datapartenza;
	private Date dataconsegna;
	
	public int getIdordine() {
		return idordine;
	}
	public void setIdordine(int idordine) {
		this.idordine = idordine;
	}
	public String getNomecorriere() {
		return nomecorriere;
	}
	public void setNomecorriere(String nomecorriere) {
		this.nomecorriere = nomecorriere;
	}
	public Date getDatapartenza() {
		return datapartenza;
	}
	public void setDatapartenza(Date datapartenza) {
		this.datapartenza = datapartenza;
	}
	public Date getDataconsegna() {
		return dataconsegna;
	}
	public void setDataconsegna(Date dataconsegna) {
		this.dataconsegna = dataconsegna;
	}
	public Ordine getOrdine() {
		return ordine;
	}
	public void setOrdine(Ordine ordine) {
		this.ordine = ordine;
	}
	@Override
	public String toString() {
		return "Spedizione [idordine=" + idordine + ", nomecorriere=" + nomecorriere + ", datapartenza=" + datapartenza
				+ ", dataconsegna=" + dataconsegna + ", ordine=" + ordine + "]";
	}
	public Spedizione(int idordine, String nomecorriere, Date datapartenza, Date dataconsegna, Ordine ordine) {
		super();
		this.idordine = idordine;
		this.nomecorriere = nomecorriere;
		this.datapartenza = datapartenza;
		this.dataconsegna = dataconsegna;
		this.ordine = ordine;
	}
	public Spedizione() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
