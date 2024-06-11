package it.unirc.pwm.EntityMappingHB;

import java.util.Date;


public class Pagamento implements java.io.Serializable {

	private int idordine; //si porta dietro la chiave di Ordine poiche cìè un id esterno-> ONE TO ONE BIDIREZIONALE
	private Date datapagamento;
	private double importo;
	private Ordine ordine; //ha un riferimento a ordine-> ONE TO ONE BIDIREZIONALE
	
	public int getIdordine() {
		return idordine;
	}
	public void setIdordine(int idordine) {
		this.idordine = idordine;
	}
	public Date getDatapagamento() {
		return datapagamento;
	}
	public void setDatapagamento(Date datapagamento) {
		this.datapagamento = datapagamento;
	}
	public double getImporto() {
		return importo;
	}
	public void setImporto(double importo) {
		this.importo = importo;
	}
	public Ordine getOrdine() {
		return ordine;
	}
	public void setOrdine(Ordine ordine) {
		this.ordine = ordine;
	}
	@Override
	public String toString() {
		return "Pagamento [idordine=" + idordine + ", datapagamento=" + datapagamento + ", importo=" + importo
				+ ", ordine=" + ordine + "]";
	}
	public Pagamento(int idordine, Date datapagamento, double importo, Ordine ordine) {
		super();
		this.idordine = idordine;
		this.datapagamento = datapagamento;
		this.importo = importo;
		this.ordine = ordine;
	}
	
	
	
	public Pagamento() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
