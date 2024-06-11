package it.unirc.pwm.EntityMappingHB;

import java.util.HashSet;
import java.util.Set;

public class Prodotto implements java.io.Serializable {

	private Integer idprodotto; 
	private String nomep;
	private String descrizionep;
	private double prezzo;
	private Set ordines = new HashSet(0); //ha un riferimento ad un Set di ordini-> MANY TO MANY	
	private ImmagineProdotto immagineProdotto; //ha un riferimento a Immagine Prodotto-> ONE TO ONE COMPOSED

	public Integer getIdprodotto() {
		return idprodotto;
	}

	public void setIdprodotto(Integer idprodotto) {
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

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	public Set getOrdines() {
		return ordines;
	}

	public void setOrdines(Set ordines) {
		this.ordines = ordines;
	}

	public ImmagineProdotto getImmagineProdotto() {
		return immagineProdotto;
	}

	public void setImmagineProdotto(ImmagineProdotto immagineProdotto) {
		this.immagineProdotto = immagineProdotto;
	}

	@Override
	public String toString() {
		return "Prodotto [idprodotto=" + idprodotto + ", nomep=" + nomep + ", descrizionep=" + descrizionep
				+ ", prezzo=" + prezzo + ", ordines=" + ordines + ", immagineProdotto=" + immagineProdotto + "]";
	}

	public Prodotto(String nomep, String descrizionep, double prezzo, ImmagineProdotto immagineProdotto) {
		super();
		this.nomep = nomep;
		this.descrizionep = descrizionep;
		this.prezzo = prezzo;
		this.immagineProdotto = immagineProdotto;
	}

	public Prodotto() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	
	
	

}