/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad2;

/**
 *
 * @author alumno
 */
public class Mascota extends SerVivo {
 
    private String raza;

    public Mascota() {
    }

    public Mascota(String raza) {
        this.raza = raza;
    }

    public Mascota(String raza, String nombre, String color, String tamanio, int edad) {
        super(nombre, color, tamanio, edad);
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return super.toString()+"Mascota{" + "raza=" + raza + '}';
    }
    
    

  
    
   
    
}
