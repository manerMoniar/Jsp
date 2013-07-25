/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

public class Main
{
    public static void main(String[] args)
    {
        Facade fachada = new Facade();
        fachada.arrancarCoche();
        
        System.out.println("\nProceso finalizado.");
    }
}