/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mediator;

public class BotonAdios extends Componente
{
    public BotonAdios() {
    }
    
    // -------------------------------
    
    public void clickAdios()
    {
        this.getMediador().clickAdios();
    }
}