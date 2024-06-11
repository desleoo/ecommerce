package it.unirc.pwm.pattern.factory.ImmagineProdotto;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Vector;
import org.apache.commons.io.FileUtils;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import it.unirc.pwm.hibernate.util.HibernateUtil;
import it.unirc.pwm.EntityMappingHB.ImmagineProdotto;


public class ImmagineProdottoDAOSimpleImp implements ImmagineProdottoDAO {

	@Override
	public boolean salvaImmagineProdotto(ImmagineProdotto imgT) {
		Session session=HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		boolean result=true;
		
		try {
			transaction=session.beginTransaction();
			session.save(imgT);
			transaction.commit();
		} catch (HibernateException e) {
			transaction.rollback();
			}finally {
				if (session!=null) //spesso omesso
					session.close();
			}
		
	return result;
	}



	@Override
	public boolean modificaImmagineTitolo(it.unirc.pwm.EntityMappingHB.ImmagineProdotto imgT) {
		// TODO Auto-generated method stub
		return false;
	}



	@Override
	public boolean EliminaImmagineProdotto(ImmagineProdotto imgT) {
		// TODO Auto-generated method stub
		return false;
	}

	
	
	
	
	


	

	
}	