package caja;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class PruebaCaja {
    public static void main(String[] args) {
        //Scanner
        Scanner sc = new Scanner(System.in);
        Caja caja1 = new Caja(); // Instancia de la clase Caja y creación del objeto caja1

        System.out.println("Ingrese el ancho de la caja: ");
        caja1.ancho = sc.nextInt();

        System.out.println("Ingrese el alto de la caja: ");
        caja1.alto = sc.nextInt();

        System.out.println("Ingrese la profundidad de la caja: ");
        caja1.profundidad = sc.nextInt();

        System.out.println("El volumen de la caja es: " + caja1.volumen());

        //JOptionPane
        caja1.ancho = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ancho de la caja: "));
        caja1.alto = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el alto de la caja: "));
        caja1.profundidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la profundidad de la caja: "));
        JOptionPane.showMessageDialog(null, "El volumen de la caja es: " + caja1.volumen());

    }
}
