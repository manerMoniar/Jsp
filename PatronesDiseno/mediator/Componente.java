/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mediator;

public class Componente
{
    protected Mediador m;
    
    // -------------------------------
    
    public Componente() {
    }
    
    // -------------------------------
 
    public Mediador getMediador()
    {
        return this.m;
    }
    
    // -------------------------------
 
    public void setMediador( Mediador m )
    {
        this.m = m;
    }
}