/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package soporte.hibernate.dao;

import java.util.List;
import soporte.hibernate.model.Puntuacion;

/**
 *
 * @author Wolf
 */
public interface PuntuacionDao {
    
    public boolean createPuntuacion(Puntuacion object);
    public List<Puntuacion> retrievePuntuacion();
    public boolean updatePuntuacion(Puntuacion object);
    public boolean deletePuntuacion(Puntuacion object);
    public Puntuacion findById(int id);
    public List<Puntuacion> findByCriteria(Puntuacion criteria);
    
}
