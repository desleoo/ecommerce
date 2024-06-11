package it.unirc.pwm.EntityMappingHB;


import it.unirc.pwm.hibernate.util.HibernateUtil;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Esecuzione {
	private List<Amministratore> aList;

	public static void main(String[] args) throws ParseException {
		//-------------------------------------------------//
		//PARAMETRI ACCOUNT ADMIN
		String nome="Pietro";
		String cognome="De Sica";
		
		String sDate1="31/12/1998";  
		Date datanascita=new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);  
		
		long telefono=345793343;
		String email="admin1@gmail.com";
		String indirizzocitta="Roma";
		String indirizzovia="Sbarre Centrali";
		String indirizzocivico="34";
		Integer indirizzocap=23432;
		String indirizzodescrizione="Cancello nero, secondo piano";
		
		String username="Admin1admin1";
		String password="Admin1admin1";
		
		String codicefiscale="DYYTHQ32E41I157D";
		
		Cliente cliente = new Cliente();
		Account account =new Account();
		Amministratore amministratore=new Amministratore();
		
		cliente.setNome(nome);
		cliente.setCognome(cognome);
		cliente.setDatanascita(datanascita);
		cliente.setTelefono(telefono);
		cliente.setEmail(email);
		cliente.setIndirizzoCitta(indirizzocitta);
		cliente.setIndirizzoVia(indirizzovia);
		cliente.setIndirizzoCivico(indirizzocivico);
		cliente.setIndirizzoCap(indirizzocap);
		cliente.setIndirizzoDescrizione(indirizzodescrizione);
		
		account.setUsername(username);
		account.setPassword(password);
		
		amministratore.setNomeamministratore(nome);
		amministratore.setCognomeamministratore(cognome);
		amministratore.setCodicefiscale(codicefiscale);
		
		account.setCliente(cliente);
		amministratore.setCliente(cliente);
		//-------------------------------------------------//
		
		//-------------------------------------------------//
		//PARAMETRI ACCOUNT User1 (con indirizzo)
		String nomeU1="Antonio";
		String cognomeU1="Boldi";
		
		String sDate1U1="14/04/1992";  
		Date datanascitaU1=new SimpleDateFormat("dd/MM/yyyy").parse(sDate1U1);  
		
		long telefonoU1=345793343;
		String emailU1="user1@outlook.it";
		String indirizzocittaU1="Napoli";
		String indirizzoviaU1="Dei Partecipi";
		String indirizzocivicoU1="89A";
		Integer indirizzocapU1=19234;
		String indirizzodescrizioneU1="Palazzo Giallo, primo piano.";
		
		String usernameU1="User1user1";
		String passwordU1="User1user1";
		
		Cliente clienteU1 = new Cliente();
		Account accountU1 =new Account();
		
		clienteU1.setNome(nomeU1);
		clienteU1.setCognome(cognomeU1);
		clienteU1.setDatanascita(datanascitaU1);
		clienteU1.setTelefono(telefonoU1);
		clienteU1.setEmail(emailU1);
		clienteU1.setIndirizzoCitta(indirizzocittaU1);
		clienteU1.setIndirizzoVia(indirizzoviaU1);
		clienteU1.setIndirizzoCivico(indirizzocivicoU1);
		clienteU1.setIndirizzoCap(indirizzocapU1);
		clienteU1.setIndirizzoDescrizione(indirizzodescrizioneU1);
		
		accountU1.setUsername(usernameU1);
		accountU1.setPassword(passwordU1);
		
		accountU1.setCliente(clienteU1);
		//-------------------------------------------------//

		//-------------------------------------------------//
		//PARAMETRI ACCOUNT User2 (senza indirizzo)
		String nomeU2="Marisa";
		String cognomeU2="Locicero";
				
		String sDate1U2="20/08/1997";  
		Date datanascitaU2=new SimpleDateFormat("dd/MM/yyyy").parse(sDate1U2);  
				
		long telefonoU2=345793343;
		String emailU2="user2@live.it";
//		String indirizzocittaU2="Roma";
//		String indirizzoviaU2="Sbarre Centrali";
//		String indirizzocivicoU2="34";
//		Integer indirizzocapU2=23432;
//		String indirizzodescrizioneU2="Bella Casa";
				
		String usernameU2="User2user2";
		String passwordU2="User2user2";
				
		Cliente clienteU2 = new Cliente();
		Account accountU2 =new Account();
				
		clienteU2.setNome(nomeU2);
		clienteU2.setCognome(cognomeU2);
		clienteU2.setDatanascita(datanascitaU2);
		clienteU2.setTelefono(telefonoU2);
		clienteU2.setEmail(emailU2);
//		clienteU2.setIndirizzoCitta(indirizzocittaU2);
//		clienteU2.setIndirizzoVia(indirizzoviaU2);
//		clienteU2.setIndirizzoCivico(indirizzocivicoU2);
//		clienteU2.setIndirizzoCap(indirizzocapU2);
//		clienteU2.setIndirizzoDescrizione(indirizzodescrizioneU2);
				
		accountU2.setUsername(usernameU2);
		accountU2.setPassword(passwordU2);
				
		accountU2.setCliente(clienteU2);
		//-------------------------------------------------//
		
		//-------------------------------------------------//
		//Creazione Prodotto1
		Prodotto prodotto1 = new Prodotto("Iphone12 128GB - Product Red", "Con il 5G, iPhone è molto più che veloce: vola. Supporta più bande 5G per darti la migliore copertura globale e viaggia a velocità da Wi‑Fi.⁴ Puoi scaricare un film in un attimo, guardare video ad altissima definizione in streaming e usare FaceTime in HD sulla rete cellulare. E‑tutto fila via più liscio.", 690, new ImmagineProdotto("iphone12.png", "assets/imgp/iphone12.png"));
		//-------------------------------------------------//
		
		
		//-------------------------------------------------//
		//Creazione Prodotto2
		Prodotto prodotto2 = new Prodotto("Iphone13 128GB - Blu", "iPhone 13. Con il sistema a doppia fotocamera più evoluto mai visto su un iPhone. Velocissimo chip A15 Bionic. Autonomia senza precedenti. Design robusto. 5G ultrarapido. E un display Super Retina XDR ancora più luminoso.", 800, new ImmagineProdotto("iphone13.jpeg", "assets/imgp/iphone13.jpeg"));
		//-------------------------------------------------//
		
		//-------------------------------------------------//
		//Creazione Prodotto3
		Prodotto prodotto3 = new Prodotto("Iphone14 - 258GB - Viola scuro", "iPhone 14. Con un sistema a doppia fotocamera ancora più spettacolare scatti foto bellissime sia con poca luce sia in pieno sole. E Rilevamento incidenti, una nuova funzione di sicurezza, chiama i soccorsi se tu non puoi.", 1159, new ImmagineProdotto("iphone14.jpg", "assets/imgp/iphone14.jpg"));
		//-------------------------------------------------//

		
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		try {
			
			
			
			transaction = session.beginTransaction();
			
			session.save(cliente);
			session.save(account);
			session.save(amministratore);
			
			session.save(clienteU1);
			session.save(accountU1);
			
			session.save(clienteU2);
			session.save(accountU2);
			
			session.save(prodotto1);
			session.save(prodotto2);
			session.save(prodotto3);



			

			transaction.commit();
		} catch (HibernateException e) {
			transaction.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}

	
}
}
