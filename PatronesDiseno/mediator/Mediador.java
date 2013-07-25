/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mediator;

public class Mediador 
{
    private BotonHola   hola;
    private BotonAdios  adios;
    private BotonBorrar borrar;
    private CuadroTexto texto;
    
    // -------------------------------
    
    public Mediador( BotonHola hola, 
                     BotonAdios adios, 
                     BotonBorrar borrar,
                     CuadroTexto texto 
                    )
    {
        this.hola   = hola;
        this.adios  = adios;
        this.borrar = borrar;
        this.texto  = texto;
    }
    
    // -------------------------------
    
    public void clickHola()
    {
        this.texto.setTexto("Hola");
    }

    // -------------------------------
    
    public void clickAdios()
    {
        this.texto.setTexto("Adios");
    }
    
    // -------------------------------
    
    public void clickBorrar()
    {
        this.texto.setTexto(null);
    }
}