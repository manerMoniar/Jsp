/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package soporte.test.dao;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;
import soporte.hibernate.dao.imp.PuntuacionDaoImp;
import soporte.hibernate.dao.imp.UsuariosDaoImp;
import soporte.hibernate.model.Puntuacion;
import soporte.hibernate.model.Usuarios;

/**
 *
 * @author Wolf
 */
public class PuntuacionJUnitTest {
    
    public PuntuacionJUnitTest() {
    }
    
    @Test
    @Ignore
    public void createTest() {

        UsuariosDaoImp usuariosDao = new UsuariosDaoImp();
        Usuarios object = usuariosDao.findById(1);
        
        Puntuacion objeto = new Puntuacion(1,
                                            object, //origen
                                            object, //destino
                                            20 //puntos
                                ); 
       
        PuntuacionDaoImp dao = new PuntuacionDaoImp();
        
        if(dao.createPuntuacion(objeto)) {
            System.out.println("Test: OK");
        }else {
            System.out.println("Test: ERROR");
        }
    }
    
    @Test
    @Ignore
    public void retrieveTest() {
        PuntuacionDaoImp dao = new PuntuacionDaoImp();
        
        if(dao.retrievePuntuacion().size() > 0) {
            
            for(Puntuacion object : dao.retrievePuntuacion()) {
                System.out.println("id: " + object.getId());
                System.out.println("origen: " + object.getUsuariosByIdUsuarioOrigen().getUsuario()); 
                System.out.println("destino: " + object.getUsuariosByIdUsuarioDestino().getUsuario());
                System.out.println("puntos: " + object.getPuntos());
            }
            
        }else {
            System.out.println("No hay objetos!");
        }
        
    }
    
    @Test
    @Ignore
    public void updateTest() {
        Puntuacion object = new PuntuacionDaoImp().findById(1);
        object.setPuntos(30);
        
        PuntuacionDaoImp dao = new PuntuacionDaoImp();
        
        if(dao.updatePuntuacion(object)){
            System.out.println("Test: OK");
        }else {
            System.out.println("Test: ERROR");
        }
    }
    
    @Test
    @Ignore
    public void deleteTest() {
        Puntuacion object = new PuntuacionDaoImp().findById(2);
        PuntuacionDaoImp dao = new PuntuacionDaoImp();
        
        if(dao.deletePuntuacion(object)){
            System.out.println("Test: OK");
        }else {
            System.out.println("Test: ERROR");
        }
    }
    
    @Test
    @Ignore
    public void findByIdTest() {
        PuntuacionDaoImp dao = new PuntuacionDaoImp();
        Puntuacion object = dao.findById(1);
        
        if(object != null) {

            System.out.println("id: " + object.getId());
            System.out.println("origen: " + object.getUsuariosByIdUsuarioOrigen().getUsuario()); //SEVERE: could not initialize proxy - no Session
            System.out.println("destino: " + object.getUsuariosByIdUsuarioDestino().getUsuario()); //SEVERE: could not initialize proxy - no Session
            System.out.println("puntos: " + object.getPuntos());
                        
        }else {
            System.out.println("No hay objetos!");
        }
    }
    
    @Test
    @Ignore
    public void findByCriteriaTest() {
       
        int i=0, destino, origen;
        
        Puntuacion criteria = new Puntuacion();
        Usuarios userOrigen = new UsuariosDaoImp().findById(3);
        Usuarios userDestino = new UsuariosDaoImp().findById(2);
        criteria.setUsuariosByIdUsuarioOrigen(userOrigen);
        criteria.setUsuariosByIdUsuarioDestino(userDestino); //No esta pasando los parametros bien al sql
        criteria.setPuntos(20);
        
        PuntuacionDaoImp dao = new PuntuacionDaoImp();
        
        int destinoSeteado = userDestino.getId();
        int origenSeteado = userOrigen.getId();
        
        if(dao.findByCriteria(criteria).size() > 0) {
            
            for(Puntuacion object : new PuntuacionDaoImp().findByCriteria(criteria)) {
                destino = (int) object.getUsuariosByIdUsuarioDestino().getId();
                origen = (int) object.getUsuariosByIdUsuarioOrigen().getId();
                if(destino == destinoSeteado && origen == origenSeteado) {
                    System.out.println("id: " + object.getId());
                    System.out.println("origen: " + new UsuariosDaoImp().findById(object.getUsuariosByIdUsuarioOrigen().getId()).getUsuario());
                    System.out.println("destino: " + object.getUsuariosByIdUsuarioDestino().getUsuario());
                    System.out.println("puntos: " + object.getPuntos());
                    i++;
                }
            }
        
        }else {
            System.out.println("No hay objetos!");
        }
        
        if(i==0) System.out.println("No hay objetos!");
    }
}