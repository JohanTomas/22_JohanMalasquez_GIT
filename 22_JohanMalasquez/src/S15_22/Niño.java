
package S15_22;

public class Niño {
    String nombre;
    String apellido;
    String juguete;
    int edad;
    
    public void ncompleto() {
        System.out.println("Ese niño se llama " + nombre + " " + apellido);
    }
    
    public void juego() {
        System.out.println("El niño de la vecina esta jugando con un juguete de " + juguete);
    }
    
    public void años() {
        System.out.println("La edad de niño es " + edad + " años");
    }
    
    public void completo() {
        System.out.println("El niño se llama " + nombre + " ,y esta jugando con un jugute de " + juguete);
    }
}
