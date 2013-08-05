/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

/**
 *
 * @author administrador
 */
public interface Subject {
    
    public void attach(ILibroMalEstado observador);
    public void dettach(ILibroMalEstado observador);
    public void notifyObservers();
    
}
