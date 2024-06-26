package it.unirc.pwm.EntityMappingHB;
// Generated 22 mar 2022, 17:25:01 by Hibernate Tools 5.5.7.Final

import java.util.Date;

/**
 * Corriere generated by hbm2java
 */
public class Corriere implements java.io.Serializable {

	private int idordine;
	private Spedizione spedizione;
	private int spesaspedizione;
	private Date dataspedizione;
	private Date dataconsegna;

	public Corriere() {
	}

	public Corriere(Spedizione spedizione, int spesaspedizione, Date dataspedizione, Date dataconsegna) {
		this.spedizione = spedizione;
		this.spesaspedizione = spesaspedizione;
		this.dataspedizione = dataspedizione;
		this.dataconsegna = dataconsegna;
	}

	public int getIdordine() {
		return this.idordine;
	}

	public void setIdordine(int idordine) {
		this.idordine = idordine;
	}

	public Spedizione getSpedizione() {
		return this.spedizione;
	}

	public void setSpedizione(Spedizione spedizione) {
		this.spedizione = spedizione;
	}

	public int getSpesaspedizione() {
		return this.spesaspedizione;
	}

	public void setSpesaspedizione(int spesaspedizione) {
		this.spesaspedizione = spesaspedizione;
	}

	public Date getDataspedizione() {
		return this.dataspedizione;
	}

	public void setDataspedizione(Date dataspedizione) {
		this.dataspedizione = dataspedizione;
	}

	public Date getDataconsegna() {
		return this.dataconsegna;
	}

	public void setDataconsegna(Date dataconsegna) {
		this.dataconsegna = dataconsegna;
	}

}
