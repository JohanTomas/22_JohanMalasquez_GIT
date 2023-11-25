/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package S15v3;

/**
 *
 * @author jvale
 */
public class Policia {
    String nombre;
    String cargo;
    int edad;
    int añosE;
    int orden;
    
    public void datos() {
        System.out.println("el nombre del policia es " + nombre);
    }
    
    public void rango() {
        System.out.println("el cargo es " + cargo);
    }
    
    public void ragistro() {
        System.out.println("la edad del policia es " + edad);
    }
    
    public void expe() {
        System.out.println("lleva hace " + añosE);
    }
    
    public void orden() {
        System.out.println("el numero de orden es " + orden);
    }
}
