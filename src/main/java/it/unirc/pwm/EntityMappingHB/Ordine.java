package it.unirc.pwm.EntityMappingHB;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;


public class Ordine implements java.io.Serializable {

	private int idordine;
	private Cliente cliente;//ha un riferimento a cliente -> MANY TO ONE BIDIREZIONALE
	private String stato;
	private Date dataordine;
	private Date dataConfermaOrdine;
	private Date dataAnnulloOrdine;
	private Set prodottos = new HashSet(0); //ha un riferimento ad un Set di prodotti-> MANY TO MANY
	private Pagamento pagamento; //ha un riferimento a pagamento -> ONE TO ONE BIDIREZIONALE
	
	public int getIdordine() {
		return idordine;
	}
	public void setIdordine(int idordine) {
		this.idordine = idordine;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public String getStato() {
		return stato;
	}
	public void setStato(String stato) {
		this.stato = stato;
	}
	public Date getDataordine() {
		return dataordine;
	}
	public void setDataordine(Date dataordine) {
		this.dataordine = dataordine;
	}
	public Date getDataConfermaOrdine() {
		return dataConfermaOrdine;
	}
	public void setDataConfermaOrdine(Date dataConfermaOrdine) {
		this.dataConfermaOrdine = dataConfermaOrdine;
	}
	public Date getDataAnnulloOrdine() {
		return dataAnnulloOrdine;
	}
	public void setDataAnnulloOrdine(Date dataAnnulloOrdine) {
		this.dataAnnulloOrdine = dataAnnulloOrdine;
	}
	public Set getProdottos() {
		return prodottos;
	}
	public void setProdottos(Set prodottos) {
		this.prodottos = prodottos;
	}
	public Pagamento getPagamento() {
		return pagamento;
	}
	public void setPagamento(Pagamento pagamento) {
		this.pagamento = pagamento;
	}
	public Ordine(int idordine, Cliente cliente, String stato, Date dataordine, Date dataConfermaOrdine,
			Date dataAnnulloOrdine, Set prodottos, Pagamento pagamento) {
		super();
		this.idordine = idordine;
		this.cliente = cliente;
		this.stato = stato;
		this.dataordine = dataordine;
		this.dataConfermaOrdine = dataConfermaOrdine;
		this.dataAnnulloOrdine = dataAnnulloOrdine;
		this.prodottos = prodottos;
		this.pagamento = pagamento;
	}
	public Ordine() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
