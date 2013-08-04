/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package soporte.test.dao;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;
import soporte.hibernate.dao.imp.EtiquetasDaoImp;
import soporte.hibernate.dao.imp.UsuariosDaoImp;
import soporte.hibernate.model.Etiquetas;

/**
 *
 * @author Wolf
 */
public class EtiquetasJUnitTest {
    
    public EtiquetasJUnitTest() {
    }

    @Test
    @Ignore
    public void createTest() {
        
        Etiquetas objeto = new Etiquetas(1,"Dispositivos Moviles");
        
        //Falta el constructor para generar el Usuario asignado a esa etiqueta
        //UsuariosDaoImp usuariosDao = new UsuariosDaoImp();
        
        EtiquetasDaoImp dao = new EtiquetasDaoImp();
        
        if(dao.createEtiquetas(objeto)) {
            System.out.println("Test: OK");
        }else {
            System.out.println("Test: ERROR");
        }
    }
    
    @Test
    @Ignore
    public void retrieveTest() {
        EtiquetasDaoImp dao = new EtiquetasDaoImp();
        
        if(dao.retrieveEtiquetas().size() > 0) {
            
            for(Etiquetas object : dao.retrieveEtiquetas()) {
                System.out.println("id: " + object.getId());
                System.out.println("nombre: " + object.getNombre());
            }
            
        }else {
            System.out.println("No hay objetos!");
        }
        
    }
    
    @Test
    @Ignore
    public void updateTest() {
        Etiquetas object = new EtiquetasDaoImp().findById(1);
        object.setNombre("Laptops");
        
        EtiquetasDaoImp dao = new EtiquetasDaoImp();
        
        if(dao.updateEtiquetas(object)){
            System.out.println("Test: OK");
        }else {
            System.out.println("Test: ERROR");
        }
    }
    
    @Test
    @Ignore
    public void deleteTest() {
        Etiquetas object = new EtiquetasDaoImp().findById(2);
        EtiquetasDaoImp dao = new EtiquetasDaoImp();
        
        if(dao.deleteEtiquetas(object)){
            System.out.println("Test: OK");
        }else {
            System.out.println("Test: ERROR");
        }
    }
    
    @Test
    @Ignore
    public void findByIdTest() {
        EtiquetasDaoImp dao = new EtiquetasDaoImp();
        Etiquetas object = dao.findById(1);
        
        if(object != null) {

            System.out.println("id: " + object.getId());
            System.out.println("nombre: " + object.getNombre());
                        
        }else {
            System.out.println("No hay objetos!");
        }
    }
    
    @Test
    @Ignore
    public void findByCriteriaTest() {
        Etiquetas criteria = new Etiquetas();
        criteria.setNombre("Laptops");
        /*Error
         * Session closed!
         */
        
        EtiquetasDaoImp dao = new EtiquetasDaoImp();
        
        if(dao.findByCriteria(criteria).size() > 0) {
            
            for(Etiquetas object : dao.findByCriteria(criteria)) {
                System.out.println("id: " + object.getId());
                System.out.println("nombre: " + object.getNombre());
            }
        
        }else {
            System.out.println("No hay objetos!");
        }
    }
}