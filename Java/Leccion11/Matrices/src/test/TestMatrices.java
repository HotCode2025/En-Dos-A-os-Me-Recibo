package test;

import domain.Persona;

public class TestMatrices {

    public static void main(String[] args) {
        int edades[][] = new int[3][2]; // ASI SE DEFINE UNA MATRIZ
        System.out.println("edades = " + edades);
        edades[0][0] = 5; //Llenado manual
        edades[0][1] = 7; // LLena una diferente columna

        edades[1][0] = 8;
        edades[1][1] = 4;

        edades[2][0] = 2;
        edades[2][1] = 9;

        System.out.println(" 0-0 = " + edades[0][0]);
        System.out.println(" 0-1 = " + edades[0][1]);

        System.out.println(" 1-0 = " + edades[1][0]);
        System.out.println(" 1-1 = " + edades[1][1]);
        System.out.println(" 2-0 = " + edades[2][0]);
        System.out.println(" 2-1 = " + edades[2][1]);

        System.out.println("Recorremos la matriz a travéz del ciclo for");
        for (int fila = 0; fila < edades.length; fila++) {
            for (int col = 0; col < edades[fila].length; col++) {
                System.out.println("edades " + fila + "-" + col + ": " + edades[fila][col]);
            }

        }
        //Sintaxix clasica
        //String frutas[][] = new String [3][2]; 

        //Sintaxix simplicada
        String frutas[][] = {{"limon", "pomelo"}, {"kiwi", "Ciruela"}, {"banana", "manzana"}};
        imprimir(frutas);

//        System.out.println("Recorremos la matriz simplificada a travéz del ciclo for");
//        for (int i = 0; i < frutas.length; i++) {
//            for (int j = 0; j < frutas[i].length; j++) {
//                System.out.println("frutas "+i+"-"+j+": "+frutas[i][j]);
//            }
//            
//        }
        //Creamos una matriz de objetos
        Persona personas[][] = new Persona[2][3];
        //Asignamos valores a la matriz
        personas[0][0] = new Persona("Tomas");
        personas[0][1] = new Persona("Osvaldo");
        personas[0][2] = new Persona("Ariel");

        personas[1][0] = new Persona("Juan");
        personas[1][1] = new Persona("Pedro");
        personas[1][2] = new Persona("Messi");
        
        imprimir (personas);
    }
    //Metodo para imprimir matrices
    public static void imprimir(Object matriz[][]) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("matriz " + i + "-" + j + ": " + matriz[i][j]);
            }

        }
    }
}
