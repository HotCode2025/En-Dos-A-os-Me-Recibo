package ciclowhile;

public class EjercicioWhile01 {
    public static void main(String[] args) {
    var conteo = 0; //inferencia de tipos
    while (conteo < 3){
            System.out.println("conteo = " + conteo);
            conteo++; //vamos aumentando en uno la variable
    }
}
}