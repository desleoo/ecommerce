package it.unirc.pwm.pattern.factory.Ordine;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import it.unirc.pwm.EntityMappingHB.Ordine;
import it.unirc.pwm.hibernate.util.HibernateUtil;

public class OrdineDAOSimpleImp implements OrdineDAO { //SELECT * FROM WHERE
	
	private final static String TAG="OrdineDAOSimpleImp.java";

	
	public Ordine getOrdine(Ordine o) {
				Session session=HibernateUtil.getSessionFactory().openSession();
				try {
					o=(Ordine) session.get(Ordine.class, o.getIdordine());
				} catch (HibernateException e) {
					// TODO: handle exception
				}
				finally {
					if (session!=null) 
						session.close();
				}
			return null;
		}

//---------------------------------------------------------------------------------------------------------------------------------------------------
			
	public List <Ordine> getOrdini() { //SELECT * FROM 
				Session session=HibernateUtil.getSessionFactory().openSession();
				Transaction transaction = session.beginTransaction();
					@SuppressWarnings({ "unchecked", "unused" })
					List<Ordine> cAll=(List<Ordine>) session.createSQLQuery("Select * from Ordine").addEntity(Ordine.class).list();
					
					transaction.commit();
					session.close();
					return cAll;
			}

//--------------------------------------------------------------------------------------------------------------------------------------------------
	
	//---------------------------------------------------------------------------------------------------------------------------------------------------
	
		public List <Ordine> getOrdiniCliente(int idcliente) { //SELECT * FROM 
				Session session=HibernateUtil.getSessionFactory().openSession();
				try {
					@SuppressWarnings({ "unchecked", "unused" })
					List<Ordine> oAll=(List<Ordine>) session.createSQLQuery("Select * from Ordine where cliente =:cliente").setParameter("cliente", idcliente).addEntity(Ordine.class).list();
					

					return oAll;
					
				} catch (HibernateException e) {
					return null;
				}
			}
				

	//--------------------------------------------------------------------------------------------------------------------------------------------------
			
	public boolean salvaOrdine(Ordine o) { //INSERT INTO
		

		Session session=HibernateUtil.getSessionFactory().openSession();
				Transaction transaction = null;
				boolean result=true;
				try {

					transaction=session.beginTransaction();
					
					System.out.println("l'ordine è ");
					System.out.println(o.toString());
					int orderid = (Integer) session.save(o);					
					System.out.println(" l'ordine appena salvato ha id: "+orderid);	

					transaction.commit();

				} catch (HibernateException e) {
					System.out.println(e.getMessage());	

					System.out.println(" ERRORE nel pagamento ");	

					transaction.rollback();
					}finally {
						if (session!=null) //spesso omesso
							session.close();
					}
			return result;
		}
//-------------------------------------------------------------------------------------------------------------------------------------------------
			
	public boolean eliminaOrdine(Ordine o) { //DELETE FROM
					Session session = HibernateUtil.getSessionFactory().openSession();
					Transaction transaction = null;
					boolean result=true;
					try {
						transaction = session.beginTransaction();
						session.delete(o);
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

	public boolean modificaOrdine(Ordine o) { //UPDATE
				Session session = HibernateUtil.getSessionFactory().openSession();
				Transaction transaction = null;
				boolean result=true;
				try {
					transaction = session.beginTransaction();
					session.update(o);
					transaction.commit();
				} catch (HibernateException e) {
					transaction.rollback();
					result=false;
				}finally {
					if (session!=null) 
						session.close();
				}
				return result;
				}}




