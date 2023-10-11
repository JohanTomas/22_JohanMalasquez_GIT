
package S11_22_E02;

/**
 *
 * @author jvale
 */
public class Cliente_22_E02 extends Persona_22_E02 {
    //ATRIBUTOS
    private String numeroClientes;
    private double saldo;
    private String tipoCuenta;

    //METODOS

    public Cliente_22_E02(String numeroClientes, double saldo, String tipoCuenta, String nombre, int edad) {
        super(nombre, edad);
        this.numeroClientes = numeroClientes;
        this.saldo = saldo;
        this.tipoCuenta = tipoCuenta;
    }
        
    public void compra() {
        System.out.println("estoy comprando cosas y esta " + saldo);
    }
    
    public void fila() {
        System.out.println("Para pagar ahi " + numeroClientes + " personas");
    }
}
