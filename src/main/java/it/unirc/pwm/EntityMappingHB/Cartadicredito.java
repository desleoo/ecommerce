package it.unirc.pwm.EntityMappingHB;
// Generated 6 ott 2022, 11:41:34 by Hibernate Tools 5.5.7.Final

import java.util.Date;

public class Cartadicredito extends Pagamento { //extends per gestire l'eredietarietà TABLE PER CLASS

	private String nomeintestatario;
	private String cognomeintestatario;
	private long numeroCarta;
	private String scadenza;
	private int cvv;
	
	public String getNomeintestatario() {
		return nomeintestatario;
	}
	public void setNomeintestatario(String nomeintestatario) {
		this.nomeintestatario = nomeintestatario;
	}
	public String getCognomeintestatario() {
		return cognomeintestatario;
	}
	public void setCognomeintestatario(String cognomeintestatario) {
		this.cognomeintestatario = cognomeintestatario;
	}
	public long getNumeroCarta() {
		return numeroCarta;
	}
	public void setNumeroCarta(long numeroCarta) {
		this.numeroCarta = numeroCarta;
	}
	public String getScadenza() {
		return scadenza;
	}
	public void setScadenza(String scadenza) {
		this.scadenza = scadenza;
	}
	public int getCvv() {
		return cvv;
	}
	public void setCvv(int cvv) {
		this.cvv = cvv;
	}
	@Override
	public String toString() {
		return "Cartadicredito [nomeintestatario=" + nomeintestatario + ", cognomeintestatario=" + cognomeintestatario
				+ ", numeroCarta=" + numeroCarta + ", scadenza=" + scadenza + ", cvv=" + cvv + "]";
	}
	public Cartadicredito( String nomeintestatario, String cognomeintestatario, long numeroCarta, String scadenza,
			int cvv) {
		super();
		this.nomeintestatario = nomeintestatario;
		this.cognomeintestatario = cognomeintestatario;
		this.numeroCarta = numeroCarta;
		this.scadenza = scadenza;
		this.cvv = cvv;
	}
	
	public Cartadicredito(Date dataPagamento,double importo, String nomeintestatario, String cognomeintestatario, long numeroCarta, String scadenza,
			int cvv){
		this.setDatapagamento(dataPagamento);
		this.setImporto(importo);
		this.setNomeintestatario(nomeintestatario);
		this.setCognomeintestatario(cognomeintestatario);
		this.setNumeroCarta(numeroCarta);
		this.setScadenza(scadenza);
		this.setCvv(cvv);
	}
	
	public Cartadicredito() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
}
