package it.unirc.pwm.EntityMappingMy;


import java.util.Date;

public class Cartadicredito extends Pagamento { //extends per l'eredietarietà
	
	//private Cartadicreditoid idcarta;
	private String nomeintestatario;
	private String cognomeintestatario;
	
	public Cartadicredito(int idordine, Date datapagamento, double importo, Ordine ordine, Cartadicreditoid idcarta,
			String nomeintestatario, String cognomeintestatario) {
		//this.idcarta = idcarta;
		this.nomeintestatario = nomeintestatario;
		this.cognomeintestatario = cognomeintestatario;
	}

	//public Cartadicreditoid getIdcarta() {
		//return idcarta;
	//}

	//public void setIdcarta(Cartadicreditoid idcarta) {
		//this.idcarta = idcarta;
	//}

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
	
	
	
	
}
