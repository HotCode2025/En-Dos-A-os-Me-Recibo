package ciclos10;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class Ejercicio10 {
    public static void main(String[] args) {
        //Scanner
        Scanner sc = new Scanner(System.in);
        int numeros = 0;
        int suma = 0;

        System.out.println("Debes ingresar 10 números: ");
        for(int i = 0; i < 10; i ++) {
            System.out.println("Ingresa el número " + (i + 1) + ": ");
            numeros = sc.nextInt();
            suma += numeros;
        }
        System.out.println("La suma de tus 10 números es: " + suma);

        //JOptionPane
        int numeros2 = 0;
        int suma2 = 0;

        for(int i = 0; i < 10; i ++) {
            numeros2 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el número " + (i + 1) + ": "));
            suma2 += numeros2;
        }
        JOptionPane.showMessageDialog(null, "La suma de tus 10 números es: " + suma2); 
    }
}
