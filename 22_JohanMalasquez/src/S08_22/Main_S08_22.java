
package S08_22;

public class Main_S08_22 extends protected1{
    
    public static void main(String[] args) {
       public1 p1 = new public1();
       private1 p2 = new private1();
       protected1 p3 = new protected1("Perro");
       default1 p4 = new default1();

       p1.saludar("Johan", "Malasquez");
       p1.edad(18);

       p2.setNombre("Johan");
       p2.setApellidos("Malasquez");
       p2.setEdad(18);

       p2.saludar();
       String nombreCompleto = p2.obtenerNombreCompleto("Juan", "Valerio");
       System.out.println(nombreCompleto);

       int edad = p2.obtenerEdad(20);
       System.out.println("Edad: " + edad);
       
       p3.sonido();
       
       p4.experiencia();
    }

    public Main_S08_22(String nombre) {
        super(nombre);
    }
}
