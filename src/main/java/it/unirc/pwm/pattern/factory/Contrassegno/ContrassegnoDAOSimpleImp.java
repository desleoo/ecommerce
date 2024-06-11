package it.unirc.pwm.pattern.factory.Contrassegno;

import java.util.List;
import java.util.Vector;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import it.unirc.pwm.EntityMappingHB.Contrassegno;
import it.unirc.pwm.EntityMappingHB.Pagamento;
import it.unirc.pwm.hibernate.util.HibernateUtil;

public class ContrassegnoDAOSimpleImp implements ContrassegnoDAO {
	public Contrassegno getContrassegno(Contrassegno c) {
		Session session=HibernateUtil.getSessionFactory().openSession();
		try {
			c=(Contrassegno) session.get(Contrassegno.class, c.getIdordine());
		} catch (HibernateException e) {
			// TODO: handle exception
		}
		finally {
			if (session!=null) 
				session.close();
		}
	return null;
}

//-------------------------------------------------------------------------------------------------------------------------------------

public Vector<Contrassegno> getContrassegni() { //SELECT * FROM 
	Session session=HibernateUtil.getSessionFactory().openSession();
	try {
		@SuppressWarnings({ "unchecked", "unused" })
		List<Contrassegno> cAll=(List<Contrassegno>) session.createSQLQuery("Select * from Contrassegno").addEntity(Contrassegno.class).list();
	} catch (Exception e) {
		// TODO: handle exception
	}
	return null;
}

//-------------------------------------------------------------------------------------------------------------------------------------

public boolean salvaContrassegno(Pagamento c) { //INSERT INTO
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

//-------------------------------------------------------------------------------------------------------------------------------------

public boolean eliminaContrassegno(Contrassegno c) { //DELETE FROM
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

//-------------------------------------------------------------------------------------------------------------------------------------

public boolean modificaContrassegno(Contrassegno c) { //UPDATE
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

