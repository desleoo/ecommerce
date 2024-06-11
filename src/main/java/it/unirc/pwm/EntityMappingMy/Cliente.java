package it.unirc.pwm.EntityMappingMy;

import java.util.Date;
import java.util.Objects;

public class Cliente extends Account{ //extends per gestire l'eredietarietà
	private int idcliente;
	private String nome;
	private String cognome;
	private Date datanascita;
	private int telefono;
	private String email;
	private Indirizzo indirizzo; //ha un riferimento ad indirizzo -> ONE TO ONE COMPOSED
	private Carrello carrello; //ha un riferimento ad carrello -> ONE TO ONE BIDIREZIONALE
	public int getIdcliente() {
		return idcliente;
	}
	public void setIdcliente(int idcliente) {
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
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Indirizzo getIndirizzo() {
		return indirizzo;
	}
	public void setIndirizzo(Indirizzo indirizzo) {
		this.indirizzo = indirizzo;
	}
	public Carrello getCarrello() {
		return carrello;
	}
	public void setCarrello(Carrello carrello) {
		this.carrello = carrello;
	}
	@Override
	public int hashCode() {
		return Objects.hash(carrello, cognome, datanascita, email, idcliente, indirizzo, nome, telefono);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return Objects.equals(carrello, other.carrello) && Objects.equals(cognome, other.cognome)
				&& Objects.equals(datanascita, other.datanascita) && Objects.equals(email, other.email)
				&& idcliente == other.idcliente && Objects.equals(indirizzo, other.indirizzo)
				&& Objects.equals(nome, other.nome) && telefono == other.telefono;
	}
	@Override
	public String toString() {
		return "Cliente [idcliente=" + idcliente + ", nome=" + nome + ", cognome=" + cognome + ", datanascita="
				+ datanascita + ", telefono=" + telefono + ", email=" + email + ", indirizzo=" + indirizzo
				+ ", carrello=" + carrello + "]";
	}
	public Cliente(int idcliente, String username, String password, Cliente cliente, int idcliente2, String nome,
			String cognome, Date datanascita, int telefono, String email, Indirizzo indirizzo, Carrello carrello) {
		super(idcliente, username, password, cliente);
		idcliente = idcliente2;
		this.nome = nome;
		this.cognome = cognome;
		this.datanascita = datanascita;
		this.telefono = telefono;
		this.email = email;
		this.indirizzo = indirizzo;
		this.carrello = carrello;
	}
	public Cliente() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Cliente(int idcliente, String username, String password, Cliente cliente) {
		super(idcliente, username, password, cliente);
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
}
