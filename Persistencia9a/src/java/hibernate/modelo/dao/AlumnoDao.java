/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernate.modelo.dao;

import hibernate.modelo.Alumno;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public interface AlumnoDao {
    
    public boolean crearAlumno(Integer idGrupo, String nombre, String matricula);
    public boolean crearAlumno(Alumno instancia); 
    public ArrayList<Alumno> listarAlumno();
    public boolean modificarAlumno(Integer idAlumno, Integer idGrupo, String nombre, String matricula);
    public boolean modificarAlumno(Alumno instancia);
    public boolean eliminarAlumno(Integer idAlumno);
    public boolean eliminarAlumno(Alumno instancia);
    public Alumno buscarPorId(Integer idAlumno);
    public ArrayList<Alumno> buscarPorCriterio(Integer idGrupo, String nombre, String matricula);
    public ArrayList<Alumno> buscarPorCriterio(Alumno instancia);
    
}
