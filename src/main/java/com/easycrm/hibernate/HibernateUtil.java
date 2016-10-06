package hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Created by Денис on 20.05.2016.
 */
public class HibernateUtil {
    private static SessionFactory sessionFactory = null;

    static {

        // Configuration cfg = new Configuration().configure();
        // StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(cfg.getProperties());

        sessionFactory = new Configuration().configure().buildSessionFactory();
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public static void init() {

    }
}
