package caja;

public class Caja {
    //Atributos de la Clase
    int ancho, alto, profundidad;

    //constructores
    public Caja() {
        System.out.println("Ejecutando constructor vacío");
    }
    public Caja(int ancho, int alto, int profundidad) {
        this.ancho = ancho;
        this.alto = alto;
        this.profundidad = profundidad;
    }
    //Métodos de la Clase
    public int volumen() { //Método con retorno porque devuelve un valor
        int resultado = ancho * alto * profundidad;
        return resultado;
    }
}
