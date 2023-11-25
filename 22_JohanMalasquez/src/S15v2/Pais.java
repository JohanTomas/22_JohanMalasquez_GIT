
package S15v2;

public class Pais {
    String nombre;
    String dinero;
    String lugar;
    String clima;
    int hora;
    
    public void pais() {
        System.out.println("el pais se llama " + nombre);
    }
    
    public void dinero() {
        System.out.println("la moneda es " + dinero);
    }
    
    public void lugar() {
        System.out.println("el lugar donde estoy es " + lugar);
    }
    
    public void estacion() {
        System.out.println("el clima del pais es " + clima);
    }
    
    public void tiempo() {
        System.out.println("el tiempo qe llevo son  " + hora);
    }
}
