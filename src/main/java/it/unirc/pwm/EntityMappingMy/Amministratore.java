package it.unirc.pwm.EntityMappingMy;

public class Amministratore {
	private int idcliente;
	private String nomeamministratore;
	private String cognomeamministratore;
	private String codicefiscale;
	private Cliente cliente; //ha un riferimento a cliente -> ONE TO ONE CLASSICA
	
	public int getIdcliente() {
		return idcliente;
	}
	public void setIdcliente(int idcliente) {
		this.idcliente = idcliente;
	}
	public String getNomeamministratore() {
		return nomeamministratore;
	}
	public void setNomeamministratore(String nomeamministratore) {
		this.nomeamministratore = nomeamministratore;
	}
	public String getCognomeamministratore() {
		return cognomeamministratore;
	}
	public void setCognomeamministratore(String cognomeamministratore) {
		this.cognomeamministratore = cognomeamministratore;
	}
	public String getCodicefiscale() {
		return codicefiscale;
	}
	public void setCodicefiscale(String codicefiscale) {
		this.codicefiscale = codicefiscale;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	@Override
	public String toString() {
		return "Amministratore [idcliente=" + idcliente + ", nomeamministratore=" + nomeamministratore
				+ ", cognomeamministratore=" + cognomeamministratore + ", codicefiscale=" + codicefiscale + ", cliente="
				+ cliente + "]";
	}
	public Amministratore(int idcliente, String nomeamministratore, String cognomeamministratore, String codicefiscale,
			Cliente cliente) {
		super();
		this.idcliente = idcliente;
		this.nomeamministratore = nomeamministratore;
		this.cognomeamministratore = cognomeamministratore;
		this.codicefiscale = codicefiscale;
		this.cliente = cliente;
	}
	public Amministratore() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
