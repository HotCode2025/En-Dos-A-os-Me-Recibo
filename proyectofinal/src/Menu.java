
import conversordeunidades.ConversorDeUnidades;
import java.util.Scanner;
import sistemaventas.SistemaVentas;


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
               /*Calculadora c = new Calculadora();
               c.calculadora();*/
               System.out.println("Calculadora");
               break;
           case 2:
               /*GestorNotas g = new GestorNotas();
               g.gestor();*/
               System.out.println("Gestor de notas");
               break;
           case 3:
               /*Adivina n = new Adivina();
               n.adivina();*/
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
            entrada.close();
        }
    }
    
}
