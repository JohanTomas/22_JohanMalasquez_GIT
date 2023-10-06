
package S05_22;

import javax.swing.JOptionPane;

public class Auto {
    //atributo
    String marca;
    String color;
    int kilometros;
    
    //metodo
    public void acelerar() {
        System.out.println("el auto color " + color + " aceleré");
    }
    
    public void frenar() {
        System.out.println("frena pues causa!!!! ");
    }

    public void sonido() {
        System.out.println("tuuuuuu !!!");
    }
    
    public void preguntar(){
        marca = JOptionPane.showInputDialog(null, "Ingrese la marca");
        color  = JOptionPane.showInputDialog(null, "Ingrese el color");
       kilometros = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese el km"));
    }
}
