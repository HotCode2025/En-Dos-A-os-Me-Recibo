package Clase05;

public class Ejercicio05Aritmetica {
    //atributos de la clase

    int a;
    int b;

    //Métodos 
    public void sumarNumeros() {
        int resultado = a + b;
        System.out.println("resultado = " + resultado);
    }
    //método con retorno
    public int sumarConRetorno() {
        // Int resultado = a + b;
        return a + b;
    }
    //método con argumentos y retorno
    public int sumarConArgumentos(int arg1, int arg2){
        a = arg1; 
        b = arg2; 
        return a + b; 
    }
}
