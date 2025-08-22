import java.util.Scanner;

public class EjerciciosCiclos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  

        while(true) {
            System.out.print("Ingrese un número: ");
            int numero = scanner.nextInt();
            int doble = numero * 2;
            System.out.println("El doble de " + numero + " es: " + doble);
        }
    }
}

