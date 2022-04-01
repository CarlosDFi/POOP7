/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad2;

/**
 *
 * @author FAMILIASANTIAGO
 */
public class Profesor extends Trabajador{
    public Profesor() {
    }

    public Profesor(String escuela, String nombre, String color, String tamanio, int edad) {
        super(escuela, nombre, color, tamanio, edad);
    }

    public void dejarTarea(){
        System.out.println("dejando tarea");
    }        

    @Override
    public String toString() {
        return super.toString()+ "Profesor{" + '}';
    }
    
}
