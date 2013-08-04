package soporte.hibernate.model;
// Generated 4/08/2013 09:37:15 AM by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Usuarios generated by hbm2java
 */
@Entity
@Table(name="usuarios"
    ,catalog="soporte"
)
public class Usuarios  implements java.io.Serializable {


     private Integer id;
     private String nombre;
     private String usuario;
     private String contrasenia;
     private String latitud;
     private String longitud;
     private String direccion;
     private String telefono;
     private String email;
     private boolean activo;
     private Set<Puntuacion> puntuacionsForIdUsuarioDestino = new HashSet<Puntuacion>(0);
     private Set<Puntuacion> puntuacionsForIdUsuarioOrigen = new HashSet<Puntuacion>(0);
     private Set<Etiquetas> etiquetases = new HashSet<Etiquetas>(0);

    public Usuarios() {
    }

	
    public Usuarios(String nombre, String usuario, String contrasenia, String email, boolean activo) {
        this.nombre = nombre;
        this.usuario = usuario;
        this.contrasenia = contrasenia;
        this.email = email;
        this.activo = activo;
    }
    public Usuarios(int id, String nombre, String usuario, String contrasenia, String email, boolean activo) {
        this.id = id;
        this.nombre = nombre;
        this.usuario = usuario;
        this.contrasenia = contrasenia;
        this.email = email;
        this.activo = activo;
    }
    public Usuarios(String nombre, String usuario, String contrasenia, String latitud, String longitud, String direccion, String telefono, String email, boolean activo, Set<Puntuacion> puntuacionsForIdUsuarioDestino, Set<Puntuacion> puntuacionsForIdUsuarioOrigen, Set<Etiquetas> etiquetases) {
       this.nombre = nombre;
       this.usuario = usuario;
       this.contrasenia = contrasenia;
       this.latitud = latitud;
       this.longitud = longitud;
       this.direccion = direccion;
       this.telefono = telefono;
       this.email = email;
       this.activo = activo;
       this.puntuacionsForIdUsuarioDestino = puntuacionsForIdUsuarioDestino;
       this.puntuacionsForIdUsuarioOrigen = puntuacionsForIdUsuarioOrigen;
       this.etiquetases = etiquetases;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="id", unique=true, nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    
    @Column(name="nombre", nullable=false)
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    @Column(name="usuario", nullable=false)
    public String getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    
    @Column(name="contrasenia", nullable=false, length=32)
    public String getContrasenia() {
        return this.contrasenia;
    }
    
    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }
    
    @Column(name="latitud")
    public String getLatitud() {
        return this.latitud;
    }
    
    public void setLatitud(String latitud) {
        this.latitud = latitud;
    }
    
    @Column(name="longitud")
    public String getLongitud() {
        return this.longitud;
    }
    
    public void setLongitud(String longitud) {
        this.longitud = longitud;
    }
    
    @Column(name="direccion", length=65535)
    public String getDireccion() {
        return this.direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    @Column(name="telefono")
    public String getTelefono() {
        return this.telefono;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    @Column(name="email", nullable=false)
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    @Column(name="activo", nullable=false)
    public boolean isActivo() {
        return this.activo;
    }
    
    public void setActivo(boolean activo) {
        this.activo = activo;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="usuariosByIdUsuarioDestino")
    public Set<Puntuacion> getPuntuacionsForIdUsuarioDestino() {
        return this.puntuacionsForIdUsuarioDestino;
    }
    
    public void setPuntuacionsForIdUsuarioDestino(Set<Puntuacion> puntuacionsForIdUsuarioDestino) {
        this.puntuacionsForIdUsuarioDestino = puntuacionsForIdUsuarioDestino;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="usuariosByIdUsuarioOrigen")
    public Set<Puntuacion> getPuntuacionsForIdUsuarioOrigen() {
        return this.puntuacionsForIdUsuarioOrigen;
    }
    
    public void setPuntuacionsForIdUsuarioOrigen(Set<Puntuacion> puntuacionsForIdUsuarioOrigen) {
        this.puntuacionsForIdUsuarioOrigen = puntuacionsForIdUsuarioOrigen;
    }
@ManyToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY)
    @JoinTable(name="usuariosetiquetas", catalog="soporte", joinColumns = { 
        @JoinColumn(name="idUsuario", nullable=false, updatable=false) }, inverseJoinColumns = { 
        @JoinColumn(name="idEtiqueta", nullable=false, updatable=false) })
    public Set<Etiquetas> getEtiquetases() {
        return this.etiquetases;
    }
    
    public void setEtiquetases(Set<Etiquetas> etiquetases) {
        this.etiquetases = etiquetases;
    }




}

