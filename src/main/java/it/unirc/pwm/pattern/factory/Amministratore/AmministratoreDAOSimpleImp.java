package it.unirc.pwm.pattern.factory.Amministratore;

import java.util.List;
import java.util.Vector;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import it.unirc.pwm.EntityMappingHB.Amministratore;
import it.unirc.pwm.hibernate.util.HibernateUtil;

public class AmministratoreDAOSimpleImp implements AmministratoreDAO {
	
	
	public Amministratore getAmministratore(Amministratore a) {
		Session session=HibernateUtil.getSessionFactory().openSession();
		try {
			a=(Amministratore) session.get(Amministratore.class, a.getIdcliente());
		} catch (HibernateException e) {
			// TODO: handle exception
		}
		finally {
			if (session!=null) 
				session.close();
		}
	return null;
}

//--------------------------------------------------------------------------------------------------------------------------------------------------------
	
public List<Amministratore> getAmministratori() { //SELECT * FROM 
	Session session=HibernateUtil.getSessionFactory().openSession();
	
	try {
		@SuppressWarnings({ "unchecked", "unused" })
		List<Amministratore> aAll=new Vector<Amministratore>();
		aAll=(List<Amministratore>) session.createSQLQuery("Select * from Amministratore").addEntity(Amministratore.class).list();
		 return aAll;

	} catch (Exception e) {
return null;
}
	
	}

//-------------------------------------------------------------------------------------------------------------------------------------------------------
	
public boolean salvaAmministratore(Amministratore a) { //INSERT INTO
		Session session=HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		boolean result=true;
		try {
			transaction=session.beginTransaction();
			a=(Amministratore) session.save(a);
			transaction.commit();
		} catch (HibernateException e) {
			transaction.rollback();
			}finally {
				if (session!=null) //spesso omesso
					session.close();
			}
	return result;
}
//----------------------------------------------------------------------------------------------------------------------------------------------------------
	
public boolean eliminaAmministratore(Amministratore a) { //DELETE FROM
			Session session = HibernateUtil.getSessionFactory().openSession();
			Transaction transaction = null;
			boolean result=true;
			try {
				transaction = session.beginTransaction();
				session.delete(a);
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
//---------------------------------------------------------------------------------------------------------------------------------------------------------
public boolean modificaAmministratore(Amministratore a) { //UPDATE
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		boolean result=true;
		try {
			transaction = session.beginTransaction();
			session.update(a);
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