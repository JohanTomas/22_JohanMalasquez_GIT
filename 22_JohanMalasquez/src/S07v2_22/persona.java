
package S07v2_22;

public class persona {
    String nombre;
    int edad;
    String sexo;
    
    //METODOS - SOBRECARGA DE METODOS
    public void  dormir() {
        System.out.println("Quiero dormir");
    }
    
    public  void hablar () {
        System.out.println("hola");
    }
    public void genero() {
        System.out.println("Hombres");
    }
     
    //METODO DE RETORNO
    public void correr() {
    }
    
    public int añ0(){
        return 18;
    }
    
    public String nombre() {
        return "Jvalerius";
    }
    public float num() {
        return 12.2f;
    }
    
    //METODO CON PARAMETORS Y ARGUMENTOS
    public void metodo1(int a) {
    }
    
     public void metodo1(String a) {
    } 
}
