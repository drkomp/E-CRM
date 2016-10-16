package com.easycrm.hibernate.dao;

import com.easycrm.hibernate.HibernateUtil;
import org.hibernate.Session;

import java.sql.SQLException;

/**
 * Created by drkomp on 03.10.2016.
 */
public class GenericDao<Entity> implements AbstractGDao<Entity> {

    @Override
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

    @Override
    public void addIt(Entity entity) throws SQLException {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            session.beginTransaction();
            session.save(entity);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void updateIt(Entity entity) throws SQLException {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            session.beginTransaction();
            session.update(entity);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public void persistIt(Entity entity) throws SQLException {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            session.beginTransaction();
            session.persist(entity);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Override
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

