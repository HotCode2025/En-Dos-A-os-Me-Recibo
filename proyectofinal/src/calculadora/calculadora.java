package calculadora;

import java.util.Scanner;
import java.util.Locale;
import java.text.NumberFormat;

public class calculadora {

    public void iniciarCalculadora() {
        boolean otraOperacion = true;
    Scanner entrada = new Scanner(System.in);
    NumberFormat nf = NumberFormat.getInstance(new Locale("es", "ES"));
        int opcion = 0;
        boolean salida = false;
        while (!salida) {
            otraOperacion = true;
            System.out.println("");
            System.out.println("\nCalculadora\n");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicacion");
            System.out.println("4. Division");
            System.out.println("5. Raiz cuadrada");
            System.out.println("6. Exponencial");
            System.out.println("7. Factorial");
            System.out.println("8. Salir");
            System.out.println("");
            System.out.println("Digite la opcion deseada: ");
            opcion = entrada.nextInt();
            switch (opcion) {
                case 1:

                    while (otraOperacion == true) {
                        System.out.println("Suma:");
                        System.out.println("");
                        System.out.println("Ingrese el primer numero: ");
                        double num1 = entrada.nextDouble();
                        System.out.println("Ingrese el segundo numero: ");
                        double num2 = entrada.nextDouble();
                        double resultado = num1 + num2;
                        System.out.println("El resultado de la suma es: " + nf.format(resultado));
                        System.out.println("");
                        System.out.println("Desea realizar otra operacion? (S/N)");
                        String opcioString = entrada.next();
                        if (opcioString.equals("N") || opcioString.equals("n")) {
                            otraOperacion = false;
                        } else {
                            if (opcioString.equals("S") || opcioString.equals("s")) {
                                otraOperacion = true;                            
                            } else {
                                System.out.println("Opcion no valida, se cerrara la operacion.");
                                otraOperacion = false;
                            }
                        }
                    }
            
                    break;
                case 2:

                    while (otraOperacion == true) {
                        System.out.println("Resta:");
                        System.out.println("");
                        System.out.println("Ingrese el primer numero: ");
                        double num1 = entrada.nextDouble();
                        System.out.println("Ingrese el segundo numero: ");
                        double num2 = entrada.nextDouble();
                        double resultado = num1 - num2;
                        System.out.println("El resultado de la resta es: " + nf.format(resultado));
                        System.out.println("");
                        System.out.println("Desea realizar otra operacion? (S/N)");
                        String opcioString = entrada.next();
                        if (opcioString.equals("N") || opcioString.equals("n")) {
                            otraOperacion = false;
                        } else {
                            if (opcioString.equals("S") || opcioString.equals("s")) {
                                otraOperacion = true;                            
                            } else {
                                System.out.println("Opcion no valida, se cerrara la operacion.");
                                otraOperacion = false;
                            }
                        }
                    }
                    break;
                case 3:
                 
                    while (otraOperacion == true) {
                        System.out.println("Multiplicacion:");
                        System.out.println("");
                        System.out.println("Ingrese el primer numero: ");
                        double num1 = entrada.nextDouble();
                        System.out.println("Ingrese el segundo numero: ");
                        double num2 = entrada.nextDouble();
                        double resultado = num1 * num2;
                        System.out.println("El resultado de la multiplicacion es: " + nf.format(resultado));
                        System.out.println("");
                        System.out.println("Desea realizar otra operacion? (S/N)");
                        String opcioString = entrada.next();
                        if (opcioString.equals("N") || opcioString.equals("n")) {
                            otraOperacion = false;
                        } else {
                            if (opcioString.equals("S") || opcioString.equals("s")) {
                                otraOperacion = true;
                            } else {
                                System.out.println("Opcion no valida, se cerrara la operacion.");
                                otraOperacion = false;
                            }
                        }
                    }
                    break;
                case 4:
                    
                    while (otraOperacion == true) {
                        System.out.println("Division:");
                        System.out.println("");
                        System.out.println("Ingrese el dividendo: ");
                        double num1 = entrada.nextDouble();
                        System.out.println("Ingrese el divisor: ");
                        double num2 = entrada.nextDouble();
                        double resultado = num1 / num2;
                        System.out.println("El resultado de la division es: " + nf.format(resultado));
                        System.out.println("");
                        System.out.println("Desea realizar otra operacion? (S/N)");
                        String opcioString = entrada.next();
                        if (opcioString.equals("N") || opcioString.equals("n")) {
                            otraOperacion = false;
                        } else {
                            if (opcioString.equals("S") || opcioString.equals("s")) {
                                otraOperacion = true;
                            } else {
                                System.out.println("Opcion no valida, se cerrara la operacion.");
                                otraOperacion = false;
                            }
                        }
                    }
                    break;
                case 5:
                    while (otraOperacion == true) {
                        System.out.println("Raiz cuadrada:");
                        System.out.println("");
                        System.out.println("Ingrese el numero: ");
                        double num1 = entrada.nextDouble();
                        double resultado = Math.sqrt(num1);
                        System.out.println("El resultado de la raiz cuadrada es: " + nf.format(resultado));
                        System.out.println("");
                        System.out.println("Desea realizar otra operacion? (S/N)");
                        String opcioString = entrada.next();
                        if (opcioString.equals("N") || opcioString.equals("n")) {
                            otraOperacion = false;
                        } else {
                            if (opcioString.equals("S") || opcioString.equals("s")) {
                                otraOperacion = true;
                            } else {
                                System.out.println("Opcion no valida, se cerrara la operacion.");
                                otraOperacion = false;
                            }
                        }
                    }
                    break;
                case 6:
                    while (otraOperacion == true) {
                        System.out.println("Exponencial:");
                        System.out.println("");
                        System.out.println("Ingrese la base: ");
                        double base = entrada.nextDouble();
                        System.out.println("Ingrese el exponente: ");
                        double exponente = entrada.nextDouble();
                        double resultado = Math.pow(base, exponente);
                        System.out.println("El resultado de la exponencial es: " + nf.format(resultado));
                        System.out.println("");
                        System.out.println("Desea realizar otra operacion? (S/N)");
                        String opcioString = entrada.next();
                        if (opcioString.equals("N") || opcioString.equals("n")) {
                            otraOperacion = false;
                        } else {
                            if (opcioString.equals("S") || opcioString.equals("s")) {
                                otraOperacion = true;                            
                            } else {
                                System.out.println("Opcion no valida, se cerrara la operacion.");
                                otraOperacion = false;
                            }
                        }
                    }
                    break;

                case 7:
                    while (otraOperacion == true) {
                        System.out.println("Factorial:");
                        System.out.println("");
                        System.out.println("Ingrese el numero: ");
                        int num1 = entrada.nextInt();
                        int resultado = 1;
                        for (int i = 1; i <= num1; i++) {
                            resultado *= i;
                        }
                        System.out.println("El resultado del factorial es: " + resultado);
                        System.out.println("");
                        System.out.println("Desea realizar otra operacion? (S/N)");
                        String opcioString = entrada.next();
                        if (opcioString.equals("N") || opcioString.equals("n")) {
                            otraOperacion = false;
                        } else {
                            if (opcioString.equals("S") || opcioString.equals("s")) {
                                otraOperacion = true;                            
                            } else {
                                System.out.println("Opcion no valida, se cerrara la operacion.");
                                otraOperacion = false;
                            }
                        }
                    }
                    break;
                case 8:
                    System.out.println("Saliendo de la calculadora.");
                    salida = true;
                    break;
            }

        }
    }
}

