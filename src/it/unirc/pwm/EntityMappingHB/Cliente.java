package it.unirc.pwm.EntityMappingHB;
// Generated 22 mar 2022, 17:25:01 by Hibernate Tools 5.5.7.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Cliente generated by hbm2java
 */
public class Cliente implements java.io.Serializable {

	private Integer idcliente;
	private String nome;
	private String cognome;
	private Date datanascita;
	private int telefono;
	private String email;
	private String indirizzoCitta;
	private String indirizzoVia;
	private String indirizzoCivico;
	private Integer indirizzoCap;
	private String indirizzoDescizione;
	private Set ordines = new HashSet(0);
	private Amministratore amministratore;
	private Account account;

	public Cliente() {
	}

	public Cliente(String nome, String cognome, Date datanascita, int telefono, String email, String indirizzoCitta) {
		this.nome = nome;
		this.cognome = cognome;
		this.datanascita = datanascita;
		this.telefono = telefono;
		this.email = email;
		this.indirizzoCitta = indirizzoCitta;
	}

	public Cliente(String nome, String cognome, Date datanascita, int telefono, String email, String indirizzoCitta,
			String indirizzoVia, String indirizzoCivico, Integer indirizzoCap, String indirizzoDescizione, Set ordines,
			Amministratore amministratore, Account account) {
		this.nome = nome;
		this.cognome = cognome;
		this.datanascita = datanascita;
		this.telefono = telefono;
		this.email = email;
		this.indirizzoCitta = indirizzoCitta;
		this.indirizzoVia = indirizzoVia;
		this.indirizzoCivico = indirizzoCivico;
		this.indirizzoCap = indirizzoCap;
		this.indirizzoDescizione = indirizzoDescizione;
		this.ordines = ordines;
		this.amministratore = amministratore;
		this.account = account;
	}

	public Integer getIdcliente() {
		return this.idcliente;
	}

	public void setIdcliente(Integer idcliente) {
		this.idcliente = idcliente;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return this.cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public Date getDatanascita() {
		return this.datanascita;
	}

	public void setDatanascita(Date datanascita) {
		this.datanascita = datanascita;
	}

	public int getTelefono() {
		return this.telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getIndirizzoCitta() {
		return this.indirizzoCitta;
	}

	public void setIndirizzoCitta(String indirizzoCitta) {
		this.indirizzoCitta = indirizzoCitta;
	}

	public String getIndirizzoVia() {
		return this.indirizzoVia;
	}

	public void setIndirizzoVia(String indirizzoVia) {
		this.indirizzoVia = indirizzoVia;
	}

	public String getIndirizzoCivico() {
		return this.indirizzoCivico;
	}

	public void setIndirizzoCivico(String indirizzoCivico) {
		this.indirizzoCivico = indirizzoCivico;
	}

	public Integer getIndirizzoCap() {
		return this.indirizzoCap;
	}

	public void setIndirizzoCap(Integer indirizzoCap) {
		this.indirizzoCap = indirizzoCap;
	}

	public String getIndirizzoDescizione() {
		return this.indirizzoDescizione;
	}

	public void setIndirizzoDescizione(String indirizzoDescizione) {
		this.indirizzoDescizione = indirizzoDescizione;
	}

	public Set getOrdines() {
		return this.ordines;
	}

	public void setOrdines(Set ordines) {
		this.ordines = ordines;
	}

	public Amministratore getAmministratore() {
		return this.amministratore;
	}

	public void setAmministratore(Amministratore amministratore) {
		this.amministratore = amministratore;
	}

	public Account getAccount() {
		return this.account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

}
