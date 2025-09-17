package Clase05;

public class PruebaAritmetica {
    public static void main(String[] args) {
        Ejercicio05Aritmetica aritmetica1 = new Ejercicio05Aritmetica();
        aritmetica1.a = 3; 
        aritmetica1.b = 7;
        aritmetica1.sumarNumeros();
        int resultado = aritmetica1.sumarConRetorno();
        System.out.println("resultado = " + resultado);
        resultado = aritmetica1.sumarConArgumentos(12,26);
        System.out.println("Resultado usando argumentos = " + resultado);
    }
}
