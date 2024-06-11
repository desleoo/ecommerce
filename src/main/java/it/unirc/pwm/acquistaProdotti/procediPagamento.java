package it.unirc.pwm.acquistaProdotti;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import it.unirc.pwm.EntityMappingHB.Account;
import it.unirc.pwm.EntityMappingHB.Cartadicredito;
import it.unirc.pwm.EntityMappingHB.Cliente;
import it.unirc.pwm.EntityMappingHB.Contrassegno;
import it.unirc.pwm.EntityMappingHB.CorriereExp;
import it.unirc.pwm.EntityMappingHB.Ordine;
import it.unirc.pwm.EntityMappingHB.Pagamento;
import it.unirc.pwm.EntityMappingHB.Prodotto;
import it.unirc.pwm.EntityMappingHB.Spedizione;
import it.unirc.pwm.hibernate.util.HibernateUtil;
import it.unirc.pwm.pattern.factory.Cartadicredito.CartadicreditoDAO;
import it.unirc.pwm.pattern.factory.Cartadicredito.CartadicreditoDAOFactory;
import it.unirc.pwm.pattern.factory.Cliente.ClienteDAO;
import it.unirc.pwm.pattern.factory.Cliente.ClienteDAOFactory;
import it.unirc.pwm.pattern.factory.Contrassegno.ContrassegnoDAO;
import it.unirc.pwm.pattern.factory.Contrassegno.ContrassegnoDAOFactory;
import it.unirc.pwm.pattern.factory.CorriereExp.CorriereExpDAO;
import it.unirc.pwm.pattern.factory.CorriereExp.CorriereExpDAOFactory;
import it.unirc.pwm.pattern.factory.Ordine.OrdineDAO;
import it.unirc.pwm.pattern.factory.Ordine.OrdineDAOFactory;
import it.unirc.pwm.pattern.factory.Prodotto.ProdottoDAO;
import it.unirc.pwm.pattern.factory.Prodotto.ProdottoDAOFactory;
import it.unirc.pwm.pattern.factory.Spedizione.SpedizioneDAO;
import it.unirc.pwm.pattern.factory.Spedizione.SpedizioneDAOFactory;
import it.unirc.pwm.utils.DateManager;

public class procediPagamento extends ActionSupport {





	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private final String SUCCESSCONTR = "SUCCESSCONTR";
	private final String SUCCESSCARTA = "SUCCESSCARTA";
	private final String SUCCESSPAG = "SUCCESSPAG";


	private Map<String,Object> session; 

	private Cliente c;
	private String SelectedSped;
	private String SelectedPag;
	private	String nomeInt;
	private String cognomeInt;
	private long numCart;
	private String scadenza;
	private int cvv;

	

	public Map<String, Object> getSession() {
		return session;
	}



	public void setSession(Map<String, Object> session) {
		this.session = session;
	}



	public String getNomeInt() {
		return nomeInt;
	}



	public void setNomeInt(String nomeInt) {
		this.nomeInt = nomeInt;
	}



	public String getCognomeInt() {
		return cognomeInt;
	}



	public void setCognomeInt(String cognomeInt) {
		this.cognomeInt = cognomeInt;
	}



	public long getNumCart() {
		return numCart;
	}



	public void setNumCart(long numCart) {
		this.numCart = numCart;
	}



	public String getScadenza() {
		return scadenza;
	}



	public void setScadenza(String scadenza) {
		this.scadenza = scadenza;
	}



	public int getCvv() {
		return cvv;
	}



	public void setCvv(int cvv) {
		this.cvv = cvv;
	}



	public String getSUCCESSCONTR() {
		return SUCCESSCONTR;
	}



	public String getSUCCESSCARTA() {
		return SUCCESSCARTA;
	}



	public String getSUCCESSPAG() {
		return SUCCESSPAG;
	}



	public String getSelectedSped() {
		return SelectedSped;
	}



	public void setSelectedSped(String selectedSped) {
		SelectedSped = selectedSped;
	}



	public String getSelectedPag() {
		return SelectedPag;
	}



	public void setSelectedPag(String selectedPag) {
		SelectedPag = selectedPag;
	}



	public Cliente getC() {
		return c;
	}



	public void setC(Cliente c) {
		this.c = c;
	}



	public static long getSerialversionuid() {
		return serialVersionUID;
	}



