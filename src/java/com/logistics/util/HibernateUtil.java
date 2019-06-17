package com.logistics.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class HibernateUtil {
    static SessionFactory sessionFactory = null;

    static{
        Configuration cfg = new Configuration().configure();

        sessionFactory = cfg.buildSessionFactory();
    }

    public static Session getSession(){
        return sessionFactory.openSession();
    }

    public static void closeSession(Session session)
    {
        if (session!=null)
        {
            session.close();
        }
    }

}
