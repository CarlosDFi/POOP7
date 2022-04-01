/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad2;

/**
 *
 * @author alumno
 */
public class Persona extends SerVivo{

    private String escuela;  

    public Persona() {
    }

    public Persona(String escuela) {
        this.escuela = escuela;
    }

    public Persona(String escuela, String nombre, String color, String tamanio, int edad) {
        super(nombre, color, tamanio, edad);
        this.escuela = escuela;
    }

    public String getEscuela() {
        return escuela;
    }

    public void setEscuela(String escuela) {
        this.escuela = escuela;
    }
    
    public void hablar(){
    System.out.println("hablando");
    }

    @Override
    public String toString() {
        return super.toString()+"Persona{" + "escuela=" + escuela + '}';
    }
    
    
    
    
}
