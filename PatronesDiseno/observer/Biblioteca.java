/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

/**
 *
 * @author administrador
 */
public class Biblioteca {
    
    public void devuelveLibro(Libro libro) {
        if(libro.getEstado().equals("MALO")) {
            AlarmaLibro a = new AlarmaLibro();
            a.notifyObservers();
        }
    }
    
}
