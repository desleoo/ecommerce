package it.unirc.pwm.EntityMappingMy;

import java.util.Date;


public class CorriereExp extends Spedizione{ //extends per l'eredietarietà
	private int spesaspedizionExp;
	private Date dataspedizioneExp;
	private Date dataconsegnaExp;
	
	public int getSpesaspedizionExp() {
		return spesaspedizionExp;
	}
	public void setSpesaspedizionExp(int spesaspedizionExp) {
		this.spesaspedizionExp = spesaspedizionExp;
	}
	public Date getDataspedizioneExp() {
		return dataspedizioneExp;
	}
	public void setDataspedizioneExp(Date dataspedizioneExp) {
		this.dataspedizioneExp = dataspedizioneExp;
	}
	public Date getDataconsegnaExp() {
		return dataconsegnaExp;
	}
	public void setDataconsegnaExp(Date dataconsegnaExp) {
		this.dataconsegnaExp = dataconsegnaExp;
	}
	@Override
	public String toString() {
		return "CorriereExp [spesaspedizionExp=" + spesaspedizionExp + ", dataspedizioneExp=" + dataspedizioneExp
				+ ", dataconsegnaExp=" + dataconsegnaExp + "]";
	}
	public CorriereExp(int idordine, String nomecorriere, Date datapartenza, Date dataconsegna, Ordine ordine,
			int spesaspedizionExp, Date dataspedizioneExp, Date dataconsegnaExp) {
		super(idordine, nomecorriere, datapartenza, dataconsegna, ordine);
		this.spesaspedizionExp = spesaspedizionExp;
		this.dataspedizioneExp = dataspedizioneExp;
		this.dataconsegnaExp = dataconsegnaExp;
	}
	public CorriereExp() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CorriereExp(int idordine, String nomecorriere, Date datapartenza, Date dataconsegna, Ordine ordine) {
		super(idordine, nomecorriere, datapartenza, dataconsegna, ordine);
		// TODO Auto-generated constructor stub
	}
	
	
	
}
