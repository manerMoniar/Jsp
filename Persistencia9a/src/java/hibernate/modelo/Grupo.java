package hibernate.modelo;
// Generated Jun 26, 2013 7:12:03 PM by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Grupo generated by hbm2java
 */
@Entity
@Table(name="grupo"
    ,catalog="itic9a"
)
public class Grupo  implements java.io.Serializable {


     private Integer idGrupo;
     private String descripcion;
     private Set<Alumno> alumnos = new HashSet<Alumno>(0);

    public Grupo() {
    }

	
    public Grupo(String descripcion) {
        this.descripcion = descripcion;
    }
    public Grupo(String descripcion, Set<Alumno> alumnos) {
       this.descripcion = descripcion;
       this.alumnos = alumnos;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="idGrupo", unique=true, nullable=false)
    public Integer getIdGrupo() {
        return this.idGrupo;
    }
    
    public void setIdGrupo(Integer idGrupo) {
        this.idGrupo = idGrupo;
    }
    
    @Column(name="descripcion", nullable=false)
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="grupo")
    public Set<Alumno> getAlumnos() {
        return this.alumnos;
    }
    
    public void setAlumnos(Set<Alumno> alumnos) {
        this.alumnos = alumnos;
    }




}


