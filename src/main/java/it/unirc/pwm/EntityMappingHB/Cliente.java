package it.unirc.pwm.EntityMappingHB;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Cliente implements java.io.Serializable {

	private Integer idcliente;
	private String nome;
	private String cognome;
	private Date datanascita;
	private long telefono;
	private String email;
	private String indirizzoCitta;
	private String indirizzoVia;
	private String indirizzoCivico;
	private Integer indirizzoCap;
	private String indirizzoDescrizione;
	private Set ordines = new HashSet(0); //ha un riferimento ad un Set di ordini-> MANY TO ONE BIDIREZIONALE
	private Amministratore amministratore; //ha un riferimento ad amministratore -> ONE TO ONE BIDIREZIONALE
	private Account account; //ha un riferimento ad account -> ONE TO ONE BIDIREZIONALE
	
	public Integer getIdcliente() {
		return idcliente;
	}
	public void setIdcliente(Integer idcliente) {
		this.idcliente = idcliente;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public Date getDatanascita() {
		return datanascita;
	}
	public void setDatanascita(Date datanascita) {
		this.datanascita = datanascita;
	}
	public long getTelefono() {
		return telefono;
	}
	public void setTelefono(long telefono) {
		this.telefono = telefono;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getIndirizzoCitta() {
		return indirizzoCitta;
	}
	public void setIndirizzoCitta(String indirizzoCitta) {
		this.indirizzoCitta = indirizzoCitta;
	}
	public String getIndirizzoVia() {
		return indirizzoVia;
	}
	public void setIndirizzoVia(String indirizzoVia) {
		this.indirizzoVia = indirizzoVia;
	}
	public String getIndirizzoCivico() {
		return indirizzoCivico;
	}
	public void setIndirizzoCivico(String indirizzoCivico) {
		this.indirizzoCivico = indirizzoCivico;
	}
	public Integer getIndirizzoCap() {
		return indirizzoCap;
	}
	public void setIndirizzoCap(Integer indirizzoCap) {
		this.indirizzoCap = indirizzoCap;
	}
	public String getIndirizzoDescrizione() {
		return indirizzoDescrizione;
	}
	public void setIndirizzoDescrizione(String indirizzoDescrizione) {
		this.indirizzoDescrizione = indirizzoDescrizione;
	}
	public Set getOrdines() {
		return ordines;
	}
	public void setOrdines(Set ordines) {
		this.ordines = ordines;
	}
	public Amministratore getAmministratore() {
		return amministratore;
	}
	public void setAmministratore(Amministratore amministratore) {
		this.amministratore = amministratore;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	@Override
	public String toString() {
		return "Cliente [idcliente=" + idcliente + ", nome=" + nome + ", cognome=" + cognome + ", datanascita="
				+ datanascita + ", telefono=" + telefono + ", email=" + email + ", indirizzoCitta=" + indirizzoCitta
				+ ", indirizzoVia=" + indirizzoVia + ", indirizzoCivico=" + indirizzoCivico + ", indirizzoCap="
				+ indirizzoCap + ", indirizzoDescrizione=" + indirizzoDescrizione + ", ordines=" + ordines
				+ ", amministratore=" + amministratore + ", account=" + account + "]";
	}
	public Cliente(Integer idcliente, String nome, String cognome, Date datanascita, long telefono, String email,
			String indirizzoCitta, String indirizzoVia, String indirizzoCivico, Integer indirizzoCap,
			String indirizzoDescrizione, Set ordines, Amministratore amministratore, Account account) {
		super();
		this.idcliente = idcliente;
		this.nome = nome;
		this.cognome = cognome;
		this.datanascita = datanascita;
		this.telefono = telefono;
		this.email = email;
		this.indirizzoCitta = indirizzoCitta;
		this.indirizzoVia = indirizzoVia;
		this.indirizzoCivico = indirizzoCivico;
		this.indirizzoCap = indirizzoCap;
		this.indirizzoDescrizione = indirizzoDescrizione;
		this.ordines = ordines;
		this.amministratore = amministratore;
		this.account = account;
	}
	public Cliente() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
}