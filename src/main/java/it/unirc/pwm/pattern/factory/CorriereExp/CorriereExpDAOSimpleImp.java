package it.unirc.pwm.pattern.factory.CorriereExp;

import java.util.List;
import java.util.Vector;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import it.unirc.pwm.EntityMappingHB.CorriereExp;
import it.unirc.pwm.EntityMappingHB.Spedizione;
import it.unirc.pwm.hibernate.util.HibernateUtil;

public class CorriereExpDAOSimpleImp implements CorriereExpDAO {

	public CorriereExp getCorriere(CorriereExp c) {
			Session session=HibernateUtil.getSessionFactory().openSession();
			try {
				c=(CorriereExp) session.get(CorriereExp.class,c.getIdordine());
			} catch (HibernateException e) {
				// TODO: handle exception
			}
			finally {
				if (session!=null) 
					session.close();
			}
		return null;
	}

//-------------------------------------------------------------------------------------------------------------------------------------------------------
		
	public Vector<CorriereExp> getCorrieriExp() { //SELECT * FROM 
			Session session=HibernateUtil.getSessionFactory().openSession();
			try {
				@SuppressWarnings({ "unchecked", "unused" })
				List<CorriereExp> cAll=(List<CorriereExp>) session.createSQLQuery("Select * from CorriereExp").addEntity(CorriereExp.class).list();
			} catch (Exception e) {
				// TODO: handle exception
			}
			return null;
		}

//-------------------------------------------------------------------------------------------------------------------------------------------------------
	
		public boolean salvaCorriereExp(Spedizione c) { //INSERT INTO
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
		
//-------------------------------------------------------------------------------------------------------------------------------------------------------
		
		public boolean eliminaCorriereExp(CorriereExp c) { //DELETE FROM
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

//-------------------------------------------------------------------------------------------------------------------------------------------------------
		
		public boolean modificaCorriereExp(CorriereExp c) { //UPDATE
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
