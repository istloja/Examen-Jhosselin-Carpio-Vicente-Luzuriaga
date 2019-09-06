/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeccionArchivos_Serializables;

import Libreria_Archivos_serializables.Libro;
import archivosSerializables.Jugador;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author ISTLOJJA
 */
public class Estudiante implements Serializable {

    private String nombre;
    private String apellido;
    private int edad;
    private double promedio;
    private Direccion direccion;
    private Curso curso;

    public Estudiante() {
    }

    public Estudiante(String nombre, String apellido, int edad, double promedio, Direccion direccion, Curso curso) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.promedio = promedio;
        this.direccion = direccion;
        this.curso = curso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public void escribirObjeto(String Direccion, Estudiante estudiante) {
        try {
            ObjectOutputStream escritor = new ObjectOutputStream(new FileOutputStream(Direccion));
            escritor.writeObject(estudiante);
            escritor.close();
        } catch (Exception e) {
            System.out.println("se produjo un error " + e);
        }
    }

    public void escribirLista(String Direccion, List<Estudiante> LI) {
        try {
            ObjectOutputStream escritor = new ObjectOutputStream(new FileOutputStream(Direccion));
            for (Estudiante estudiante : LI) {//para crear una lista
                escritor.writeObject(estudiante);
            }
            escritor.close();
        } catch (Exception e) {
            System.out.println("se produjo un error " + e);
        }
    }

    public Estudiante edadMayor(List<Estudiante> lj) {
        Estudiante edadmayor = lj.get(0);
        for (Estudiante estudiante : lj) {

            if (estudiante.getEdad() < edadmayor.getEdad()) {
                edadmayor = estudiante;
            }
        }
        return edadmayor;
    }

    public Estudiante promedioMayor(List<Estudiante> lj) {
        Estudiante promediomayor = lj.get(0);
        for (Estudiante estudiante : lj) {

            if (estudiante.getPromedio() > promediomayor.getPromedio()) {
                promediomayor = estudiante;
            }
        }
        return promediomayor;
    }

    public Estudiante Curso(List<Estudiante> lj) {
        Estudiante curso = lj.get(0);
        for (Estudiante estudiante : lj) {

            if (estudiante.curso.getNumEstudiante() > curso.curso.getNumEstudiante()) {
                curso = estudiante;
            }
        }
        return curso;
    }

    public Estudiante ciudad(List<Estudiante> lj) {
        HashMap<String, Integer> mapa = new HashMap<String, Integer>();
        for (Estudiante estudiante : lj) {
            //System.out.println(estudiante.getDireccion().getCiudad());
            mapa.put(estudiante.getDireccion().getCiudad(), mapa.getOrDefault(estudiante.getDireccion().getCiudad(), 0) + 1);
            System.out.println(mapa);
           
       
        }
           return null;
    }

    public static void main(String[] args) {

        Estudiante objeto = new Estudiante();
        Estudiante m1 = new Estudiante("Vicente", "Luzuriaga", 21, 9.5, new Direccion("Loja", "Av. loja", 18), new Curso("Software", "programacion", 2, 17));
        Estudiante m2 = new Estudiante("Anderson", "Guzman", 19, 8.0, new Direccion("catamyo", "Av. Caiamanga", 20), new Curso("contabilidad", "programacion", 2, 30));
        Estudiante m3 = new Estudiante("jhonatan", "ortega", 19, 9.0, new Direccion("Loja", "Av. catamayo0", 15), new Curso("ing en sistemas", "programacion", 2, 20));
        Estudiante m4 = new Estudiante("vanessa", "macas", 22, 7.5, new Direccion("quito", "cuxibamba", 10), new Curso("desarrollo infantil", "programacion", 2, 25));
        Estudiante m5 = new Estudiante("analia", "armijos", 18, 8.0, new Direccion("Loja", "Eterna juventud", 20), new Curso("proceso de alimentos", "programacion", 2, 35));
        Estudiante m6 = new Estudiante("cinthya", "godoy", 21, 8.5, new Direccion("cuenca", "Juan mntalvo", 60), new Curso("electricidad", "programacion", 2, 40));
        Estudiante m7 = new Estudiante("ramiro", "capa", 20, 9.5, new Direccion("Loja", "Luis fernando de la veega", 38), new Curso("mecanica", "programacion", 2, 25));
        Estudiante m8 = new Estudiante("celio", "alvarado", 19, 8.0, new Direccion("Loja", "Quinara", 45), new Curso("leyes", "programacion", 2, 32));
        Estudiante m9 = new Estudiante("kevin", "tapia", 20, 9.0, new Direccion("guayaquil", "Roca fuerte", 8), new Curso("medicina", "programacion", 2, 18));
        Estudiante m10 = new Estudiante("oscar", "suarez", 25, 7.0, new Direccion("Loja", "San pedro", 12), new Curso("teatro", "programacion", 2, 22));

        List<Estudiante> Lista = new ArrayList<>();
        Lista.add(m1);
        Lista.add(m2);
        Lista.add(m3);
        Lista.add(m4);
        Lista.add(m5);
        Lista.add(m6);
        Lista.add(m7);
        Lista.add(m8);
        Lista.add(m9);
        Lista.add(m10);
        int a = Lista.size();
        //objeto.escribirLista("C:\\Users\\ISTLOJJA\\Desktop\\ESTUDIANTE.txt", Lista);
        System.out.println(" el de menor edad es " + objeto.edadMayor(Lista).getNombre());
        System.out.println(" el que tiene mayor promedio es " + objeto.promedioMayor(Lista).getNombre());
        System.out.println(" curso con mayor estudiantes es " + objeto.Curso(Lista).getCurso().getCarrera());
        System.out.println(" la ciudad con mayor numero de estuudiantes es " + objeto.ciudad(Lista));
    }

}
