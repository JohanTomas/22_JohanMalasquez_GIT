/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S11_22_E01;

/**
 *
 * @author jvale
 */
public class Estudiante_22_E01 extends Persona_22_E01 {
      private String institucion;
      private int numeroDeorden;
      private   int ciclo;

    public Estudiante_22_E01(String institucion, int numeroDeorden, int ciclo, String Nombre, int edad) {
        super(Nombre, edad);
        this.institucion = institucion;
        this.numeroDeorden = numeroDeorden;
        this.ciclo = ciclo;
    }
     
    public void estudiar() {
        System.out.println(nombre + " está estudiando en " + institucion);
    }
}
