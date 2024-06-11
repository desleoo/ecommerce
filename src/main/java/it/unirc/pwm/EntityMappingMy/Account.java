package it.unirc.pwm.EntityMappingMy;


public class Account {
	private int	idcliente; //si porta dietro la chiave di Cliente -> ONE TO ONE CLASSICA
	private String username;
	private String password;
	private Cliente cliente; //riferimento a cliente -> ONE TO ONE CLASSICA

	public int getIdcliente() {
		return idcliente;
	}

	public void setIdcliente(int idcliente) {
		this.idcliente = idcliente;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	@Override
	public String toString() {
		return "Account [idcliente=" + idcliente + ", username=" + username + ", password=" + password + ", cliente="
				+ cliente + "]";
	}

	public Account(int idcliente, String username, String password, Cliente cliente) {
		super();
		this.idcliente = idcliente;
		this.username = username;
		this.password = password;
		this.cliente = cliente;
	}

	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
