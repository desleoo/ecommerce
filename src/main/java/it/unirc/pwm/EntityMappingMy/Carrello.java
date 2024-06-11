package it.unirc.pwm.EntityMappingMy;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;


public class Carrello {
	private int idcliente;
	private double prezzoTot;
	private Cliente cliente;//ha un riferimento ad cliente -> ONE TO ONE BIDIREZIONALE
	private Set<Prodotto> prodotti = new HashSet<Prodotto>(0);
	public int getIdcliente() {
		return idcliente;
	}
	public void setIdcliente(int idcliente) {
		this.idcliente = idcliente;
	}
	public double getPrezzoTot() {
		return prezzoTot;
	}
	public void setPrezzoTot(double prezzoTot) {
		this.prezzoTot = prezzoTot;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Set<Prodotto> getProdotti() {
		return prodotti;
	}
	public void setProdotti(Set<Prodotto> prodotti) {
		this.prodotti = prodotti;
	}
	@Override
	public int hashCode() {
		return Objects.hash(cliente, idcliente, prezzoTot, prodotti);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Carrello other = (Carrello) obj;
		return Objects.equals(cliente, other.cliente) && idcliente == other.idcliente
				&& Double.doubleToLongBits(prezzoTot) == Double.doubleToLongBits(other.prezzoTot)
				&& Objects.equals(prodotti, other.prodotti);
	}
	public Carrello(int idcliente, double prezzoTot, Cliente cliente, Set<Prodotto> prodotti) {
		super();
		this.idcliente = idcliente;
		this.prezzoTot = prezzoTot;
		this.cliente = cliente;
		this.prodotti = prodotti;
	}
	@Override
	public String toString() {
		return "Carrello [idcliente=" + idcliente + ", prezzoTot=" + prezzoTot + ", cliente=" + cliente + ", prodotti="
				+ prodotti + "]";
	}
	public Carrello() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
}
