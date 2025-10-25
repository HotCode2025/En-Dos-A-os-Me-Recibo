
package test;

public class TestArreglos {
    public static void main(String[] args) { // lado derecho instanciamos un objeto de tipo object
        int edades[] = new int [3]; //Lado izq. definimos la variable
        System.out.println("edades = " + edades);
        
        edades[0] = 17;
        System.out.println("edades 0 = " + edades [0]);
        edades [1] = 22;
        System.out.println("edades 1 = " + edades[1]);
        edades [2] = 18;
        System.out.println("edades 2 = " + edades[2]);
        
       // edades [3] = 20; // error en tiempo de ejecución
       
       for (int i = 0; i < edades.length; i++){
           System.out.println("Edades y sus elementos: "+i+": "+edades[i]);
       }
           
    }
}
