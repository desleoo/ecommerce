package it.unirc.pwm.pattern.factory.Spedizione;

import java.util.List;
import java.util.Vector;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import it.unirc.pwm.EntityMappingHB.Ordine;
import it.unirc.pwm.EntityMappingHB.Prodotto;
import it.unirc.pwm.EntityMappingHB.Spedizione;
import it.unirc.pwm.hibernate.util.HibernateUtil;

public class SpedizioneDAOSimpleImp implements SpedizioneDAO {
	public Spedizione getSpedizione(Spedizione s) {
		Session session=HibernateUtil.getSessionFactory().openSession();
		try {
			s=(Spedizione) session.get(Spedizione.class, s.getIdordine());
		} catch (HibernateException e) {
			// TODO: handle exception
		}
		finally {
			if (session!=null) 
				session.close();
		}
	return null;
}

//----------------------------------------------------------------------------------------------------------------------------------------------------
	
	@SuppressWarnings("unchecked")
	public List<Spedizione> getSpedizioni() { //SELECT * FROM 
		Session session=HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
			@SuppressWarnings({ "unchecked", "unused" })
			List<Spedizione> cAll=(List<Spedizione>) session.createSQLQuery("Select * from Spedizione").addEntity(Spedizione.class).list();
			
			
			transaction.commit();
			session.close();
			return cAll;
		
		
}

//-----------------------------------------------------------------------------------------------------------------------------------------------------
	
	public boolean salvaSpedizione(Spedizione s) { //INSERT INTO
		Session session=HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		boolean result=true;
		try {
			transaction=session.beginTransaction();
			session.save(s);
			transaction.commit();
		} catch (HibernateException e) {
			transaction.rollback();
			}finally {
				if (session!=null) //spesso omesso
					session.close();
			}
	return result;
}
//---------------------------------------------------------------------------------------------------------------------------------------------------
	
	public boolean eliminaSpedizione(Spedizione s) { //DELETE FROM
			Session session = HibernateUtil.getSessionFactory().openSession();
			Transaction transaction = null;
			boolean result=true;
			try {
				transaction = session.beginTransaction();
				session.delete(s);
				transaction.commit();
			} catch (HibernateException e) {
				transaction.rollback();
				result=false;
			}finally {
				if (session!=null) 
					session.close();
			}
			return result;
		}
//---------------------------------------------------------------------------------------------------------------------------------------------------
	public boolean modificaSpedizione(Spedizione s) { //UPDATE
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		boolean result=true;
		try {
			transaction = session.beginTransaction();
			session.update(s);
			transaction.commit();
		} catch (HibernateException e) {
			transaction.rollback();
			result=false;
		}finally {
			if (session!=null) 
				session.close();
		}
		return result;
	}
}
