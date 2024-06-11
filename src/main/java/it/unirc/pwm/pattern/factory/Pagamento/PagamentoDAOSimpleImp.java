package it.unirc.pwm.pattern.factory.Pagamento;

import java.util.List;
import java.util.Vector;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import it.unirc.pwm.EntityMappingHB.Pagamento;
import it.unirc.pwm.hibernate.util.HibernateUtil;

public class PagamentoDAOSimpleImp implements PagamentoDAO {
    public Pagamento getPagamento(Pagamento p) {
	   
			Session session=HibernateUtil.getSessionFactory().openSession();
			try {
				p=(Pagamento) session.get(Pagamento.class, p.getIdordine());
			} catch (HibernateException e) {
				// TODO: handle exception
			}
			finally {
				if (session!=null) 
					session.close();
			}
		return null;
	}

//-------------------------------------------------------------------------------------------------------------------------------------------
		
	public Vector<Pagamento> getPagamenti() { //SELECT * FROM 
			Session session=HibernateUtil.getSessionFactory().openSession();
			try {
				@SuppressWarnings({ "unchecked", "unused" })
				List<Pagamento> cAll=(List<Pagamento>) session.createSQLQuery("Select * from Pagamento").addEntity(Pagamento.class).list();
			} catch (Exception e) {
				// TODO: handle exception
			}
			return null;
		}

//--------------------------------------------------------------------------------------------------------------------------------------------
		
	public boolean salvaPagamento(Pagamento p) { //INSERT INTO
			Session session=HibernateUtil.getSessionFactory().openSession();
			Transaction transaction = null;
			boolean result=true;
			try {
				transaction=session.beginTransaction();
				p=(Pagamento) session.save(p);
				transaction.commit();
			} catch (HibernateException e) {
				transaction.rollback();
				}finally {
					if (session!=null) //spesso omesso
						session.close();
				}
		return result;
	}
//--------------------------------------------------------------------------------------------------------------------------------------------
		
	public boolean eliminaPagamento(Pagamento p) { //DELETE FROM
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
//----------------------------------------------------------------------------------------------------------------------------------------------------
	public boolean modificaPagamento(Pagamento p) { //UPDATE
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
