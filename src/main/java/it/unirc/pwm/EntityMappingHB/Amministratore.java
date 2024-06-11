package it.unirc.pwm.EntityMappingHB;

public class Amministratore implements java.io.Serializable {

	private int idcliente; //si porta dietro la chiave di Cliente poiche cìè un id esterno-> ONE TO ONE BIDIREZIONALE
	private Cliente cliente;//ha un riferimento a cliente -> ONE TO ONE BIDIREZIONALE
	private String nomeamministratore;
	private String cognomeamministratore;
	private String codicefiscale;

	public Amministratore() {
	}

	public Amministratore(Cliente cliente, String nomeamministratore, String cognomeamministratore,
			String codicefiscale) {
		this.cliente = cliente;
		this.nomeamministratore = nomeamministratore;
		this.cognomeamministratore = cognomeamministratore;
		this.codicefiscale = codicefiscale;
	}

	public int getIdcliente() {
		return this.idcliente;
	}

	public void setIdcliente(int idcliente) {
		this.idcliente = idcliente;
	}

	public Cliente getCliente() {
		return this.cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public String getNomeamministratore() {
		return this.nomeamministratore;
	}

	public void setNomeamministratore(String nomeamministratore) {
		this.nomeamministratore = nomeamministratore;
	}

	public String getCognomeamministratore() {
		return this.cognomeamministratore;
	}

	public void setCognomeamministratore(String cognomeamministratore) {
		this.cognomeamministratore = cognomeamministratore;
	}

	public String getCodicefiscale() {
		return this.codicefiscale;
	}

	public void setCodicefiscale(String codicefiscale) {
		this.codicefiscale = codicefiscale;
	}

}
