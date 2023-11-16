
package S07_22;

public class persona1 {
    //ATRIBUTOS
    String nombre;
    String apellido;
    int edad;    
    
    //METODO CON VALORES DE RETORNO
    public int años() {
        return 2 * edad;
    }
    
    public String ncompleto(){
        return nombre + apellido;
    }
    
    public String respuesta(){
        return "mi nombre es " + nombre + apellido + " y tengo " + edad;
    }
}
