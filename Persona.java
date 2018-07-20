/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esctructraLineales.nodos;

/**
 *
 * @author imagensala1juarez
 */
public class Persona {

    private String genero = "";
    private int estatura = 0;
    private String carrera = "";
    String nombre = "";

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Persona() {
    }

    @Override
    public String toString() {
        return "Persona{" + "genero=" + genero + ", estatura=" + estatura + ", carrera=" + carrera + '}';
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getEstatura() {
        return estatura;
    }

    public void setEstatura(int estatura) {
        this.estatura = estatura;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

}
