package com.easycrm.hibernate.dao;

import com.easycrm.hibernate.HibernateUtil;
import org.hibernate.Session;

import java.sql.SQLException;

/**
 * Created by drkomp on 03.10.2016.
 */
public class GenericDao<Entity> implements AbstractGDao<Entity> {

    public Entity getItById(Class<Entity> clazz, long id) throws SQLException {
        Entity result = null;

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            session.beginTransaction();
            result = clazz.cast(session.get(clazz, id));
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }

    public void addIt(Entity entity) throws SQLException {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            session.beginTransaction();
            session.save(entity);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void updateIt(Entity entity) throws SQLException {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            session.beginTransaction();
            session.update(entity);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void deleteIt(Entity entity) throws SQLException {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            session.beginTransaction();
            session.delete(entity);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

