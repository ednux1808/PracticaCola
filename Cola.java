/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esctructraLineales;

import esctructraLineales.nodos.Persona;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingDeque;

/**
 *
 * @author imagensala1juarez
 */
public class Cola {

    private Persona persona = new Persona();
    private Queue<Persona> queue = new LinkedList<>();

    public void realizarOperacion(String op) {

        switch (op) {
            case "eliminar":
                this.persona = this.queue.remove();
                break;
            case "imprimir":
            
                System.out.println(this.queue.toString());
                break;
            case "insertar":
                this.queue.add(persona);
                break;
            case "elementoTope":
                System.out.println("Primero " + this.queue.peek());
                break;

        }

    }

    public static void main(String[] args) {
        Cola cola = new Cola();

        cola.setPersona(new Persona());
        cola.getPersona().setCarrera("contadora");
        cola.getPersona().setNombre("marta");
        cola.getPersona().setEstatura(150);
        cola.getPersona().setGenero("mujer");

        cola.realizarOperacion("insertar");

        cola.setPersona(new Persona());
        cola.getPersona().setCarrera("Ingeniero");
        cola.getPersona().setEstatura(185);
         cola.getPersona().setNombre("paco");
        cola.getPersona().setGenero("masculino");

        cola.realizarOperacion("insertar");

        cola.setPersona(new Persona());
        cola.getPersona().setCarrera("LAE");
         cola.getPersona().setNombre("Luisa");
        cola.getPersona().setEstatura(165);
        cola.getPersona().setGenero("mujer");

        cola.realizarOperacion("insertar");
        
        cola.realizarOperacion("imprimir");

    }

    public Persona getPersona() {
        return persona;
    }

    public Queue<Persona> getQueue() {
        return queue;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

}
