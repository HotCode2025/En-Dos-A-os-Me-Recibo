package Clase05;

import java.util.Scanner;
import javax.swing.JOptionPane;

/*
Ejercicio 9: Pedir el día, mes y año de una fecha e indicar si la fecha es correcta. 
Suponiendo que todos los meses son 30 días. 
*/
public class Ejercicio09 {
     public static void main(String[] args) { 
        /*
        //Clase Scanner
        Scanner entrada = new Scanner(System.in);
        // Pedimos los datos al usuario
        System.out.print("Por favor ingrese la fecha: ");
        //día
        System.out.print("día: ");
        int dia = entrada.nextInt();
        //mes
        System.out.print("mes: ");
        int mes = entrada.nextInt();
        //año
        System.out.print("año: ");
        int anio = entrada.nextInt();
        //se valida la fecha
        boolean fechaCorrecta = true;

        if (dia < 1 || dia > 30) {
            fechaCorrecta = false;
        }

        if (mes < 1 || mes > 12) {
            fechaCorrecta = false;
        }

        if (anio == 0 ) {
            fechaCorrecta = false;
        }

        // Mostrar resultado
        if (fechaCorrecta) {
            System.out.println("La fecha " + dia + "/" + mes + "/" + anio + " es correcta.");
        } else {
            System.out.println("La fecha ingresada NO es correcta.");
        }
        */
        
        // Claes JOptionPane
        int dia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el día:"));
        int mes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el mes:"));
        int anio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año:"));

        // Validar la fecha (todos los meses con 30 días)
        boolean fechaCorrecta = true;

        if (dia < 1 || dia > 30) {
            fechaCorrecta = false;
        }

        if (mes < 1 || mes > 12) {
            fechaCorrecta = false;
        }

        if (anio < 0) {
            fechaCorrecta = false;
        }

        // Mostramos si la fecha es correcta o no
        if (fechaCorrecta) {
            JOptionPane.showMessageDialog(null, 
                    "La fecha " + dia + "/" + mes + "/" + anio + " es correcta.");
        } else {
            JOptionPane.showMessageDialog(null, 
                    "La fecha ingresada NO es correcta.");
        }

     }
}
