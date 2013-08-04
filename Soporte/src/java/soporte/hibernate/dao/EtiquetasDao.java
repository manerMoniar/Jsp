/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package soporte.hibernate.dao;

import java.util.List;
import soporte.hibernate.model.Etiquetas;

/**
 *
 * @author Wolf
 */
public interface EtiquetasDao {
    
    public boolean createEtiquetas(Etiquetas object);
    public List<Etiquetas> retrieveEtiquetas();
    public boolean updateEtiquetas(Etiquetas object);
    public boolean deleteEtiquetas(Etiquetas object);
    public Etiquetas findById(int id);
    public List<Etiquetas> findByCriteria(Etiquetas criteria);
    
}
