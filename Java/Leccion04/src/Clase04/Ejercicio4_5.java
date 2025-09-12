package Clase04;

import java.util.Scanner;
import javax.swing.JOptionPane;

/*
Pedir números hasta que se teclee un 0, mostrar la suma 
de todos los números introducidos.
*/

public class Ejercicio4_5 {
    public static void main(String[] args) {
        
        //Resolución clase Scanner. 
        /*
        Scanner entrada = new Scanner(System.in);
        int numero, suma = 0; 
        do {
            System.out.println("Ingrese un numero");
            numero = Integer.parseInt(entrada.nextLine());
            suma += numero;
        }while(numero != 0);
        System.out.println("\nLa suma de todos los numeros ingresados es: "+suma);
        */
       //Resolución clase JOptionPane
       int numero, suma = 0;
       
        do {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número :"));
            suma += numero;
        }while(numero != 0);
        
        JOptionPane.showMessageDialog(null, "La suma de los numeros ingresados es: " + suma);
    }
}
