package it.unirc.pwm.EntityMappingMy;

import java.util.Date;

public class Contrassegno extends Pagamento{ //extends per l'eredietarietà
	private String firmatario;
	private String imgfirma;
	
	public String getFirmatario() {
		return firmatario;
	}
	public void setFirmatario(String firmatario) {
		this.firmatario = firmatario;
	}
	public String getImgfirma() {
		return imgfirma;
	}
	public void setImgfirma(String imgfirma) {
		this.imgfirma = imgfirma;
	}
	@Override
	public String toString() {
		return "Contrassegno [firmatario=" + firmatario + ", imgfirma=" + imgfirma + "]";
	}
	public Contrassegno(int idordine, Date datapagamento, double importo, Ordine ordine, String firmatario,
			String imgfirma) {
		super(idordine, datapagamento, importo, ordine);
		this.firmatario = firmatario;
		this.imgfirma = imgfirma;
	}
	public Contrassegno() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Contrassegno(int idordine, Date datapagamento, double importo, Ordine ordine) {
		super(idordine, datapagamento, importo, ordine);
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
}
