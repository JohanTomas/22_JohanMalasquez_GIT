
package S15v2;

public class REloj {
    int hora;
    int minutos;
    int segundo;
    String material;
    String marca;
    
    public void tiempo() {
        System.out.println("La son a las " + hora + minutos);
    }
    
    public void minutos() {
        System.out.println("lleva hace unos  " + minutos);
    }
    
    public void segundo() {
        System.out.println("la persona solo le llva unos " + segundo);
    }
    
    public void material() {
        System.out.println("ese reloj esta hecho de "+ material);
    }
    
    public void nombre() {
        System.out.println("la marca del reloj es " + marca);
    }
}

