/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mediator;

public class CuadroTexto extends Componente
{
    
    public CuadroTexto() {
    }
    
    // -------------------------------
    
    public void setTexto(String texto)
    {
        if( texto == null )
        {
            System.out.println( "El cuadro de texto está vacío" );
        }
        else
        {
            System.out.println( texto );
        }
    }
    
}