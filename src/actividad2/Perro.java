/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad2;

/**
 *
 * @author alumno
 */
public class Perro extends Mascota{

    public Perro() {
    }

    public Perro(String raza, String nombre, String color, String tamanio, int edad) {
        super(raza, nombre, color, tamanio, edad);
    }
    
    public void ladrar (){
        System.out.println("ladrando");
    }

    @Override
    public String toString() {
        return super.toString() +"Perro ";
        }
    
   
}
