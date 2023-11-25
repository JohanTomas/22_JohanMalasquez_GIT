
package S15v2;

public class Mesa {
    int cantidad;
    int sillas;
    String material;
    String color;
    int año;
    
    public void personas() {
        System.out.println("la mesa solo son para "  + cantidad);
    }
    
    public void sillas() {
        System.out.println(" solo tenemos para " + sillas);
    }
    
    public void material() {
        System.out.println("la mesa esta hecha de " + material);
    }
    
    public void color() {
        System.out.println("el color de la mesa es " + color);
    }
    
    public void años() {
        System.out.println("esa mesa lleva hace unos " + año + " años");
    }
}
