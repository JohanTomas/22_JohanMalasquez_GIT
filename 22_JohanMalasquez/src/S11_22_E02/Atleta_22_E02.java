
package S11_22_E02;

/**
 *
 * @author jvale
 */
public class Atleta_22_E02 extends Persona_22_E02 {
    
    //Atributos
    private String deporte;
    private int medallas;
    private int altura;
    
    //Metodos
    public Atleta_22_E02(String deporte, int medallas, int altura, String nombre, int edad) {
        super(nombre, edad);
        this.deporte = deporte;
        this.medallas = medallas;
        this.altura = altura;
    }
    
    public void entrenar() {
        System.out.println("Es una atleta que entrena para competir en " + deporte);
    }
    
    public void copas() {
        System.out.println(nombre + " ah ganado " + medallas + " medallas" );
    }
}
