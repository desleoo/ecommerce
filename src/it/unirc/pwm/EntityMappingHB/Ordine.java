package it.unirc.pwm.EntityMappingHB;
// Generated 22 mar 2022, 17:25:01 by Hibernate Tools 5.5.7.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Ordine generated by hbm2java
 */
public class Ordine implements java.io.Serializable {

	private int idordine;
	private Cliente cliente;
	private String stato;
	private Date dataordine;
	private Date dataConfermaOrdine;
	private Date dataAnnulloOrdine;
	private Spedizione spedizione;
	private Set prodottos = new HashSet(0);

	public Ordine() {
	}

	public Ordine(int idordine, Cliente cliente, String stato, Date dataordine, Date dataConfermaOrdine,
			Date dataAnnulloOrdine) {
		this.idordine = idordine;
		this.cliente = cliente;
		this.stato = stato;
		this.dataordine = dataordine;
		this.dataConfermaOrdine = dataConfermaOrdine;
		this.dataAnnulloOrdine = dataAnnulloOrdine;
	}

	public Ordine(int idordine, Cliente cliente, String stato, Date dataordine, Date dataConfermaOrdine,
			Date dataAnnulloOrdine, Spedizione spedizione, Set prodottos) {
		this.idordine = idordine;
		this.cliente = cliente;
		this.stato = stato;
		this.dataordine = dataordine;
		this.dataConfermaOrdine = dataConfermaOrdine;
		this.dataAnnulloOrdine = dataAnnulloOrdine;
		this.spedizione = spedizione;
		this.prodottos = prodottos;
	}

	public int getIdordine() {
		return this.idordine;
	}

	public void setIdordine(int idordine) {
		this.idordine = idordine;
	}

	public Cliente getCliente() {
		return this.cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public String getStato() {
		return this.stato;
	}

	public void setStato(String stato) {
		this.stato = stato;
	}

	public Date getDataordine() {
		return this.dataordine;
	}

	public void setDataordine(Date dataordine) {
		this.dataordine = dataordine;
	}

	public Date getDataConfermaOrdine() {
		return this.dataConfermaOrdine;
	}

	public void setDataConfermaOrdine(Date dataConfermaOrdine) {
		this.dataConfermaOrdine = dataConfermaOrdine;
	}

	public Date getDataAnnulloOrdine() {
		return this.dataAnnulloOrdine;
	}

	public void setDataAnnulloOrdine(Date dataAnnulloOrdine) {
		this.dataAnnulloOrdine = dataAnnulloOrdine;
	}

	public Spedizione getSpedizione() {
		return this.spedizione;
	}

	public void setSpedizione(Spedizione spedizione) {
		this.spedizione = spedizione;
	}

	public Set getProdottos() {
		return this.prodottos;
	}

	public void setProdottos(Set prodottos) {
		this.prodottos = prodottos;
	}

}
