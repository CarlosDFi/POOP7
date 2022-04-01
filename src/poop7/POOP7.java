/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop7;

import actividad1.Empleado;
import actividad1.Gerente;
import actividad2.Alumno;
import actividad2.Gato;
import actividad2.Mesero;
import actividad2.PAsignatura;
import actividad2.PCarrera;
import actividad2.Perro;
import actividad2.Persona;
import actividad2.Profesor;
import actividad2.SerVivo;
import actividad2.Trabajador;

/**
 *
 * @author alumno
 */
public class POOP7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    Empleado empleado = new Empleado();  
    empleado.setNombre("Pedro");
    empleado.setNumEmpleado(997755);
    empleado.setSueldo(10_000);
        System.out.println(empleado);
    empleado.aumentarSueldo(30);
        System.out.println(empleado);
        System.out.println("############################################");
        
    Gerente gerente= new Gerente();
    gerente.setNombre("Paulina");
    gerente.setNumEmpleado(228855);
    gerente.setSueldo(20_000);
    gerente.asignarPresupuesto(300_000);
        System.out.println(gerente);
        System.out.println("############################################");
        
    Gerente gerente2 = new Gerente (500_000,119922,30_000, "jorch");  
        System.out.println(gerente2);
        System.out.println("############################################");
        
    Empleado gerente3 = new Gerente (1_000_000,11,50_000,"Frida");
        System.out.println(gerente3);
        System.out.println("############################################");
        
    if(gerente instanceof Gerente){
        System.out.println("instancia de gerente");
    } if(gerente instanceof Empleado){
        System.out.println("instancia de empleado");    
    } if(gerente instanceof Object){
        System.out.println("instancia de object");
    }
        System.out.println("############################################");
        
     gerente.aumentarSueldo(100);
     gerente.aumentarSueldo(50_000.5);
     
     SerVivo serVivo = new SerVivo("pedrolo","rojo","pequeño",5);
        System.out.println(serVivo);
     serVivo.comer();
     serVivo.correr();
     serVivo.dormir();
     serVivo.jugar();
     System.out.println("############################################");
     
     Persona persona = new Persona("UNAM","Juan", "blanco","grande",23);
        System.out.println(persona);
     persona.hablar();
     System.out.println("############################################");
     
     Perro perro = new Perro ("labrador","Kaya","negro","mediano",6);
     perro.ladrar();
     perro.comer();
     perro.correr();
     perro.dormir();
     perro.jugar();
        System.out.println(perro);
        System.out.println("############################################");
        
     Gato gato = new Gato ("siames ","pelusa ","blanco ", "pequeño",6,9);
     gato.setNoVidas(9);
     gato.comer();
     gato.correr();
     gato.dormir();
     gato.jugar();
        System.out.println(gato);
        System.out.println("############################################");
     
     Alumno alumno = new Alumno ("UNAM","Juan", "blanco","grande",23);
     alumno.comer();
     alumno.correr();
     alumno.dormir();
     alumno.estudiar();
     alumno.hablar();
     alumno.jugar();
        System.out.println(alumno);
        System.out.println("############################################");
        
    Trabajador trabajador = new Trabajador();
    
    Profesor profesor = new Profesor ();
    
    PCarrera pcarrera = new PCarrera ("Computacion ","UNAM","Marco","moreno","Grande",40);
    pcarrera.setCarrera("Computacion");
    pcarrera.cobrar();
    pcarrera.comer();
    pcarrera.correr();
    pcarrera.dejarTarea();
    pcarrera.dormir();
    pcarrera.hablar();
    pcarrera.jugar();
        System.out.println(pcarrera);
        System.out.println("############################################"); 
        
    PAsignatura pasignatura = new PAsignatura ("Algebra ","UNAM","Marco","moreno","Grande",40);
    pasignatura.setAsignatura("Algebra");
    pasignatura.cobrar();
    pasignatura.comer();
    pasignatura.correr();
    pasignatura.dejarTarea();
    pasignatura.dormir();
    pasignatura.hablar();
    pasignatura.jugar();
        System.out.println(pasignatura);
        System.out.println("############################################");     
        
    Mesero mesero = new Mesero (" ","Alejandro","palido","pequeño",22);
    mesero.cobrar();
    mesero.comer();
    mesero.correr();
    mesero.dormir();
    mesero.hablar();
    mesero.jugar();
    mesero.llevarComida();
    mesero.pedirPropina();
        System.out.println(mesero);
        System.out.println("############################################"); 
    }
    
}