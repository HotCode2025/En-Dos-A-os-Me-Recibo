/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conversordeunidades;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author 54382
 */
public class ConversorDeUnidades {
    
    public void iniciarConversorUnidades() {
         Scanner scanner = new Scanner(System.in);

        int option;
        float celsius, fahrenheit, libras, kilos, peso, dolar, newton, Kfuerza, resultado;
        System.out.println("�CONVERSOR DE UNIDADES!");

        do {

            System.out.println("");
            System.out.println("1. Grados Celsius a grados Fahrenheit");
            System.out.println("2. Grados Fahrenheit a grados Celsius");
            System.out.println("3. Kilogramos a libras");
            System.out.println("4. Libras a kilogramos");
            System.out.println("5. Peso a dolar");
            System.out.println("6. Dolar a peso");
            System.out.println("7. Newton a kilogramos fuerza");
            System.out.println("8. Kilogramos fuerza a Newton");
            System.out.println("0. Salir del conversor");
            System.out.println("");
            System.out.print("Elige una opcion. Si deseas salir del conversor teclea 0: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Ingrese los grados Celsius: ");
                    celsius = scanner.nextFloat();
                    resultado = celsius * 9 / 5 + 32;
                    JOptionPane.showMessageDialog(null, celsius + " C� equivale a: " + String.format("%.2f", resultado) + " �F.");
                    break;

                case 2:
                    System.out.println("Ingrese los grados Fahrenheit: ");
                    fahrenheit = scanner.nextFloat();
                    resultado = (fahrenheit - 32) * 5 / 9;
                    JOptionPane.showMessageDialog(null, fahrenheit + " F� equivale a: " + String.format("%.2f", resultado) + " �C.");
                    break;

                case 3:
                    System.out.println("Ingrese los Kilogramos: ");
                    kilos = scanner.nextFloat();
                    resultado = (float) (kilos * 2.20462);
                    JOptionPane.showMessageDialog(null, kilos + " kg equivale a: " + String.format("%.2f", resultado) + " libras.");
                    break;

                case 4:
                    System.out.println("Ingrese las Libras: ");
                    libras = scanner.nextFloat();
                    resultado = (float) (libras / 2.20462);
                    JOptionPane.showMessageDialog(null, libras + " libras equivale a: " + String.format("%.2f", resultado) + " kg.");
                    break;

                case 5:
                    System.out.println("Ingrese el valor del dolar en el di�a de hoy: ");
                    dolar = scanner.nextFloat();
                    System.out.println("Ingrese la cantidad de pesos a convertir: ");
                    peso = scanner.nextFloat();
                    resultado = peso / dolar;
                    JOptionPane.showMessageDialog(null, "El equivalente en dolares es: U$D " + String.format("%.2f", resultado));
                    break;

                case 6:
                    System.out.println("Ingrese el valor del dolar en el di�a de hoy: ");
                    dolar = scanner.nextFloat();
                    System.out.println("Ingrese la cantidad de dolares a convertir: ");
                    peso = scanner.nextFloat();
                    resultado = peso * dolar;
                    JOptionPane.showMessageDialog(null, "El equivalente en pesos es: $ " + String.format("%.2f", resultado));
                    break;

                case 7:
                    System.out.println("Ingrese la cantidad de Newton a convertir: ");
                    newton = scanner.nextFloat();
                    resultado = (float) (newton / 9.80665);
                    JOptionPane.showMessageDialog(null, newton + " N equivale a: " + String.format("%.2f", resultado) + " kgf");
                    break;

                case 8:
                    System.out.println("Ingrese la cantidad de kilogramos fuerza a convertir: ");
                    Kfuerza = scanner.nextFloat();
                    resultado = (float) (Kfuerza * 9.80665);
                    JOptionPane.showMessageDialog(null, Kfuerza + " kgf equivale a: " + String.format("%.2f", resultado) + " N");
                    break;

                case 0:
                    JOptionPane.showMessageDialog(null, "Saliendo del conversor...");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Ingreso una opcion INCORRECTA. Ingrese entre 0-8");
            }
        } while (option != 0);
    }
    
    
    
}
