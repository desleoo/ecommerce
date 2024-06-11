package it.unirc.pwm.pattern.factory.Cliente;

import java.util.List;
import java.util.Vector;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import it.unirc.pwm.EntityMappingHB.Cliente;
import it.unirc.pwm.hibernate.util.HibernateUtil;

public class ClienteDAOSimpleImp implements ClienteDAO{

	@Override
	public Cliente getCliente(Cliente c) { //SELECT * FROM WHERE
			Session session=HibernateUtil.getSessionFactory().openSession();
			try {
				c=(Cliente) session.get(Cliente.class, c.getIdcliente());
			} catch (HibernateException e) {
				// TODO: handle exception
			}
			finally {
				if (session!=null) 
					session.close();
			}
		return null;
	}
	//-------------------------------------------------------------------------------------------------------------------------------------------------
	@Override
	public List<Cliente> getClienti() { //SELECT * FROM 
		Session session=HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		
			@SuppressWarnings({ "unchecked", "unused" })
			List<Cliente> cAll=(List<Cliente>) session.createSQLQuery("Select * from Cliente").addEntity(Cliente.class).list();
		
		transaction.commit();
		session.close();
		return cAll;
	}
	//-------------------------------------------------------------------------------------------------------------------------------------------------
	@Override
	public boolean salvaCliente(Cliente c) { //INSERT INTO
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
	//-------------------------------------------------------------------------------------------------------------------------------------------------
	@Override
	public boolean eliminaCliente(Cliente c) { //DELETE FROM
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

	@Override
	public boolean modificaCliente(Cliente c) { //UPDATE
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
