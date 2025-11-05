package conversordeunidades;

import java.util.Scanner;

public class ConversorDeUnidades {

    public void iniciarConversorUnidades() {
        Scanner scanner = new Scanner(System.in);

        int option;
        float celsius, fahrenheit, libras, kilos, peso, dolar, newton, Kfuerza, resultado;

        System.out.println("¡CONVERSOR DE UNIDADES!");

        do {
            System.out.println("");
            System.out.println("1. Grados Celsius a grados Fahrenheit");
            System.out.println("2. Grados Fahrenheit a grados Celsius");
            System.out.println("3. Kilogramos a libras");
            System.out.println("4. Libras a kilogramos");
            System.out.println("5. Peso a dólar");
            System.out.println("6. Dólar a peso");
            System.out.println("7. Newton a kilogramos fuerza");
            System.out.println("8. Kilogramos fuerza a Newton");
            System.out.println("9. Kilogramos a Newton (masa a fuerza)");
            System.out.println("10. Newton a Kilogramos (fuerza a masa)");
            System.out.println("0. Salir del conversor");
            System.out.print("Elige una opción (0 para salir): ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Ingrese los grados Celsius: ");
                    celsius = scanner.nextFloat();
                    resultado = celsius * 9 / 5 + 32;
                    System.out.println(celsius + " °C equivale a: " + String.format("%.2f", resultado) + " °F.");
                    break;

                case 2:
                    System.out.print("Ingrese los grados Fahrenheit: ");
                    fahrenheit = scanner.nextFloat();
                    resultado = (fahrenheit - 32) * 5 / 9;
                    System.out.println(fahrenheit + " °F equivale a: " + String.format("%.2f", resultado) + " °C.");
                    break;

                case 3:
                    System.out.print("Ingrese los kilogramos: ");
                    kilos = scanner.nextFloat();
                    resultado = (float) (kilos * 2.20462);
                    System.out.println(kilos + " kg equivale a: " + String.format("%.2f", resultado) + " lb.");
                    break;

                case 4:
                    System.out.print("Ingrese las libras: ");
                    libras = scanner.nextFloat();
                    resultado = (float) (libras / 2.20462);
                    System.out.println(libras + " lb equivale a: " + String.format("%.2f", resultado) + " kg.");
                    break;

                case 5:
                    System.out.print("Ingrese el valor del dólar hoy: ");
                    dolar = scanner.nextFloat();
                    System.out.print("Ingrese la cantidad de pesos a convertir: ");
                    peso = scanner.nextFloat();
                    resultado = peso / dolar;
                    System.out.println(peso + " pesos equivale a: U$D " + String.format("%.2f", resultado));
                    break;

                case 6:
                    System.out.print("Ingrese el valor del dólar hoy: ");
                    dolar = scanner.nextFloat();
                    System.out.print("Ingrese la cantidad de dólares a convertir: ");
                    peso = scanner.nextFloat();
                    resultado = peso * dolar;
                    System.out.println(peso + " dólares equivale a: $" + String.format("%.2f", resultado) + " pesos.");
                    break;

                case 7:
                    System.out.print("Ingrese la cantidad de Newton a convertir: ");
                    newton = scanner.nextFloat();
                    resultado = (float) (newton / 9.80665);
                    System.out.println(newton + " N equivale a: " + String.format("%.2f", resultado) + " kgf.");
                    break;

                case 8:
                    System.out.print("Ingrese la cantidad de kilogramos fuerza a convertir: ");
                    Kfuerza = scanner.nextFloat();
                    resultado = (float) (Kfuerza * 9.80665);
                    System.out.println(Kfuerza + " kgf equivale a: " + String.format("%.2f", resultado) + " N.");
                    break;

                case 9:
                    System.out.print("Ingrese la masa en kilogramos: ");
                    kilos = scanner.nextFloat();
                    resultado = (float) (kilos * 9.80665);
                    System.out.println(kilos + " kg equivale a: " + String.format("%.2f", resultado) + " N.");
                    break;

                case 10:
                    System.out.print("Ingrese la fuerza en Newton: ");
                    newton = scanner.nextFloat();
                    resultado = (float) (newton / 9.80665);
                    System.out.println(newton + " N equivale a: " + String.format("%.2f", resultado) + " kg.");
                    break;

                case 0:
                    System.out.println("Saliendo del conversor...");
                    break;

                default:
                    System.out.println("Opción inválida. Ingrese un número entre 0 y 10.");
            }

        } while (option != 0);
    }
}
