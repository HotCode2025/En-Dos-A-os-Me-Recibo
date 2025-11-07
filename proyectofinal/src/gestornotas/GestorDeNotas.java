package gestornotas;

import java.util.ArrayList;
import java.util.Scanner;

public class GestorDeNotas {

    private static final Scanner sc = new Scanner(System.in);
    private static final int MAX_ALUMNOS = 99;
    private static final ArrayList<Alumno> alumnos = new ArrayList<>();

    public static void iniciar() {
        alumnos.clear();
        gestorDeNotas();
    }

    private static void gestorDeNotas() {
        int contador = 0;
        String continuar;

        do {
            System.out.println("=== INGRESO DE ALUMNO " + (contador + 1) + " ===");
            System.out.println();

            String nombre = ingresarNombre();
            double nota1 = ingresarNota("Nota 1 (0-10): ");
            double nota2 = ingresarNota("Nota 2 (0-10): ");
            double nota3 = ingresarNota("Nota 3 (0-10): ");

            double promedio = (nota1 + nota2 + nota3) / 3.0;
            String condicion = (promedio >= 6) ? "Aprobado" : "Desaprobado";

            System.out.println();
            System.out.println("Nombre: " + nombre);
            System.out.println("Nota 1: " + nota1);
            System.out.println("Nota 2: " + nota2);
            System.out.println("Nota 3: " + nota3);
            System.out.println("Promedio: " + promedio);
            System.out.println("Condición: " + condicion);
            System.out.println();

            alumnos.add(new Alumno(nombre, nota1, nota2, nota3, promedio, condicion));
            contador++;

            if (contador < MAX_ALUMNOS) {
                continuar = preguntarContinuar();
            } else {
                continuar = "N";
                System.out.println("Límite de alumnos alcanzado.");
            }

        } while (contador < MAX_ALUMNOS && continuar.equalsIgnoreCase("S"));

        mostrarReporteFinal();
    }

    private static String ingresarNombre() {
        String nombre;
        do {
            System.out.print("Nombre del alumno: ");
            nombre = sc.nextLine().trim();
            if (nombre.isEmpty()) {
                System.out.println("El nombre no puede estar vacío.");
            }
        } while (nombre.isEmpty());
        return nombre;
    }

    private static double ingresarNota(String mensaje) {
        double nota;
        do {
            System.out.print(mensaje);
            while (!sc.hasNextDouble()) {
                System.out.println("Error: ingrese un número.");
                sc.next();
                System.out.print(mensaje);
            }
            nota = sc.nextDouble();
            sc.nextLine();
            if (nota < 0 || nota > 10) {
                System.out.println("Error: la nota debe estar entre 0 y 10.");
            }
        } while (nota < 0 || nota > 10);
        return nota;
    }

    private static String preguntarContinuar() {
        String respuesta;
        do {
            System.out.print("\n¿Ingresar otro alumno? (S/N): ");
            respuesta = sc.nextLine().trim().toUpperCase();
            if (!respuesta.equals("S") && !respuesta.equals("N")) {
                System.out.println("Por favor, ingrese S o N.");
            }
        } while (!respuesta.equals("S") && !respuesta.equals("N"));
        return respuesta;
    }

    private static void mostrarReporteFinal() {
        System.out.println("\n===================================");
        System.out.println("        REPORTE FINAL");
        System.out.println("===================================\n");

        if (alumnos.isEmpty()) {
            System.out.println("No se ingresaron alumnos.");
        } else {
            System.out.println("Nombre          | N1  | N2  | N3  | Promedio | Condición");
            System.out.println("-------------------------------------------------------------");
            for (Alumno a : alumnos) {
                System.out.println(a.nombre + " ".repeat(15 - a.nombre.length()) +
                        "| " + a.nota1 + " | " + a.nota2 + " | " + a.nota3 +
                        " | " + a.promedio + "    | " + a.condicion);
            }
            System.out.println("\nTotal de alumnos: " + alumnos.size());
        }

        System.out.println("\nPresione ENTER para volver al menú...");
        sc.nextLine();
    }

    private static class Alumno {
        String nombre, condicion;
        double nota1, nota2, nota3, promedio;

        Alumno(String nombre, double n1, double n2, double n3, double prom, String cond) {
            this.nombre = nombre;
            this.nota1 = n1;
            this.nota2 = n2;
            this.nota3 = n3;
            this.promedio = prom;
            this.condicion = cond;
        }
    }
}

