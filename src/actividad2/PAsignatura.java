/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad2;

/**
 *
 * @author FAMILIASANTIAGO
 */
public class PAsignatura extends Profesor {
    private String asignatura;

    public PAsignatura() {
    }
    public PAsignatura(String asignatura){
        this.asignatura = asignatura;
    }

    public PAsignatura(String asignatura, String escuela, String nombre, String color, String tamanio, int edad) {
        super(escuela, nombre, color, tamanio, edad);
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    @Override
    public String toString() {
        return super.toString()+ "PAsignatura{" + "asignatura=" + asignatura + '}';
    }
    
    
    

    
    
}
