/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package prototype;

/**
 *
 * @author wolf
 */
public class Persona implements Cloneable {
 
    public String nombres;
    public String appellidos;
    public String nombrePadre;
    public String nombreMadre;
    public String direccion;
    public String telCasa;
    public String nacionalidad;
    public String ciudadEnQueVive;
    public String nombreMascota;

    public Persona() {
        
    }

    //Utilizando la interfaz Cloneable
    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }

    //Prototype a mano
    public Persona creaPrototipo(){
        Persona p = new Persona();
        p.setNombres(this.nombres);
        p.setAppellidos(this.appellidos);
        p.setNombrePadre(this.nombrePadre);
        p.setNombreMadre(this.nombreMadre);
        p.setDireccion(this.direccion);
        p.setTelCasa(this.telCasa);
        p.setNacionalidad(this.nacionalidad);
        p.setCiudadEnQueVive(this.ciudadEnQueVive);
        p.setNombreMascota(this.nombreMascota);
        System.out.println("Creado prototipo de Persona");
        return p;
    }

    public String toString(){
        return this.nombres+" "+this.appellidos+"\n"
                +this.getCiudadEnQueVive()+"\n";
    }


    public String getAppellidos() {
        return appellidos;
    }

    public void setAppellidos(String appellidos) {
        this.appellidos = appellidos;
    }

    public String getCiudadEnQueVive() {
        return ciudadEnQueVive;
    }

    public void setCiudadEnQueVive(String ciudadEnQueVive) {
        this.ciudadEnQueVive = ciudadEnQueVive;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getNombreMadre() {
        return nombreMadre;
    }

    public void setNombreMadre(String nombreMadre) {
        this.nombreMadre = nombreMadre;
    }

    public String getNombreMascota() {
        return nombreMascota;
    }

    public void setNombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }

    public String getNombrePadre() {
        return nombrePadre;
    }

    public void setNombrePadre(String nombrePadre) {
        this.nombrePadre = nombrePadre;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getTelCasa() {
        return telCasa;
    }

    public void setTelCasa(String telCasa) {
        this.telCasa = telCasa;
    }
    
}
