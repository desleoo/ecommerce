package it.unirc.pwm.gestioneAdmin;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.hibernate.HibernateException;

import com.opensymphony.xwork2.ActionSupport;

import it.unirc.pwm.EntityMappingHB.ImmagineProdotto;
import it.unirc.pwm.EntityMappingHB.Prodotto;
import it.unirc.pwm.pattern.factory.ImmagineProdotto.ImmagineProdottoDAO;
import it.unirc.pwm.pattern.factory.ImmagineProdotto.ImmagineProdottoDAOFactory;
import it.unirc.pwm.pattern.factory.Prodotto.ProdottoDAO;
import it.unirc.pwm.pattern.factory.Prodotto.ProdottoDAOFactory;

public class SalvaProdotto extends ActionSupport{

	private static final long serialVersionUID = 1L;
	private Prodotto p;
	//VARIABILI PER FILE UPLOAD
	private File uploadFile;
	
	private String uploadFileFileName;	
	private String localDirectory = "/Users/valeriodeleo/Documents/uni/programmazione_web_mobile/progetto/backup127/ecommerce_CorsoDeLeo/src/main/webapp/assets/imgp";
	//FINE VARIABILI PER FILE UPLOAD


	public Prodotto getP() {
		return p;
	}


	public void setP(Prodotto p) {
		this.p = p;
	}


	public File getUploadFile() {
		return uploadFile;
	}


	public void setUploadFile(File uploadFile) {
		this.uploadFile = uploadFile;
	}

	public String getUploadFileFileName() {
		return uploadFileFileName;
	}


	public void setUploadFileFileName(String uploadFileFileName) {
		this.uploadFileFileName = uploadFileFileName;
	}


	public String getLocalDirectory() {
		return localDirectory;
	}


	public void setLocalDirectory(String localDirectory) {
		this.localDirectory = localDirectory;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}



	public String execute() throws Exception{	
		ProdottoDAO pDao= ProdottoDAOFactory.getDAO();
		File localFile = new File(localDirectory, uploadFileFileName);


		FileUtils.copyFile(uploadFile, localFile);

		

		String path="assets/imgp/"+localFile.getName();
		Prodotto prodotto = new Prodotto(p.getNomep(), p.getDescrizionep(), p.getPrezzo(), new ImmagineProdotto(uploadFileFileName, path));

		try {
			if((pDao.salvaProdotto(prodotto))) {
				return SUCCESS;
			}else {
				return INPUT;
			}
		}catch(HibernateException e)
		{
			throw new Exception("Il percorso "+localDirectory+" non va bene! Si consiglia di recarsi all'interno di 'it.unirc.pwm.gestioneAdmin.SalvaProdotto.java' e modificare 'String localDirectory' (riga 24) inserendo il proprio percorso che punti alla cartella '/assets/imgp' ");
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
