
package Ciclos12ClaseJOptionPane;

import javax.swing.JOptionPane;


public class Ciclos12ClaseJOptionPane {
      public static void main(String[] args) {
        String input;
        int numero;
        long factorial = 1;

        input = JOptionPane.showInputDialog("Introduce un número entero no negativo para calcular su factorial:");
        try {
            numero = Integer.parseInt(input);

            if (numero < 0) {
                JOptionPane.showMessageDialog(null, "El factorial no está definido para números negativos.");
            } else if (numero == 0) {
                factorial = 1;
                JOptionPane.showMessageDialog(null, "El factorial de " + numero + " es: " + factorial);
            } else {
                for (int i = 1; i <= numero; i++) {
                    factorial *= i;
                }
                JOptionPane.showMessageDialog(null, "El factorial de " + numero + " es: " + factorial);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Entrada inválida. Por favor, introduce un número entero.");
        }
    }
}
