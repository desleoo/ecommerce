package it.unirc.pwm.EntityMappingMy;

import java.util.Date;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;


public class Ordine {
	private int idordine;
	private Date dataordine;
	private Spedizione spedizione;
	private Pagamento pagamento; //ha un riferimento a pagamento -> ONE TO ONE BIDIREZIONALE
	private Set<Prodotto> prodotto = new HashSet<Prodotto>(0); //riferimento all'insieme dei prodotti che compongono l'ordine -> MANY TO MANY
	private Cliente cliente; //ha un riferimento a cliente -> MANY TO ONE BIDIREZINALE.
	
	
	public int getIdordine() {
		return idordine;
	}
	public void setIdordine(int idordine) {
		this.idordine = idordine;
	}
	public Date getDataordine() {
		return dataordine;
	}
	public void setDataordine(Date dataordine) {
		this.dataordine = dataordine;
	}
	public Spedizione getSpedizione() {
		return spedizione;
	}
	public void setSpedizione(Spedizione spedizione) {
		this.spedizione = spedizione;
	}
	public Pagamento getPagamento() {
		return pagamento;
	}
	public void setPagamento(Pagamento pagamento) {
		this.pagamento = pagamento;
	}
	public Set<Prodotto> getProdotto() {
		return prodotto;
	}
	public void setProdotto(Set<Prodotto> prodotto) {
		this.prodotto = prodotto;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	@Override
	public String toString() {
		return "Ordine [idordine=" + idordine + ", dataordine=" + dataordine + ", spedizione=" + spedizione
				+ ", pagamento=" + pagamento + ", prodotto=" + prodotto + ", cliente=" + cliente + "]";
	}
	public Ordine(int idordine, Date dataordine, Spedizione spedizione, Pagamento pagamento, Set<Prodotto> prodotto,
			Cliente cliente) {
		super();
		this.idordine = idordine;
		this.dataordine = dataordine;
		this.spedizione = spedizione;
		this.pagamento = pagamento;
		this.prodotto = prodotto;
		this.cliente = cliente;
	}
	public Ordine() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public int hashCode() {
		return Objects.hash(cliente, dataordine, idordine, pagamento, prodotto, spedizione);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ordine other = (Ordine) obj;
		return Objects.equals(cliente, other.cliente) && Objects.equals(dataordine, other.dataordine)
				&& idordine == other.idordine && Objects.equals(pagamento, other.pagamento)
				&& Objects.equals(prodotto, other.prodotto) && Objects.equals(spedizione, other.spedizione);
	}
	
	
	
}
