/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mediator;

public class BotonBorrar extends Componente
{
    public BotonBorrar() {
    }
    
    // -------------------------------
    
    public void clickBorrar()
    {
        this.getMediador().clickBorrar();
    }
}