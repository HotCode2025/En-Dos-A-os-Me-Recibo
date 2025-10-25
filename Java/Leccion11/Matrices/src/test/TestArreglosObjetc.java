
package test;

import domain.Persona;


public class TestArreglosObjetc {
    public static void main(String[] args) {
        Persona personas [] = new Persona[2];
        
        personas[0] = new Persona("Tomas");
        personas[1] = new Persona("Lauti");
        System.out.println("personas 0 = " + personas [0]);
        System.out.println("personas 1 = " + personas [1]);
        
        System.out.println("-------------------------------------");
        
        for (int i = 0; i< personas.length; i++){
            System.out.println("personas  "+i+" = "+personas[i]);
        }
        //sintaxis resumida
        String frutas[] = {"bananas","pera","durazno"};
        for (int i = 0; i < frutas.length; i++) {
            System.out.println("frutas "+i+" = " + frutas[i]);
        }
    }
}
