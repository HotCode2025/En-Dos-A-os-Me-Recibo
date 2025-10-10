
package Ciclos12ClaseScanner;
import java.util.Scanner;


public class Ciclos12ClaseScanner {
    public static void main(String[] args2) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        long factorial = 1;

        System.out.print("Introduce un número entero no negativo para calcular su factorial: ");
        numero = scanner.nextInt();

        if (numero < 0) {
            System.out.println("El factorial no está definido para números negativos.");
        } else if (numero == 0) {
            factorial = 1;
            System.out.println("El factorial de " + numero + " es: " + factorial);
        } else {
            for (int i = 1; i <= numero; i++) {
                factorial *= i;
            }
            System.out.println("El factorial de " + numero + " es: " + factorial);
        }
        scanner.close();
    }
}

