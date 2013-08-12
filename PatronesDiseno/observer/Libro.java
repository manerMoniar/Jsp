/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

/**
 *
 * @author administrador
 */
public class Libro {
    
    private String titulo;
    private String estado;
    
    // Un libro seguramente tendra mas atributos
    // como autor, editorial, etc... Pero para nuestro
    // ejemplo o son necesarios
    
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    public String getTitulo() {
        return titulo;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
}
