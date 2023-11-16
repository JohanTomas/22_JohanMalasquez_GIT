
package S10_22;

public class seleccionFutbol_22 {

//CLASE PADRE
//METODO DEL CONSTRUCTOR

    public seleccionFutbol_22(int id, String nombre, String apellidos, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }
    
    
    
//ATRIBUTOS
    protected int id;
    protected String nombre;
    protected String apellidos;
    protected int edad;
    
//METODOS
    public void concentrarse() {
        System.out.println(getNombre() + " se esta concentrando ");
    }

    public void viajar() {
        System.out.println("El viaje comenzo " + getNombre());
    }
//GET and SETTER
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
        
}
