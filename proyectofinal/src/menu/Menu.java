
import conversordeunidades.ConversorDeUnidades;
import java.util.Scanner;
import sistemaventas.SistemaVentas;
import calculadora.calculadora;
import gestornotas.GestorDeNotas;

public class Menu {

    public static void main(String[] args) {
        SistemaVentas sistemaVenta = new SistemaVentas();
        ConversorDeUnidades conversorDeUnidades = new ConversorDeUnidades();

        int opcion = 0;
        Scanner entrada = new Scanner(System.in);

        while (opcion != 6) {
            System.out.println("");
            System.out.println("\nMenu Principal\n");
            System.out.println("1. Calculadora");
            System.out.println("2. Gestor de notas");
            System.out.println("3. Adivina el numero");
            System.out.println("4. Sistema de ventas");
            System.out.println("5. Conversor de unidades");
            System.out.println("6. Salir");
            System.out.println("");
            System.out.println("Digite la opcion deseada: ");
            opcion = entrada.nextInt();
            switch (opcion) {
                case 1:
                    calculadora c = new calculadora();
                    c.iniciarCalculadora();
                    System.out.println("Calculadora");
                    break;
                case 2:
                    /*GestorNotas g = new GestorNotas();
               g.gestor();*/
                    GestorDeNotas g = new GestorDeNotas();
                    g.iniciar();
                    System.out.println("Gestor de notas");
                    break;
                case 3:
                    //Crea una instancia del juego con un rango inicial (por ejemplo del 1 al 10)
                    AdivinarNumero juego = new AdivinarNumero(1, 10);

                    //Llama al menú del juego
                    juego.menu();
                    System.out.println("Adivina el numero");
                    break;
                case 4:
                    //Sistema de ventas
                    sistemaVenta.iniciarSistemaVenta();
                    break;
                case 5:
                    //Conversor de unidades
                    conversorDeUnidades.iniciarConversorUnidades();
                    break;
                case 6:
                    /*System.exit(0);*/
                    System.out.println("Saliendo");
                    break;
                default:
                    System.out.println("Opcion incorrecta");
                    break;
            }
           
        }
    }

}
