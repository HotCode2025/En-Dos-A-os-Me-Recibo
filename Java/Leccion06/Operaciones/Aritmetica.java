package Operaciones;

public class Aritmetica {
    // Atributos de la Clase 
    int a;
    int b;

    //Contructor (método especial) - Cumple 3 Objetivos: Contruye un Objeto, reserva un espacio de memoria, inicializa los atributos de la clase
    //Estamos viendo lo que se llama sobrecarga de constructores

    public Aritmetica() { //Constructor 1 vacío
        System.out.println("Ejecutando constructor 1");
    }
    public Aritmetica(int a, int b) { //Constructor 2
        this.a = a;
        this.b = b;
        System.out.println("Ejecutando constructor 2");
    }

    // Métodos de la Clase
    public void sumarNum() { // Método void porque no devuelve nada
        int resultado = a + b;
        System.out.println("El resultado de la suma es: " + resultado);
    }
    
    public int sumarConRetorno() { // Método con retorno porque devuelve un valor
        int resultado = this.a + this.b;
        return resultado;
    }

    public int sumaConArgs(int a, int b) { // Método con argumentos - This permite acceder a los atributos de la clase
        this.a = a; //el argumento a se adigna al atributo this.a
        this.b = b; //el argumento b se adigna al atributo this.b
        // return a + b;
        return sumarConRetorno();
    }
}
