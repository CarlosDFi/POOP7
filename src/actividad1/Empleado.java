/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad1;

/**
 *
 * @author alumno
 */
public class Empleado {
    private int numEmpleado, sueldo;
    private String nombre; 

    public Empleado() {
    }

    public Empleado(int numEmpleado, int sueldo, String nombre) {
        this.numEmpleado = numEmpleado;
        this.sueldo = sueldo;
        this.nombre = nombre;
    }

    public int getNumEmpleado() {
        return numEmpleado;
    }

    public void setNumEmpleado(int numEmpleado) {
        this.numEmpleado = numEmpleado;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        if(sueldo >= 0)
        this.sueldo = sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public void aumentarSueldo(int porcentaje){

    sueldo += (int)(sueldo * porcentaje / 100);

    }

    @Override
    public String toString() {
        return "Empleado{" + "numEmpleado=" + numEmpleado + ", sueldo=" + sueldo + ", nombre=" + nombre + '}';
    }
    
    
}
