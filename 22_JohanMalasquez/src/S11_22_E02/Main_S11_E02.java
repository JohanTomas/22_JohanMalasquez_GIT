
package S11_22_E02;

/**
 *
 * @author jvale
 */
public class Main_S11_E02 {

    public static void main(String[] args) {
        // TODO code application logic here
        Persona_22_E02 persona = new Persona_22_E02("Johan", 18);
        Cliente_22_E02 cliente = new Cliente_22_E02("4", 250, "BCP", "Johan", 18);
        Atleta_22_E02 atleta = new Atleta_22_E02("Atleta", 4 , 168, "Levano", 35);
        Policia_22_E02 policia = new Policia_22_E02("Sub-Oficial", 2, "Lima", "Levano", 35);
        
        persona.saludar();
        persona.mostrarEdad();
        cliente.compra();
        cliente.fila();
        atleta.entrenar();
        atleta.copas();
        policia.patrullar();
        policia.verañosServicio();
        
    }
    
}
