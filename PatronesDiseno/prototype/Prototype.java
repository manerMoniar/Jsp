/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package prototype;

/**
 *
 * @author wolf
 */
public class Prototype {

    public static void main(String[] args) {
        Persona juan = new Persona();
        juan.setNombres("Juan José");
        juan.setAppellidos("Pérez Ramirez");
        juan.setNombrePadre("Juan Pérez Martinez");
        juan.setNombreMadre("María Ramirez");
        juan.setDireccion("9a. Ave. 43-12 Z.1");
        juan.setTelCasa("34567890");
        juan.setNacionalidad("Mexicana");
        juan.setCiudadEnQueVive("México");
        juan.setNombreMascota("Pepito");

        //Hacer algo con Juan, ingresarlo al sistema, etc...
        System.out.println("Ingresando al sistema:"+juan.toString());

        Persona maria = (Persona)juan.clone();  //Utilizando interfaz Cloneable
        //Persona maria = juan.creaPrototipo();  //Prototype a mano

        maria.setNombres("María Inés");
        System.out.println("Ingresando al sistema:"+maria.toString());

        //ingresar a Maria al sistema....

    }
}
