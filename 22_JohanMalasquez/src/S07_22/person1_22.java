
package S07_22;

public class person1_22 {
    //ATRIBUTOS
    String nombre;
    String apellido;
    int edad;
                
    //METODO - SOBRECARGA DE METODOS
    public void saludar() {
        System.out.println("Hola que tal " + nombre);
    }
    
    public void ncompleto() {
        System.out.println("Me llamo " + nombre + apellido);
    }
    
    public void año() {
        System.out.println("Tengo " + edad);
    }
    
    //METODO CON VALORES DE RETORNO
    public int años() {
        return 2 * edad;
    }
}
