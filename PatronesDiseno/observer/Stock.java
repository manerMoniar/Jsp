/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

/**
 *
 * @author administrador
 */
public class Stock implements ILibroMalEstado{

    @Override
    public void update() {
        System.out.println("Stock: ");
        System.out.println("Le doy de baja...");
    }
    
}