	public String execute()throws Exception {

if(c.getIndirizzoCitta()==null || c.getIndirizzoVia()==null || c.getIndirizzoCivico()==null || c.getIndirizzoDescrizione()==null || c.getIndirizzoCap()==null  ) {
	throw new Exception("Non è implementato l'acquisto per utenti senza indirizzo. Per ora, inserire l'indirizzo da 'http://localhost:8080/ecommerce_CorsoDeLeo/autenticazione/secure/modificaCliente.action'. Successivamente sarà possibile eseguire l'acquisto ");
}


		session = ActionContext.getContext().getSession();

		Cliente c=new Cliente();
		ClienteDAO cDAO = ClienteDAOFactory.getDAO();
		Account a = (Account)session.get("account");
		Cliente cliente = a.getCliente();
		ProdottoDAO pDAO= ProdottoDAOFactory.getDAO();

		Prodotto p=new Prodotto ();
		int idprodotto=(int) session.get("idprodotto");
		p.setIdprodotto(idprodotto);
		Prodotto prodotto= pDAO.getProdotto(p);

		//CREO ORDINE
		Ordine ordine= new Ordine();
		OrdineDAO oDAO=OrdineDAOFactory.getDAO();
		ordine.setCliente(cliente);
		ordine.setStato("Confermato");
		ordine.setDataordine(DateManager.getToday());
		ordine.setDataConfermaOrdine(DateManager.getToday());
		ordine.setDataAnnulloOrdine(null);

		Set<Prodotto> prodottosSet = new HashSet<Prodotto> (); 
		prodottosSet.add(prodotto);

		ordine.setProdottos(prodottosSet);

		//CREO SPEDIZIONE STANDARD
		Spedizione spedStd=new Spedizione(); 
		spedStd.setDatapartenza(DateManager.getToday());
		spedStd.setDataconsegna(DateManager.getToday());

		//CREO SPEDIZIONE EXP
		double prezzoexp=10;
		Spedizione spedexp=new CorriereExp(DateManager.getToday(), DateManager.getToday(), ordine, prezzoexp);

		//CREO CONTRASSEGNO
		Pagamento pagcontr=new Contrassegno();
		//CREO CARTA DI CREDITO
		double importocarta;
		if(SelectedSped.equals("Spedizione Standard - gratuita")) {
			importocarta=prodotto.getPrezzo();	

		}else{
			importocarta=prodotto.getPrezzo()+10;
		} 

		Pagamento pagcarta=new Cartadicredito(ordine.getDataConfermaOrdine(), importocarta, nomeInt, cognomeInt, numCart, scadenza, cvv);


		SpedizioneDAO sDAO=SpedizioneDAOFactory.getDAO();
		ContrassegnoDAO contrDAO = ContrassegnoDAOFactory.getDAO();
		CartadicreditoDAO crtDAO = CartadicreditoDAOFactory.getDAO();

		//SPEDIZIONE STANDARD
		if(SelectedSped.equals("Spedizione Standard - gratuita")) {
			spedStd.setOrdine(ordine);

			//PAGAMENTO CONTRASSEGNO
			if(SelectedPag.equals("Contrassegno")) {
				pagcontr.setDatapagamento(spedStd.getDataconsegna());
				pagcontr.setImporto(prodotto.getPrezzo());		
			}else {	
				//PAGAMENTO CARTA DI CREDITO
				pagcarta.setDatapagamento(DateManager.getToday());
				pagcarta.setImporto(prodotto.getPrezzo());
			}



			if(oDAO.salvaOrdine(ordine)&&(sDAO.salvaSpedizione(spedStd))){
				if(SelectedPag.equals("Contrassegno")) {
					pagcontr.setIdordine(ordine.getIdordine());

					ordine.setPagamento(pagcontr);
					contrDAO.salvaContrassegno(pagcontr);

				}else {
					pagcarta.setIdordine(ordine.getIdordine());

					ordine.setPagamento(pagcarta);
					crtDAO.salvaCartadicredito(pagcarta);
				}

				System.out.println("FUNZIONA");

				return SUCCESSPAG;
			}else {
				System.out.println("NON FUNZIONA");
			}

		}else //SE HO SCELTO SPEDIZIONE EXP
		{
			spedexp.setOrdine(ordine);

			//PAGAMENTO CONTRASSEGNO
			if(SelectedPag.equals("Contrassegno")) {
				pagcontr.setIdordine(ordine.getIdordine());

				pagcontr.setDatapagamento(spedexp.getDataconsegna());
				pagcontr.setImporto(prodotto.getPrezzo()+10);
			}else {	
				//PAGAMENTO CARTA DI CREDITO
				pagcarta.setIdordine(ordine.getIdordine());

				pagcarta.setDatapagamento(DateManager.getToday());
				pagcarta.setImporto(prodotto.getPrezzo()+10);

			}

			CorriereExpDAO cEXPDAO=CorriereExpDAOFactory.getDAO();	
			if(oDAO.salvaOrdine(ordine)&&(cEXPDAO.salvaCorriereExp(spedexp))){
				if(SelectedPag.equals("Contrassegno")) {
					pagcontr.setIdordine(ordine.getIdordine());

					ordine.setPagamento(pagcontr);
					pagcontr.setOrdine(ordine);
					contrDAO.salvaContrassegno(pagcontr);
				}else {
					
					pagcarta.setIdordine(ordine.getIdordine());
					ordine.setPagamento(pagcarta);
					crtDAO.salvaCartadicredito(pagcarta);
					pagcarta.setOrdine(ordine);
				}

				return SUCCESSPAG;
			}else {
				System.out.println("NON FUNZIONA");
			}

		}
		return SUCCESSCONTR;
	}}
