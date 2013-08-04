/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package soporte.hibernate.dao;

import java.util.List;
import soporte.hibernate.model.Usuarios;

/**
 *
 * @author Wolf
 */
public interface UsuariosDao {
    
    public boolean createUsuarios(Usuarios object);
    public List<Usuarios> retrieveUsuarios();
    public boolean updateUsuarios(Usuarios object);
    public boolean deleteUsuarios(Usuarios object);
    public Usuarios findById(int id);
    public List<Usuarios> findByCriteria(Usuarios criteria);
    
}
