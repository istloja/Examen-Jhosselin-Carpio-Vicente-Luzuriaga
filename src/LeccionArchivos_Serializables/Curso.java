/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeccionArchivos_Serializables;

import java.io.Serializable;

/**
 *
 * @author ISTLOJJA
 */
public class Curso implements Serializable {
    private String Carrera;
    private String nombre;
    private int numciclo;
    private int numEstudiante;

    public Curso() {
    }

    public Curso(String Carrera, String nombre, int numciclo, int numEstudiante) {
        this.Carrera = Carrera;
        this.nombre = nombre;
        this.numciclo = numciclo;
        this.numEstudiante = numEstudiante;
    }

    public String getCarrera() {
        return Carrera;
    }

    public void setCarrera(String Carrera) {
        this.Carrera = Carrera;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumciclo() {
        return numciclo;
    }

    public void setNumciclo(int numciclo) {
        this.numciclo = numciclo;
    }

    public int getNumEstudiante() {
        return numEstudiante;
    }

    public void setNumEstudiante(int numEstudiante) {
        this.numEstudiante = numEstudiante;
    }
    
    
}
