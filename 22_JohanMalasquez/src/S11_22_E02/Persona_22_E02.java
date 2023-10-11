
package S11_22_E02;

/**
 *
 * @author jvale
 */
public class Persona_22_E02 {
    //ATRIBUTOS
    String nombre;
    int edad;
    
    
    //METODOS
    public Persona_22_E02(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public void saludar() {
        System.out.println("Hola, soy " + nombre + " y tengo " + edad + " años");
    }
    
    public void mostrarEdad() {
        System.out.println("La edad que tengo es " + edad);
    }
    
    //GET AND SETTER

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
}
