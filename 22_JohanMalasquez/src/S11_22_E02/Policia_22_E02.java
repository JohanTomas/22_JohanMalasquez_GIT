
package S11_22_E02;

/**
 *
 * @author jvale
 */
public class Policia_22_E02 extends Persona_22_E02{
    
    //ATRIBUTOS
    private String rango;
    private int añosServicio;
    private String departamento;
    
    //METODOS
    public Policia_22_E02(String rango, int añosServicio, String departamento, String nombre, int edad) {
        super(nombre, edad);
        this.rango = rango;
        this.añosServicio = añosServicio;
        this.departamento = departamento;
    }

    
    
    public void patrullar() {
        System.out.println( nombre + " es un oficial de policia del departamento de " + departamento);
    }
    
    public void verañosServicio() {
        System.out.println("Años de servicio de " + nombre + " : " + añosServicio);
    }
}
