package delta.manager.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DatabaseManager {
	private static SessionFactory sessionFactory;

	public static Session createSession() {
		verifyInitialization();
		return newSession();
	}

	private static void verifyInitialization() {
		if(sessionFactory == null) {
			Configuration configuration = new Configuration();
			configuration.configure();
			sessionFactory = configuration.buildSessionFactory();
		}
	}

	private static Session newSession() {
		Session session = sessionFactory.openSession();
		return session;
	}
}
