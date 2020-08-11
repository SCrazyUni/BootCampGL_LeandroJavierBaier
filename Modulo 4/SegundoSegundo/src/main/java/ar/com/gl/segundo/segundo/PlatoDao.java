package ar.com.gl.segundo.segundo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import resources.HibernateUtil;

public class PlatoDao {

	public void createPlato(Plato plato)
	{
		Transaction transaction = null;
		try(Session session = HibernateUtil.getSessionFactory().openSession())
		{
			transaction = session.beginTransaction();
			session.save(plato);
			transaction.commit();
		}
		catch(Exception e)
		{
			if(transaction != null)
			{
				transaction.rollback();
			}
			e.printStackTrace();
		}
	}
	
	public List<Plato> getPlatos()
	{
		try(Session session = HibernateUtil.getSessionFactory().openSession())
		{
			return session.createQuery("from Plato", Plato.class).list();
		}
	}
	
	public List<Plato> getPlatos(int id)
	{
		try(Session session = HibernateUtil.getSessionFactory().openSession())
		{
			return session.createQuery("from Plato p where p.id=:id", Plato.class).setParameter("id", id).list();
		}
	}
	
	public void updatePlato(Plato plato)
	{
		Transaction transaction = null;
		try(Session session = HibernateUtil.getSessionFactory().openSession())
		{
			transaction = session.beginTransaction();
			session.update(plato);
			transaction.commit();
		}
		catch(Exception e)
		{
			if (transaction != null)
			{
				transaction.rollback();
			}
			e.printStackTrace();
		}
	}
	
	public void removePlato(Plato plato)
	{
		Transaction transaction = null;
		try(Session session = HibernateUtil.getSessionFactory().openSession())
		{
			transaction = session.beginTransaction();
			session.delete(plato);
			transaction.commit();
		}
		catch(Exception e)
		{
			if (transaction != null)
			{
				transaction.rollback();
			}
			e.printStackTrace();
		}
	}
}
