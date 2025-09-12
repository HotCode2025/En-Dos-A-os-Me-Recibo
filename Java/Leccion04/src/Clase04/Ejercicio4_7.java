/*
    Pedir números hasta que se introduzca uno negativo
    y calcular la media
*/
package Clase04;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ejercicio4_7 {
    public static void main(String[] args) {
        
        /*
        //Clase Scanner
        Scanner entrada = new Scanner(System.in);
        int numero, conteo = 0, suma = 0;
        float promedio = 0;
        System.out.println("\nIngrese un numero");
        numero = Integer.parseInt(entrada.nextLine());
        while(numero >= 0){
            suma += numero;
            conteo++;
            System.out.println("\nIngrese un numero");
            numero = Integer.parseInt(entrada.nextLine());
        };
        
        if(suma == 0){
            System.out.println("\nError la división entre cero no existe");
        }else {
            promedio = (float)suma/conteo;
            System.out.println("\nEl promedio es: "+promedio);
        }
        */
        
        //Clase JOptionPane
        
        int numero, conteo = 0, suma = 0;
        float promedio = 0;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número :"));
        while(numero >= 0){
            suma += numero;
            conteo++;
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número :"));
        };
        
        if(suma == 0){
            JOptionPane.showMessageDialog(null, "Error la división entre cero no existe");
        }else {
            promedio = (float)suma/conteo;
            JOptionPane.showMessageDialog(null, "El promedio es: "+promedio);
        }
    }
}
