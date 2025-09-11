package Clase05;
//Ejercicio 8 Pedir un número N, y mostrar todos los números del 1 al N.

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ejercicio08 {
    public static void main(String[] args) {
        //Clase Scanner
        /*
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un número N: ");
        int n = entrada.nextInt();

        System.out.println("Los números del 1 al " + n + " son:");
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
        */
        
        // Clase JOptionPane
        
        String input = JOptionPane.showInputDialog("Ingrese un número N:");
        int n = Integer.parseInt(input);
        
        int[] numeros = new int[n];

        for (int i = 0; i < n; i++) {
            numeros[i] = i + 1;
        }
        
        String resultado = "Los números del 1 al " + n + " son:\n";
        for (int i = 0; i < n; i++) {
            resultado += numeros[i] + "\n";
        }

        // Mostrar el resultado
        JOptionPane.showMessageDialog(null, resultado);
    }
}
