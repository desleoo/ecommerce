package it.unirc.pwm.pattern.factory.Cartadicredito;

import java.util.List;
import java.util.Vector;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import it.unirc.pwm.EntityMappingHB.Cartadicredito;
import it.unirc.pwm.EntityMappingHB.Pagamento;
import it.unirc.pwm.hibernate.util.HibernateUtil;

public class CartadicreditoDAOSimpleImp implements CartadicreditoDAO {
   public Cartadicredito getCartadicredito(Cartadicredito c) {
		Session session=HibernateUtil.getSessionFactory().openSession();
		try {
			c=(Cartadicredito) session.get(Cartadicredito.class,c.getIdordine());
		} catch (HibernateException e) {
			// TODO: handle exception
		}
		finally {
			if (session!=null) 
				session.close();
		}
	return null;
}

//---------------------------------------------------------------------------------------------------------------------------------------------
	
public Vector<Cartadicredito> getCartedicredito() { //SELECT * FROM 
		Session session=HibernateUtil.getSessionFactory().openSession();
		try {
			@SuppressWarnings({ "unchecked", "unused" })
			List<Cartadicredito> cAll=(List<Cartadicredito>) session.createSQLQuery("Select * from Cartadicredito").addEntity(Cartadicredito.class).list();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}

//-----------------------------------------------------------------------------------------------------------------------------------------------

	public boolean salvaCartadicredito(Pagamento c) { //INSERT INTO
		Session session=HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		boolean result=true;
		try {
			transaction=session.beginTransaction();
			session.save(c);
			transaction.commit();
		} catch (HibernateException e) {
			transaction.rollback();
			}finally {
				if (session!=null) //spesso omesso
					session.close();
			}
	return result;
}
	
//------------------------------------------------------------------------------------------------------------------------------------------------
	
	public boolean eliminaCartadicredito(Cartadicredito c) { //DELETE FROM
			Session session = HibernateUtil.getSessionFactory().openSession();
			Transaction transaction = null;
			boolean result=true;
			try {
				transaction = session.beginTransaction();
				session.delete(c);
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

//----------------------------------------------------------------------------------------------------------------------------------------------
	public boolean modificaCartadicredito(Cartadicredito c) { //UPDATE
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		boolean result=true;
		try {
			transaction = session.beginTransaction();
			session.update(c);
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
