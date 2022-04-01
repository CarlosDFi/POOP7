/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad2;

/**
 *
 * @author FAMILIASANTIAGO
 */
public class PCarrera extends Profesor {
    private String carrera;

    public PCarrera() {
    }
    public PCarrera(String carrera){
        this.carrera = carrera;
    }

    public PCarrera(String carrera, String escuela, String nombre, String color, String tamanio, int edad) {
        super(escuela, nombre, color, tamanio, edad);
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        return super.toString()+ "PCarrera{ " + "carrera= " + carrera + '}';
    }
    
}
