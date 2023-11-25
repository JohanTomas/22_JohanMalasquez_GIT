
package S15v2;

public class Musica {
    String nombre;
    int like;
    String tipo;
    String plataf;
    int fecha;
    
    public void musica() {
        System.out.println("la musica se llama " + nombre);
    }
    
    public void like() {
        System.out.println("esa musica tiene " + like);
    }
    
    public void tipo() {
        System.out.println("es tipo de musica es " + tipo);
    }
    
    public void años() {
        System.out.println("la fecha que subio es " + fecha);
    }
    
    public void lugar() {
        System.out.println("esa musica lo esuche en " + plataf);
    }
}
