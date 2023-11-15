
package S06_22;

import java.util.Scanner;

public class calculadora_22 {
    //ATRIBUTOS
    int a;
    int b;
    int totalsuma;
    int totalresta;
    int totalmultiplicar;
    int totaldivision;
    
    //SOBRECARGA DE CONSTRUCTORES
    public calculadora_22(int a, int b, int totalsuma, int totalresta, int totalmultiplicar, int totaldivision) {
        this.a = a;
        this.b = b;
        this.totalsuma = totalsuma;
        this.totalresta = totalresta;
        this.totalmultiplicar = totalmultiplicar;
        this.totaldivision = totaldivision;
    }

    public calculadora_22(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public calculadora_22(int totalsuma, int totalresta, int totalmultiplicar, int totaldivision) {
        this.totalsuma = totalsuma;
        this.totalresta = totalresta;
        this.totalmultiplicar = totalmultiplicar;
        this.totaldivision = totaldivision;
    }   
    
    //METODOS / SOBRECARGA DE METODO
    public void sumar() {
        totalsuma = a + b;
        System.out.println(totalsuma);
    }
    
    public void restar() {
        totalresta = a - b;
        System.out.println(totalresta);
    }
    
    public void multiplicar() {
        totalmultiplicar = a * b;
        System.out.println(totalmultiplicar);
    }
            
    public void dividir() {
        if (b != 0) {
            totaldivision = a / b;
            System.out.println(totaldivision);
        } else {
            System.out.println("Error: No se puede dividir por cero.");
        }
    }
    
    //METODO CON VALOR DE RETORNO
    public int variable() {
        return a + b;
    }
    
    public void preguntar() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite el primer número: ");
        a = scanner.nextInt();
        System.out.print("Digite el segundo número: ");
        b = scanner.nextInt();
        scanner.close();
    }
    
    public void mostrarValores() {
        System.out.println("La suma es: " + totalsuma);
        System.out.println("La resta es: " + totalresta);
        System.out.println("La multiplicación es: " + totalmultiplicar);
        System.out.println("La división es: " + totaldivision);
    }    

}
