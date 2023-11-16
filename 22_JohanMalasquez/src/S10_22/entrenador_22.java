
package S10_22;

public class entrenador_22 extends seleccionFutbol_22  {

//METODO DEL CONSTRUCTOR
public entrenador_22(String idFederacion, int id, String nombre, String apellidos, int edad) {
    super(id, nombre, apellidos, edad);
    this.idFederacion = idFederacion;
    }
    
//ATRIBUTOS
    private String idFederacion;

//METODOS
    public void dirigirPartido() {
    }

    public void dirigirEntrenamiento() {
        System.out.println(nombre + " es el entrenador");
    }
}
