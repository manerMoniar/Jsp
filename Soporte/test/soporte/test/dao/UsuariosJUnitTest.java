/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package soporte.test.dao;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;
import soporte.hibernate.dao.imp.UsuariosDaoImp;
import soporte.hibernate.model.Usuarios;

/**
 *
 * @author Wolf
 */
public class UsuariosJUnitTest {
    
    public UsuariosJUnitTest() {
    }
    
    @Test
    @Ignore
    public void createTest() {
        
        Usuarios objeto = new Usuarios(1,
                                        "Alejandro Diaz", //nombre
                                        "wolf", //usuario
                                        "1234", //contraseña
                                        "wolfd1azs@gmail.com", //email
                                        true //activo
                                );
        
        //Falta el constructor para generar el Usuario asignado a esa etiqueta
        //UsuariosDaoImp usuariosDao = new UsuariosDaoImp();
        
        UsuariosDaoImp dao = new UsuariosDaoImp();
        
        if(dao.createUsuarios(objeto)) {
            System.out.println("Test: OK");
        }else {
            System.out.println("Test: ERROR");
        }
    }
    
    @Test
    @Ignore
    public void retrieveTest() {
        UsuariosDaoImp dao = new UsuariosDaoImp();
        
        if(dao.retrieveUsuarios().size() > 0) {
            
            for(Usuarios object : dao.retrieveUsuarios()) {
                System.out.println("id: " + object.getId());
                System.out.println("nombre: " + object.getNombre());
                System.out.println("usuario: " + object.getUsuario());
                System.out.println("contraseña: " + object.getContrasenia());
                System.out.println("email: " + object.getEmail());
                if(object.isActivo()) 
                    System.out.println("activo: SI");
                else
                    System.out.println("activo: NO");
            }
            
        }else {
            System.out.println("No hay objetos!");
        }
        
    }
    
    @Test
    @Ignore
    public void updateTest() {
        Usuarios object = new UsuariosDaoImp().findById(1);
        object.setNombre("Roberto Covarrubias");
        
        UsuariosDaoImp dao = new UsuariosDaoImp();
        
        if(dao.updateUsuarios(object)){
            System.out.println("Test: OK");
        }else {
            System.out.println("Test: ERROR");
        }
    }
    
    @Test
    @Ignore
    public void deleteTest() {
        Usuarios object = new UsuariosDaoImp().findById(2);
        UsuariosDaoImp dao = new UsuariosDaoImp();
        
        if(dao.deleteUsuarios(object)){
            System.out.println("Test: OK");
        }else {
            System.out.println("Test: ERROR");
        }
    }
    
    @Test
    @Ignore
    public void findByIdTest() {
        UsuariosDaoImp dao = new UsuariosDaoImp();
        Usuarios object = dao.findById(1);
        
        if(object != null) {

            System.out.println("id: " + object.getId());
            System.out.println("nombre: " + object.getNombre());
            System.out.println("usuario: " + object.getUsuario());
            System.out.println("contraseña: " + object.getContrasenia());
            System.out.println("email: " + object.getEmail());
            if(object.isActivo()) 
                System.out.println("activo: SI");
            else
                System.out.println("activo: NO");
                        
        }else {
            System.out.println("No hay objetos!");
        }
    }
    
    @Test
    @Ignore
    public void findByCriteriaTest() {
        Usuarios criteria = new Usuarios();
        criteria.setNombre("Roberto Covarrubias");
        /*Error
         * Esta buscando por activo y no recibe parametro de criteria
         * Session closed!
         */
        
        UsuariosDaoImp dao = new UsuariosDaoImp();
        
        if(dao.findByCriteria(criteria).size() > 0) {
            
            for(Usuarios object : dao.findByCriteria(criteria)) {
                System.out.println("id: " + object.getId());
                System.out.println("nombre: " + object.getNombre());
                System.out.println("usuario: " + object.getUsuario());
                System.out.println("contraseña: " + object.getContrasenia());
                System.out.println("email: " + object.getEmail());
               
            }
        
        }else {
            System.out.println("No hay objetos!");
        }
    }
}