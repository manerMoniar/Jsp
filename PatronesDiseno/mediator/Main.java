/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mediator;

public class Main
{
    public static void main( String[] args )
    {
        // Crear los objetos que participarán en la comunicación
        BotonHola hola     = new BotonHola();
        BotonAdios adios   = new BotonAdios();
        BotonBorrar borrar = new BotonBorrar();
        CuadroTexto texto  = new CuadroTexto();
        
        // Crear el objeto mediador de la comunicación y agregarle los otros objetos
        Mediador m = new Mediador( hola, adios, borrar, texto );
        
        // Definir en cada objeto el mediador usado en la comunicación
        hola.setMediador(m);
        adios.setMediador(m);
        borrar.setMediador(m);
        texto.setMediador(m);

        // Provocar clicks en los botones
        hola.clickHola();
        adios.clickAdios();
        borrar.clickBorrar();
        hola.clickHola();
    }
}