import javax.swing.JOptionPane;

public class Leccion02 {
    public static void main(String[] args) {
        // while(true) {
        //     String input = JOptionPane.showInputDialog("Ingrese un número:");
        //     int numero = Integer.parseInt(input);
        //     int doble = numero * 2;
        //     JOptionPane.showMessageDialog(null, "El doble de " + numero + " es: " + doble);
        // }

        int numero;
        do {
            String input = JOptionPane.showInputDialog("Ingrese un número:");
            numero = Integer.parseInt(input);
            if(numero > 0) {
                JOptionPane.showMessageDialog(null, "El número " + numero + " es: positivo");
            }
            else if (numero < 0) {
                JOptionPane.showMessageDialog(null, "El número " + numero + " es: negativo");
            }
        } while (numero != 0);
        JOptionPane.showMessageDialog(null, "El número es cero, finalizando el programa.");
    }
}