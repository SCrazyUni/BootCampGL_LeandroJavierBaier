package resources;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import ar.com.gl.segundo.segundo.Menu;
import ar.com.gl.segundo.segundo.Plato;

public class HibernateUtil {

	private static SessionFactory sessionFactory = buildSessionFactory();
	
	private final static String DRIVER = "org.h2.Driver";
	private final static String URL = "jdbc:h2:C:\\GLBootCamp\\data\\Alumno.h2";
	private final static String DIALECT = "org.hibernate.dialect.H2Dialect";
	private final static String USER = "root";
	private final static String PASS = "root";

	private static SessionFactory buildSessionFactory() {
		try {
			Configuration configuration = new Configuration();
			Properties settings = new Properties();
			
			settings.put(Environment.DRIVER, DRIVER);
			settings.put(Environment.URL, URL);
			settings.put(Environment.DIALECT, DIALECT);
			settings.put(Environment.USER, USER);
			settings.put(Environment.PASS, PASS);
			settings.put(Environment.SHOW_SQL, "true");
            settings.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");
            settings.put(Environment.HBM2DDL_AUTO, "create-drop");
            
			configuration.setProperties(settings);
			
			configuration.addAnnotatedClass(Plato.class);
			

			ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
					.applySettings(configuration.getProperties()).build();
			return configuration.buildSessionFactory(serviceRegistry);
		} catch (Throwable ex) {
			System.err.println("Initial SessionFactory create failes. " + ex);
			ex.printStackTrace();
			throw new ExceptionInInitializerError();
		}
	}

	public static SessionFactory getSessionFactory ()
	{
		return sessionFactory;
	}
}
