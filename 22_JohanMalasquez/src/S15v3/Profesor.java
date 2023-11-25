/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package S15v3;

/**
 *
 * @author jvale
 */
public class Profesor {
    String nombre;
    String curso;
    int edad;
    String estado;
    String gusto;
    
    public void datos() {
        System.out.println("mi nombre es" + nombre);
    }
    
    public void curso() {
        System.out.println("yo enseño el curso de "+ curso);
    }
    
    public void edad() {
        System.out.println("mi edad es " + edad);
    }
    
    public void ndatos() {
        System.out.println("estoy " + estado);
    }
    
    public void ptiempo() {
        System.out.println("me esta estar en "+ gusto);
    }
}
