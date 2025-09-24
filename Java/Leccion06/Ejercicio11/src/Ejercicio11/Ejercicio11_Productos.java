
package Ejercicio11;

import javax.swing.JOptionPane;

public class Ejercicio11_Productos {
    public static void main(String[] args) {
        long producto = 1; // Inicializo el producto en 1
        int contador = 0; // Contador para los 10 primeros números impares

        // Calcular el producto de los 10 primeros números impares
        for (int i = 1; contador < 10; i += 2) {
            producto *= i;
            contador++;
        }

        // Mostrar el resultado usando JOptionPane con salto de línea
        JOptionPane.showMessageDialog(null, "El producto de los 10 primeros números impares es:\n" + producto);
    }
}
