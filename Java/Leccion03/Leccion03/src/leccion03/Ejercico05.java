package Clase03;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ejercico05 {
    public static void main(String[] args) {

        //Scanner
        Scanner scanner = new Scanner(System.in);
        int intentos = 0;
        int numero;
        int adivinado = (int)(Math.random() * 101);

        do {
            System.out.println("Intente adivinar el número entre 0 y 100: ");
            numero = scanner.nextInt();
            intentos++;

            if(numero > adivinado) {
                System.out.println("El número es menor, sigue intentando: ");
            } else if(numero < adivinado) {
                System.out.println("El número es mayor, sigue intentando: ");
            }

        } while(numero != adivinado);
        System.out.println("¡Felicidades! Adivinaste el número en " + intentos + " intentos.");

        //JOptionPane
        int intentos2 = 0;
        int numero2;
        int adivinado2 = (int)(Math.random() * 101);

        do {
            String input = JOptionPane.showInputDialog("Intente adivinar el número entre 0 y 100: ");
            numero2 = Integer.parseInt(input);
            intentos2 ++;

            if(numero2 > adivinado2) {
                JOptionPane.showMessageDialog(null, "El número es menor, sigue intentando: ");
            } else if(numero2 < adivinado2) {
                JOptionPane.showMessageDialog(null, "El número es mayor, sigue intentando: ");
            }

        } while(numero2 != adivinado2);
        JOptionPane.showMessageDialog(null, "¡Felicidades! Adivinaste el número en " + intentos2 + " intentos.");
    }
}
