package it.unirc.pwm.EntityMappingMy;

import java.util.HashSet;
import java.util.Set;

public class Prodotto {
	private int idprodotto;
	private String nomep;
	private String descrizionep;
	private String immaginep;
	private double prezzo;
	private Set<Ordine> ordine = new HashSet<Ordine>(0); //riferimento all'insieme degli ordini -> MANY TO MANY 

	public int getIdprodotto() {
		return idprodotto;
	}
	public void setIdprodotto(int idprodotto) {
		this.idprodotto = idprodotto;
	}
	public String getNomep() {
		return nomep;
	}
	public void setNomep(String nomep) {
		this.nomep = nomep;
	}
	public String getDescrizionep() {
		return descrizionep;
	}
	public void setDescrizionep(String descrizionep) {
		this.descrizionep = descrizionep;
	}
	public String getImmaginep() {
		return immaginep;
	}
	public void setImmaginep(String immagine) {
		this.immaginep = immagine;
	}
	public double getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
	public Set<Ordine> getOrdine() {
		return ordine;
	}
	public void setOrdine(Set<Ordine> ordine) {
		this.ordine = ordine;
	}
	@Override
	public String toString() {
		return "Prodotto [idprodotto=" + idprodotto + ", nomep=" + nomep + ", descrizionep=" + descrizionep
				+ ", immagine=" + immaginep + ", prezzo=" + prezzo + ", ordine=" + ordine + "]";
	}
	public Prodotto(int idprodotto, String nomep, String descrizionep, String immagine, double prezzo,
			Set<Ordine> ordine) {
		super();
		this.idprodotto = idprodotto;
		this.nomep = nomep;
		this.descrizionep = descrizionep;
		this.immaginep = immagine;
		this.prezzo = prezzo;
		this.ordine = ordine;
	}
	public Prodotto() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
}
