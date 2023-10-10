/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S11_22;

/**
 *
 * @author jvale
 */
public class Persona_22 {

    public Persona_22(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
        
    //atributos
    private String nombre;
    private int edad;
    
    //metodos
    public void hablar() {
        System.out.println("");
    }
    
    public void escuchar() {
    
    }
    
    public void caminar() {
    
    }
    
    //get and set

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
}
