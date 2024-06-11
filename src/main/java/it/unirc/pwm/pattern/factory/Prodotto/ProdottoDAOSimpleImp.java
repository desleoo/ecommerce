package it.unirc.pwm.pattern.factory.Prodotto;

import java.util.List;
import java.util.Vector;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import it.unirc.pwm.EntityMappingHB.Prodotto;
import it.unirc.pwm.hibernate.util.HibernateUtil;


public class ProdottoDAOSimpleImp implements ProdottoDAO { //SELECT * FROM WHERE
    
	public Prodotto getProdotto(Prodotto p) {
		Session session=HibernateUtil.getSessionFactory().openSession();
		try {
			 p=(Prodotto) session.get(Prodotto.class, p.getIdprodotto());
		} catch (HibernateException e) {
			// TODO: handle exception
		}
		finally {
			if (session!=null) 
				session.close();
		}
	return p;
}

//--------------------------------------------------------------------------------------------------------------------------------------------
	
	@SuppressWarnings("unchecked")
	public List<Prodotto> getProdotti() { //SELECT * FROM 
		
			HibernateUtil hbu= new HibernateUtil();
		
		
			Session session=hbu.getSessionFactory().openSession();
			Transaction transaction = session.beginTransaction();
			
			@SuppressWarnings({ "unused" })
			List<Prodotto> cAll=new Vector<Prodotto>();
			cAll=(List<Prodotto>) session.createSQLQuery("Select * from prodotto").addEntity(Prodotto.class).list();
			
			transaction.commit();
			session.close();
	
		return cAll;
	}

//--------------------------------------------------------------------------------------------------------------------------------------------
	
	public boolean salvaProdotto(Prodotto p) { //INSERT INTO
		Session session=HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		boolean result=true;
		try {
			transaction=session.beginTransaction();
			session.save(p);
			transaction.commit();
		} catch (HibernateException e) {
			transaction.rollback();
			}finally {
				if (session!=null) //spesso omesso
					session.close();
			}
	return result;
}
//------------------------------------------------------------------------------------------------------------------------------------------
	
	public boolean eliminaProdotto(Prodotto p) { //DELETE FROM
			Session session = HibernateUtil.getSessionFactory().openSession();
			Transaction transaction = null;
			boolean result=true;
			try {
				transaction = session.beginTransaction();
				session.delete(p);
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
//-------------------------------------------------------------------------------------------------------------------------------------------
	public boolean modificaProdotto(Prodotto p) { //UPDATE
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		boolean result=true;
		try {
			transaction = session.beginTransaction();
			session.update(p);
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
