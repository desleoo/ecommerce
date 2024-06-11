package it.unirc.pwm.EntityMappingMy;

import java.util.Date;
import java.util.Set;

public class Confermato extends Ordine { //extends per l'eredietarietà
	
	private Date dataConfermaOrdine;

	public Date getDataConfermaOrdine() {
		return dataConfermaOrdine;
	}

	public void setDataConfermaOrdine(Date dataConfermaOrdine) {
		this.dataConfermaOrdine = dataConfermaOrdine;
	}

	public Confermato(int idordine, Date dataordine, Spedizione spedizione, Pagamento pagamento, Set<Prodotto> prodotto,
			Cliente cliente, Date dataConfermaOrdine) {
		super(idordine, dataordine, spedizione, pagamento, prodotto, cliente);
		this.dataConfermaOrdine = dataConfermaOrdine;
	}

	
	
}
