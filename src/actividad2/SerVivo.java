/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad2;

/**
 *
 * @author alumno
 */
public class SerVivo {
    
 private String nombre, color, tamanio;   
 private int edad;

public SerVivo() {
}

    public SerVivo(String nombre, String color, String tamanio, int edad) {
        this.nombre = nombre;
        this.color = color;
        this.tamanio = tamanio;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
   public void comer(){
    System.out.println("Comiendo");  
   } 
   public void dormir(){
    System.out.println("Durmiendo");  
   } 
   public void jugar(){
    System.out.println("Jugando");  
   } 
   
   public void correr(){
    System.out.println("Corriendo");  
   } 

    @Override
    public String toString() {
        return "SerVivo{" + "nombre=" + nombre + ", color=" + color + ", tamanio=" + tamanio + ", edad=" + edad + '}';
    }

    
    
    
}
