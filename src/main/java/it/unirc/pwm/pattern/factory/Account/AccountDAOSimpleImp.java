package it.unirc.pwm.pattern.factory.Account;

import java.util.List;
import java.util.Vector;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import it.unirc.pwm.EntityMappingHB.Account;
import it.unirc.pwm.hibernate.util.HibernateUtil;

public class AccountDAOSimpleImp implements AccountDAO {
	
	
	public Account getAccount(Account a) {
		Session session=HibernateUtil.getSessionFactory().openSession();
		try {

			String username = a.getUsername();
			String password = a.getPassword();

			Account account=new Account();
			account = (Account) session.createQuery("FROM Account A WHERE A.username = : username").setParameter("username", username).uniqueResult();
			if (account != null && account.getPassword().equals(password)) {			

				return account;
			}
			
		} catch (HibernateException e) {
			// TODO: handle exception
		}
		
		finally {
			if (session!=null) 
				session.close();
		}
		return null;
	
}

//------------------------------------------------------------------------------------------------------------------------------------------------------
	
	public Vector<Account> getAccounts() { //SELECT * FROM 
		Session session=HibernateUtil.getSessionFactory().openSession();
		try {
			@SuppressWarnings({ "unchecked", "unused" })
			List<Account> cAll=(List<Account>) session.createSQLQuery("Select * from Account").addEntity(Account.class).list();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}

//------------------------------------------------------------------------------------------------------------------------------------------------------
	
	public boolean salvaAccount(Account a) { //INSERT INTO
		Session session=HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		boolean result=true;
		try {
			transaction=session.beginTransaction();
			session.save(a);
			transaction.commit();
		} catch (HibernateException e) {
			transaction.rollback();
			}finally {
				if (session!=null) //spesso omesso
					session.close();
			}
	return result;
}
//----------------------------------------------------------------------------------------------------------------------------------------------------
	
	public boolean eliminaAccount(Account a) { //DELETE FROM
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
//----------------------------------------------------------------------------------------------------------------------------------------------------
	public boolean modificaAccount(Account a) { //UPDATE
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