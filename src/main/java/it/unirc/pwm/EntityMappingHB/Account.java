package it.unirc.pwm.EntityMappingHB;

public class Account implements java.io.Serializable {

	private int idcliente; //si porta dietro la chiave di Cliente poiche cìè un id esterno-> ONE TO ONE BIDIREZIONALE
	private Cliente cliente; //ha un riferimento a cliente -> ONE TO ONE BIDIREZIONALE
	private String password;
	private String username;

	public Account() {
	}

	public Account(Cliente cliente, String password, String username) {
		this.cliente = cliente;
		this.password = password;
		this.username = username;
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

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}
