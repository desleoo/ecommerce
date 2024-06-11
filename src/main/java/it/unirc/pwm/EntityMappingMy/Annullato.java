package it.unirc.pwm.EntityMappingMy;

import java.util.Date;
import java.util.Set;

public class Annullato extends Ordine { //extends per l'eredietarietà
	
	private Date dataAnnulloOrdine;

	public Date getDataAnnulloOrdine() {
		return dataAnnulloOrdine;
	}

	public void setDataAnnulloOrdine(Date dataAnnulloOrdine) {
		this.dataAnnulloOrdine = dataAnnulloOrdine;
	}

	public Annullato(int idordine, Date dataordine, Spedizione spedizione, Pagamento pagamento, Set<Prodotto> prodotto,
			Cliente cliente, Date dataAnnulloOrdine) {
		super(idordine, dataordine, spedizione, pagamento, prodotto, cliente);
		this.dataAnnulloOrdine = dataAnnulloOrdine;
	}
	
	
}
