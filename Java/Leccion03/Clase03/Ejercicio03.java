package Clase03;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ejercicio03 {
    public static void main(String[] args) {

        //Scanner
        Scanner scanner = new Scanner(System.in);
        int numero;
        do {
            System.out.println("Ingrese un número (0 para salir): ");
            numero = scanner.nextInt();
            if(numero == 0) {
                break;
            } 
            else if(numero % 2 == 0) {
                System.out.println("El número " + numero + " es par.");
            }
            else if(numero % 2 != 0) {
                System.out.println("El número " + numero + " es impar.");
            }
        } while (numero != 0);
        System.out.println("Fin del programa.");

        //JOptionPane
        int numero2;
        do {
            String input = JOptionPane.showInputDialog("Ingrese un número (0 para salir): ");
            numero2 = Integer.parseInt(input);
            if(numero2 == 0) {
                break;
            } 
            else if(numero2 % 2 == 0) {
                JOptionPane.showMessageDialog(null, "El número " + numero2 + " es par.");
            }
            else if(numero2 % 2 != 0) {
                JOptionPane.showMessageDialog(null, "El número " + numero2 + " es impar.");
            }
        } while(numero2 != 0);
        JOptionPane.showMessageDialog(null, "Fin del programa.");

    }
}




