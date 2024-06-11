package it.unirc.pwm.EntityMappingHB;

import java.util.Date;
import java.util.Objects;

public class Spedizione implements java.io.Serializable {

	private int idordine; //si porta dietro la chiave di Ordine poiche cìè un id esterno-> ONE TO ONE CLASSICA
	private Date datapartenza;
	private Date dataconsegna;
	private Ordine ordine; ///ha un riferimento ad Ordine -> ONE TO ONE  CLASSICA
	
	public int getIdordine() {
		return idordine;
	}
	public void setIdordine(int idordine) {
		this.idordine = idordine;
	}
	public Date getDatapartenza() {
		return datapartenza;
	}
	public void setDatapartenza(Date datapartenza) {
		this.datapartenza = datapartenza;
	}
	public Date getDataconsegna() {
		return dataconsegna;
	}
	public void setDataconsegna(Date dataconsegna) {
		this.dataconsegna = dataconsegna;
	}
	public Ordine getOrdine() {
		return ordine;
	}
	public void setOrdine(Ordine ordine) {
		this.ordine = ordine;
	}
	@Override
	public int hashCode() {
		return Objects.hash(dataconsegna, datapartenza, idordine, ordine);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Spedizione other = (Spedizione) obj;
		return Objects.equals(dataconsegna, other.dataconsegna) && Objects.equals(datapartenza, other.datapartenza)
				&& idordine == other.idordine && Objects.equals(ordine, other.ordine);
	}
	public Spedizione() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Spedizione(int idordine, Date datapartenza, Date dataconsegna, Ordine ordine) {
		super();
		this.idordine = idordine;
		this.datapartenza = datapartenza;
		this.dataconsegna = dataconsegna;
		this.ordine = ordine;
	}
	
	
	
}
