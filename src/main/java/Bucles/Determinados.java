package Bucles;

/*
Bucle determinado: el bucle se repetirá un número concreto de veces
    - estructura del iterador (i): comienzo/condición/incremento
    - for: se repite tantas veces como queramos
    - for each: forma simplificada de recorrer una lista con un for
 */

public class Determinados {
    public static void main(String args[]){
        //for
        for (int i = 0; i < 5; i++){
            System.out.println("Jaime");
        }

        //for each
        String[] nombres = new String[] {"Pepe", "Antonio", "Mariano"};
        for (String i: nombres){
            System.out.println(i);
        }
    }
}
