/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package soporte.hibernate.dao.imp;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import soporte.hibernate.HibernateUtil;
import soporte.hibernate.dao.PuntuacionDao;
import soporte.hibernate.model.Puntuacion;
import org.hibernate.criterion.Example;

/**
 *
 * @author Wolf
 */
public class PuntuacionDaoImp implements PuntuacionDao{

    Query query;
    Session session = HibernateUtil.getSessionFactory().getCurrentSession();
    Transaction transaction;

    @Override
    public boolean createPuntuacion(Puntuacion object) {
        try{
            transaction = session.beginTransaction();
            session.save(object);
            transaction.commit();
            return true;
        }catch (Exception e) {
            System.out.println("createPuntuacion exception");
            System.out.println(e.getMessage());
            transaction.rollback();
            return false;
        }
    }

    @Override
    public List<Puntuacion> retrievePuntuacion() {
        try{
            transaction = session.beginTransaction();
            query = session.createQuery("FROM Puntuacion");
            return query.list();
        }catch (Exception e) {
            System.out.println("retrievePuntuacion exception");
            System.out.println(e.getMessage());
            transaction.rollback();
            return null;
        }
    }

    @Override
    public boolean updatePuntuacion(Puntuacion object) {
        try{
            transaction = session.beginTransaction();
            session.update(object);
            transaction.commit();
            return true;
        }catch (Exception e) {
            System.out.println("updatePuntuacion exception");
            System.out.println(e.getMessage());
            transaction.rollback();
            return false;
        }
    }

    @Override
    public boolean deletePuntuacion(Puntuacion object) {
        try{
            transaction = session.beginTransaction();
            session.delete(object);
            transaction.commit();
            return true;
        }catch (Exception e) {
            System.out.println("deletePuntuacion exception");
            System.out.println(e.getMessage());
            transaction.rollback();
            return false;
        }
    }

    @Override
    public Puntuacion findById(int id) {
        try{
            transaction = session.beginTransaction();
            Puntuacion object = (Puntuacion) session.get("soporte.hibernate.model.Puntuacion", id);
            transaction.commit();
            return object;
        }catch (Exception e) {
            System.out.println("findById Puntuacion exception");
            System.out.println(e.getMessage());
            transaction.rollback();
            return null;
        }
    }

    @Override
    public List<Puntuacion> findByCriteria(Puntuacion criteria) {
        try{
            transaction = session.beginTransaction();
            List<Puntuacion> objects = (List<Puntuacion>) session
                    .createCriteria("soporte.hibernate.model.Puntuacion")
                    .add(Example.create(criteria))
                    .list();
            //query = session.createSQLQuery("");
            transaction.commit();
            return objects;
        }catch (Exception e) {
            System.out.println("findByCriteria Puntuacion exception");
            System.out.println(e.getMessage());
            transaction.rollback();
            return null;
        }
    }

}
