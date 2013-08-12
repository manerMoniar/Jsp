/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

/**
 *
 * @author administrador
 */
public class Administracion implements ILibroMalEstado{

    @Override
    public void update() {
        System.out.println("Administracion: ");
        System.out.println("Envío una queja formal...");
    }
    
}
