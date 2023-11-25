
package S15_22;

public class Doctor {
    String nombre;
    String apellido;
    int edad;
    int añosE;
    
    public void nregistro() {
        System.out.println("El nombre del Dr es " + nombre + " " + apellido);
    }
    
    public void edad() {
        System.out.println("La edad del Dr es " + edad + " años") ;
    }
    
    public void añosE() {
        System.out.println("El Dr lleva mas de " + añosE);
    }
    
    public void lugar() {
        System.out.println("El Dr lleva mas de " + añosE + " en el hospital");
    }
}
