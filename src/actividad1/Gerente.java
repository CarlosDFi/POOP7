/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad1;

/**
 *
 * @author alumno
 */
public class Gerente extends Empleado{
    
   private int presupuesto;

    public Gerente() {
    }

    public Gerente(int presupuesto) {
        this.presupuesto = presupuesto;
    }

    public Gerente(int presupuesto, int numEmpleado, int sueldo, String nombre) {
        super(numEmpleado, sueldo, nombre);
        this.presupuesto = presupuesto;
    }

    public int getPresupuesto() {
        return presupuesto;
    }
   
   public void asignarPresupuesto(int presupuesto){
   
       this.presupuesto = presupuesto;
      
   }
    public void aumentarSueldo(double sueldo){
    
    super.setSueldo((int) sueldo); 
    }
    
    @Override
    public String toString() {
        return super.toString()+"Gerente{" + "presupuesto=" + presupuesto + '}';
    }
}
