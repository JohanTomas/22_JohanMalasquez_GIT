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
public class Estudiante_22 extends Persona_22 {

    public Estudiante_22(String carrera, int numeroDeorden, int ciclo, String nombre, int edad) {
        super(nombre, edad);
        this.carrera = carrera;
        this.numeroDeorden = numeroDeorden;
        this.ciclo = ciclo;
    }
    
       
    //nombre
    //edad
    String carrera;
    int numeroDeorden;
    int ciclo;
    
    
    
    
}
