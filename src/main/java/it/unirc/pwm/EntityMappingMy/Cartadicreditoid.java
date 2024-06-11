package it.unirc.pwm.EntityMappingMy;

import java.util.Date;
import java.util.Objects;

public class Cartadicreditoid implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	
	private int codicecarta;
	private Date datascadenza;
	private int ccn;
	
	@Override
	public int hashCode() {
		return Objects.hash(ccn, codicecarta, datascadenza);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cartadicreditoid other = (Cartadicreditoid) obj;
		return ccn == other.ccn && codicecarta == other.codicecarta && Objects.equals(datascadenza, other.datascadenza);
	}
	public int getCodicecarta() {
		return codicecarta;
	}
	public void setCodicecarta(int codicecarta) {
		this.codicecarta = codicecarta;
	}
	public Date getDatascadenza() {
		return datascadenza;
	}
	public void setDatascadenza(Date datascadenza) {
		this.datascadenza = datascadenza;
	}
	public int getCcn() {
		return ccn;
	}
	public void setCcn(int ccn) {
		this.ccn = ccn;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "Cartadicreditoid [codicecarta=" + codicecarta + ", datascadenza=" + datascadenza + ", ccn=" + ccn + "]";
	}
	public Cartadicreditoid() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
