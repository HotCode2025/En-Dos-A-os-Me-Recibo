import java.util.Scanner;

public class AdivinarNumero {

    // ATRIBUTOS:
    private int ValorInicio; // rango inferior
    private int ValorFinal;  // rango superior
    private int NumOculto;
    private int intentos;

    // Constructor:
    public AdivinarNumero(int inicio, int fin) {
        this.ValorInicio = inicio;
        this.ValorFinal = fin;
        this.intentos = 0;
        generarNumeroOculto();
    }

    // Método para generar el número oculto
    private void generarNumeroOculto() {
        NumOculto = (int) (Math.random() * (ValorFinal - ValorInicio + 1)) + ValorInicio;
    }

    // Menú principal
    public void menu() {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n¡¡¡ADIVINA EL NÚMERO!!!");
            System.out.println("1. Jugar");
            System.out.println("2. Cambiar rango (actual: " + ValorInicio + " - " + ValorFinal + ")");
            System.out.println("3. Volver al menú principal");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    jugar();
                    break;
                case 2:
                    System.out.print("Nuevo valor inicial: ");
                    ValorInicio = sc.nextInt();
                    System.out.print("Nuevo valor final: ");
                    ValorFinal = sc.nextInt();
                    generarNumeroOculto();
                    System.out.println("¡Nuevo rango establecido!");
                    break;
                case 3:
                    System.out.println("Volviendo al menú principal...");
                    break;
                default:
                    System.out.println("Opción inválida");
            }
        } while (opcion != 3);
    }

    // Método para jugar
    private void jugar() {
        Scanner sc = new Scanner(System.in);
        int numUsuario;
        String bandera;
        int intentosSalir = 0;
        intentos = 0;

        
        generarNumeroOculto();

        System.out.println("\nSe generó un nuevo número oculto. ¡Buena suerte!");

        do {
            // Reiniciamos la bandera en cada ronda
            bandera = "S";

            // Validación de rango
            do {
                System.out.print("Ingresa un número entre " + ValorInicio + " y " + ValorFinal + ": ");
                numUsuario = sc.nextInt();

                if (numUsuario < ValorInicio || numUsuario > ValorFinal) {
                    System.out.println("⚠️ El número está fuera del rango.");
                }
            } while (numUsuario < ValorInicio || numUsuario > ValorFinal);

            intentos++;
            intentosSalir++;

            // Comparación
            if (numUsuario > NumOculto) {
                System.out.println("🔻 El número secreto es menor.");
            } else if (numUsuario < NumOculto) {
                System.out.println("🔺 El número secreto es mayor.");
            }

            // Cada 3 intentos pregunta si seguir
            if (intentosSalir == 3 && numUsuario != NumOculto) {
                System.out.print("¿Querés seguir jugando? (S/N): ");
                bandera = sc.next().toUpperCase();
                intentosSalir = 0;
            }

            // Si acierta, sale del bucle
            if (numUsuario == NumOculto) break;

        } while (bandera.equals("S"));

        // Resultado final
        if (numUsuario == NumOculto) {
            System.out.println("¡Adivinaste el número en " + intentos + " intentos!");
        } else {
            System.out.println("El número era " + NumOculto);
        }

        System.out.println("Fin de la partida.\n");
    }
}
