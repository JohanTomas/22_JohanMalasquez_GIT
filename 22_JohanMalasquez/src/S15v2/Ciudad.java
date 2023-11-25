
package S15v2;

public class Ciudad {
    int cantidad;
    String nombre;
    String lugar;
    String turismo;
    double moneda;
    
    public void persoans() {
        System.out.println("Ahi " + cantidad + " personas");
    }
    
    public void registro() {
        System.out.println("La cuidad se llama " + nombre);
    }
    
    public void nlugar() {
        System.out.println("Ese lugar queda en " + lugar);
    }
    
    public void turismo() {
        System.out.println("el turismo se llama " + turismo);
    }
    
    public void dinero() {
        System.out.println("el turismo cuesta " + moneda);
    }
}
