/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad2;

/**
 *
 * @author FAMILIASANTIAGO
 */
public class Alumno extends Persona {

    public Alumno() {
    }

    public Alumno(String escuela, String nombre, String color, String tamanio, int edad) {
        super(escuela, nombre, color, tamanio, edad);
    }

    public void estudiar(){
        System.out.println("Estudiando");
    }

    @Override
    public String toString() {
        return super.toString() + "Alumno{" + '}';
    }
    
}
