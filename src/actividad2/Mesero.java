/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad2;

/**
 *
 * @author FAMILIASANTIAGO
 */
public class Mesero extends Trabajador{

    public Mesero() {
    }

    public Mesero(String escuela, String nombre, String color, String tamanio, int edad) {
        super(escuela, nombre, color, tamanio, edad);
    }
    public void pedirPropina (){
        System.out.println("pidiendo propina");
    }  
    public void llevarComida (){
        System.out.println("llevando comida");
    }

    @Override
    public String toString() {
        return super.toString()+ "Mesero";
    }
    
}
