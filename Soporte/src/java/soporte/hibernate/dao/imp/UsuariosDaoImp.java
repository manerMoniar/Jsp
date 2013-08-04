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
import soporte.hibernate.dao.UsuariosDao;
import soporte.hibernate.model.Usuarios;
import org.hibernate.criterion.Example;

/**
 *
 * @author Wolf
 */
public class UsuariosDaoImp implements UsuariosDao {

    Query query;
    Session session = HibernateUtil.getSessionFactory().getCurrentSession();
    Transaction transaction;

    @Override
    public boolean createUsuarios(Usuarios object) {
        try{
            transaction = session.beginTransaction();
            session.save(object);
            transaction.commit();
            return true;
        }catch (Exception e) {
            System.out.println("createUsuarios exception");
            System.out.println(e.getMessage());
            transaction.rollback();
            return false;
        }
    }

    @Override
    public List<Usuarios> retrieveUsuarios() {
        try{
            transaction = session.beginTransaction();
            query = session.createQuery("FROM Usuarios");
            return query.list();
        }catch (Exception e) {
            System.out.println("retrieveUsuarios exception");
            System.out.println(e.getMessage());
            transaction.rollback();
            return null;
        }
    }

    @Override
    public boolean updateUsuarios(Usuarios object) {
        try{
            transaction = session.beginTransaction();
            session.update(object);
            transaction.commit();
            return true;
        }catch (Exception e) {
            System.out.println("updateUsuarios exception");
            System.out.println(e.getMessage());
            transaction.rollback();
            return false;
        }
    }

    @Override
    public boolean deleteUsuarios(Usuarios object) {
        try{
            transaction = session.beginTransaction();
            session.delete(object);
            transaction.commit();
            return true;
        }catch (Exception e) {
            System.out.println("deleteUsuarios exception");
            System.out.println(e.getMessage());
            transaction.rollback();
            return false;
        }
    }

    @Override
    public Usuarios findById(int id) {
        try{
            transaction = session.beginTransaction();
            Usuarios object = (Usuarios) session.get("soporte.hibernate.model.Usuarios", id);
            transaction.commit();
            return object;
        }catch (Exception e) {
            System.out.println("findById Usuarios exception");
            System.out.println(e.getMessage());
            transaction.rollback();
            return null;
        }
    }

    @Override
    public List<Usuarios> findByCriteria(Usuarios criteria) {
        try{
            transaction = session.beginTransaction();
            List<Usuarios> objects = (List<Usuarios>) session
                    .createCriteria("soporte.hibernate.model.Usuarios")
                    .add(Example.create(criteria))
                    .list();
            transaction.commit();
            return objects;
        }catch (Exception e) {
            System.out.println("findByCriteria Usuarios exception");
            System.out.println(e.getMessage());
            transaction.rollback();
            return null;
        }
    }
    
}
