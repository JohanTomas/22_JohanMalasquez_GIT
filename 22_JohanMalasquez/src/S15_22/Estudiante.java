
package S15_22;

public class Estudiante {
    String nombre;
    String curso;
    int grado;
    String nivel;
    
    public void nregistro() {
        System.out.println("Ese alumno se llama " + nombre);
    }
    
    public void materia() {
        System.out.println("Me gusta el curso de " + curso);
    }
    
    public void grado() {
        System.out.println("Estoy en el grado de " + grado);
    }
    
    public void nivel() {
        System.out.println("Estoy en el nivel de " + nivel);
    }
}
