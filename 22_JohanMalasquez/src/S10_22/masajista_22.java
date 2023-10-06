
package S10_22;

/**
 *
 * @author jvale
 */
public class masajista_22 extends seleccionFutbol_22 {
    
    public masajista_22(String titulacion, int aniosExperiencia, int id, String nombre, String apellidos, int edad) {
        super(id, nombre, apellidos, edad);
        this.titulacion = titulacion;
        this.aniosExperiencia = aniosExperiencia;
    }

//atributos
    private String titulacion;
    private int aniosExperiencia;

   
//metodos

    public void darMasaje() {
        System.out.println(nombre + " da masajes");
    }
}
