/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad2;

/**
 *
 * @author FAMILIASANTIAGO
 */
public class Gato extends Mascota{

    private int noVidas;
   
    public Gato() {
    }
    public Gato(int noVidas){
        this.noVidas = noVidas;
    }
    public Gato(String raza, String nombre, String color, String tamanio, int edad, int noVidas) {
        super(raza, nombre, color, tamanio, edad);
    }

    public int getNoVidas() {
        return noVidas;
    }

    public void setNoVidas(int noVidas) {
        this.noVidas = noVidas;
    }

    @Override
    public String toString() {
        return super.toString() +"Gato{" + "noVidas=" + noVidas + '}' ;
        
    }

}
