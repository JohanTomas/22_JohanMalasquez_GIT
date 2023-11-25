
package S15_22;

public class Perro {
    String nombre;
    String raza;
    String tamaño;
    int edad;
    
    public void ndatos() {
        System.out.println("El perro se llama " + nombre);
    }
    
    public void tamaño() {
        System.out.println("El tamaño de ese perro es " + tamaño);
    }
    
    public void raza() {
        System.out.println("Ese perro es de la raza de " + raza);
    }
    
    public void años() {
        System.out.println("El perro tiene " + edad + " años");
    }
}
