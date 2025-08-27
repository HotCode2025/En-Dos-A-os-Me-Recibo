package Clase03;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ejercicio04 {
    public static void main(String[] args) {

        //Scanner
        Scanner scanner = new Scanner(System.in);
        int numero;
        int cantidad = 0; // contador de números positivos

        do {
            System.out.print("Ingrese un número: ");
            numero = scanner.nextInt();
            if (numero > 0) {
                cantidad++; // aumentamos el contador
            }
        } while (numero > 0);
        System.out.println("Cantidad de números ingresados: " + cantidad);

        //JOptionPane
        int numero2;
        int cantidad2 = 0; // contador de números positivos
        do {
            String input = JOptionPane.showInputDialog("Ingrese un número: ");
            numero2 = Integer.parseInt(input);
            if(numero2 > 0) {
                cantidad2++;
            }
        } while(numero2 > 0);
        JOptionPane.showMessageDialog(null, "Cantidad de números ingresados: " + cantidad2);
    }
}

