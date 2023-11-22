
package S08_22;

public class private1 {
    // ATRIBUTOS
    private String nombre;
    private String apellidos;
    private int edad;

    // METODO
    public void saludar() {
        System.out.println("Me llamo " + nombre + " " + apellidos + " y tengo " + edad);
    }

    // METODO CON VALORES DE RETORNO
    public String obtenerNombreCompleto(String nombre, String apellidos) {
        return nombre + " " + apellidos;
    }

    public int obtenerEdad(int edad) {
        return edad;
    }

    // GETTERS Y SETTERS
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
