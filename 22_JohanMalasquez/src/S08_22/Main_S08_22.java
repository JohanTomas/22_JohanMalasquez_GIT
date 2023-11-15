
package S08_22;

public class Main_S08_22 {
        public static void main(String[] args) {
        personas1 p1 = new personas1();
        personas2 p2 = new personas2();

        p1.saludar("Johan", "Malasquez");
        p1.edad(25);

        p2.setNombre("Johan");
        p2.setApellidos("Malasquez");
        p2.setEdad(18);

        p2.saludar();
        String nombreCompleto = p2.obtenerNombreCompleto("Juan", "Valerio");
        System.out.println(nombreCompleto);

        int edad = p2.obtenerEdad(20);
        System.out.println("Edad: " + edad);
        
    }
}
