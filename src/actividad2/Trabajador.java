/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad2;

/**
 *
 * @author FAMILIASANTIAGO
 */
public class Trabajador extends Persona {
    
    public Trabajador() {
    }

    public Trabajador(String escuela, String nombre, String color, String tamanio, int edad) {
        super(escuela, nombre, color, tamanio, edad);
    }

    public void cobrar(){
        System.out.println("cobrando");
    }    

    @Override
    public String toString() {
        return super.toString()+ "Trabajador{" + '}';
    }
    
}
