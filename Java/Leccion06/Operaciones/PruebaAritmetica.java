package Operaciones;

public class PruebaAritmetica {
    public static void main(String[] args) {
        //Variables Locales
        var a = 10; //Memoria stack -> es para las variables locales y solo almacena la referencia del objeto
        int b = 7;
        miMetodo(); // Llamada al método miMetodo

        Aritmetica aritmetica1 = new Aritmetica(); // Instancia de la clase Aritmetica y creación del objeto aritmetica1
        aritmetica1.a = 3; 
        aritmetica1.b = 7;
        aritmetica1.sumarNum(); // Llamada al método sumarNum 
        //Para almacenar un objeto o los atributos se utiliza la memoria heap

        int resultado = aritmetica1.sumarConRetorno(); // Llamada al método sumarConRetorno y asignación del valor a la variable resultado
        System.out.println("El resultado usando retorno es: " + resultado);

        resultado = aritmetica1.sumaConArgs(12, 26); // Llamada al método sumaConArgs y asignación del valor a la variable resultado
        System.out.println("El resultado usando argumentos es: " + resultado);

        System.out.println("Aritmetica1: a: " + aritmetica1.a);
        System.out.println("Aritmetica1: b: " + aritmetica1.b);

        Aritmetica aritmetica2 = new Aritmetica(5, 8); // Instancia de la clase Aritmetica y creación del objeto aritmetica2
        System.out.println("Aritmetica2: a: " + aritmetica2.a);
        System.out.println("Aritmetica2: b: " + aritmetica2.b);
        // aritmetica1 = null; //Se elimina la referencia al objeto aritmetica1, nunca utilizar esto
        // System.gc(); //garbage collector, recolector de basura, no utilizarlo
    }

    public static void miMetodo() {
        //a = 10; //Una variable esta limitada
        System.out.println("Aquí hay otro método");
    }
}
