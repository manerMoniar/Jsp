/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

/**
 *
 * @author administrador
 */
public class Observer {
    
    public static void main(String[] args) {
        AlarmaLibro a = new AlarmaLibro();
        a.attach(new Compras());
        a.attach(new Administracion());
        a.attach(new Stock());
        
        Libro libro = new Libro();
        libro.setEstado("MALO");
        
        Biblioteca b = new Biblioteca();
        b.devuelveLibro(libro);
    }
    
}
