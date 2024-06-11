package it.unirc.pwm.EntityMappingMy;


import it.unirc.pwm.hibernate.util.HibernateUtil;


import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Esecuzione {

	public static void main(String[] args) {
		// Vedi note esercitazioni precedenti
		//Cliente Cliente = new Cliente(1, "Mario", "Rossi", "PROVA", new Indirizzo("PROVA","PROVA","PROVA", 89123));

		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();

			//session.save(Cliente);
			
			//la matricola non è più 10
			//System.out.println(Cliente.getIdcliente());

			transaction.commit();
		} catch (HibernateException e) {
			transaction.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}

		session = HibernateUtil.getSessionFactory().openSession();
		try {
			transaction = session.beginTransaction();

			//@SuppressWarnings({ "unchecked" })
			//List<Cliente> c = (List<Cliente>) session.createSQLQuery("Select * from Cliente").addEntity(Cliente.class).list();
			//for (Cliente cl : c)
			//	System.out.println(cl.getIdcliente() + "\t" + cl.getNome() + "\t" + cl.getCognome() + "\t" + cl.getCf());

			transaction.commit();
		} catch (HibernateException e) {
			transaction.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		HibernateUtil.close();
	}
}
