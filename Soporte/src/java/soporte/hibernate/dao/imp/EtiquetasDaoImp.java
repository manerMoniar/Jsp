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
import soporte.hibernate.dao.EtiquetasDao;
import soporte.hibernate.model.Etiquetas;
import org.hibernate.criterion.Example;

/**
 *
 * @author Wolf
 */
public class EtiquetasDaoImp implements EtiquetasDao {

    Query query;
    Session session = HibernateUtil.getSessionFactory().getCurrentSession();
    Transaction transaction;

    @Override
    public boolean createEtiquetas(Etiquetas object) {
        try{
            transaction = session.beginTransaction();
            session.save(object);
            transaction.commit();
            return true;
        }catch (Exception e) {
            System.out.println("createEtiquetas exception");
            System.out.println(e.getMessage());
            transaction.rollback();
            return false;
        }
    }

    @Override
    public List<Etiquetas> retrieveEtiquetas() {
        try{
            transaction = session.beginTransaction();
            query = session.createQuery("FROM Etiquetas");
            return query.list();
        }catch (Exception e) {
            System.out.println("retrieveEtiquetas exception");
            System.out.println(e.getMessage());
            transaction.rollback();
            return null;
        }
    }

    @Override
    public boolean updateEtiquetas(Etiquetas object) {
        try{
            transaction = session.beginTransaction();
            session.update(object);
            transaction.commit();
            return true;
        }catch (Exception e) {
            System.out.println("updateEtiquetas exception");
            System.out.println(e.getMessage());
            transaction.rollback();
            return false;
        }
    }

    @Override
    public boolean deleteEtiquetas(Etiquetas object) {
        try{
            transaction = session.beginTransaction();
            session.delete(object);
            transaction.commit();
            return true;
        }catch (Exception e) {
            System.out.println("deleteEtiquetas exception");
            System.out.println(e.getMessage());
            transaction.rollback();
            return false;
        }
    }

    @Override
    public Etiquetas findById(int id) {
        try{
            transaction = session.beginTransaction();
            Etiquetas object = (Etiquetas) session.get("soporte.hibernate.model.Etiquetas", id);
            transaction.commit();
            return object;
        }catch (Exception e) {
            System.out.println("findById Etiquetas exception");
            System.out.println(e.getMessage());
            transaction.rollback();
            return null;
        }
    }

    @Override
    public List<Etiquetas> findByCriteria(Etiquetas criteria) {
        try{
            transaction = session.beginTransaction();
            List<Etiquetas> objects = (List<Etiquetas>) session
                    .createCriteria("soporte.hibernate.model.Etiquetas")
                    .add(Example.create(criteria))
                    .list();
            transaction.commit();
            return objects;
        }catch (Exception e) {
            System.out.println("findByCriteria Etiquetas exception");
            System.out.println(e.getMessage());
            transaction.rollback();
            return null;
        }
    }
    
}
