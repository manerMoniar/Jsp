/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mediator;

public class BotonHola extends Componente
{
    public BotonHola() {
    }
    
    // -------------------------------
    
    public void clickHola()
    {
        this.getMediador().clickHola();
    }
}