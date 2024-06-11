package it.unirc.pwm.gestioneAdmin;

import java.util.Map;

import org.hibernate.HibernateException;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import it.unirc.pwm.EntityMappingHB.ImmagineProdotto;
import it.unirc.pwm.EntityMappingHB.Prodotto;
import it.unirc.pwm.pattern.factory.ImmagineProdotto.ImmagineProdottoDAO;
import it.unirc.pwm.pattern.factory.ImmagineProdotto.ImmagineProdottoDAOFactory;
import it.unirc.pwm.pattern.factory.Prodotto.ProdottoDAO;
import it.unirc.pwm.pattern.factory.Prodotto.ProdottoDAOFactory;


public class ModificaProdotto extends ActionSupport{
	
	private static final long serialVersionUID = 1L;
	private Prodotto p;
	
	public Prodotto getP() {
		return p;
	}

	public void setP(Prodotto p) {
		this.p = p;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	public String execute() throws Exception{
	ProdottoDAO pDAO = ProdottoDAOFactory.getDAO();
	ImmagineProdottoDAO imgDAO = ImmagineProdottoDAOFactory.getDAO();
	try {
	Prodotto ptemp= pDAO.getProdotto(p);
	ImmagineProdotto imgprodotto = new ImmagineProdotto();
	imgprodotto.setImgTname(ptemp.getImmagineProdotto().getImgTname());
	imgprodotto.setPath(ptemp.getImmagineProdotto().getPath());
		
	ptemp.setNomep(p.getNomep());
	ptemp.setPrezzo(p.getPrezzo());
	ptemp.setDescrizionep(p.getDescrizionep());
	ptemp.setImmagineProdotto(imgprodotto);
	
	if(pDAO.modificaProdotto(ptemp)) {
		return SUCCESS;}
    else {
    	return INPUT;
    }

	}catch (HibernateException e) {
		return null;
	}

	}
	
	public void validate() {
		if (p.getNomep().length()<3) {
			this.addFieldError("p.nomep", "Inserire il nome del Prodotto");
		}
		
		if (p.getDescrizionep().length()<15) {
			this.addFieldError("p.descrizionep", "La descrizione deve essere maggiore di 15 caratteri");
		}
		
		
		if (p.getPrezzo()==0) {
			this.addFieldError("p.prezzo", "Inserire Prezzo");
		}
		
		
	}
	
	}


