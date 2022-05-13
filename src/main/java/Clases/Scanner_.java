package Clases;

/*
La clase Scanner sirve para pedir información por pantalla
    - new java.util.Scanner(System.in): declara el objeto de tipo Scanner
    - nextLine(): pide un string
    - nextInt(): pide un número
 */

import java.util.Scanner;

public class Scanner_ {
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce tu nombre");

        String nombre_usuario = entrada.nextLine();
        System.out.println("Introduce tu edad");

        int edad = entrada.nextInt();
        System.out.println("Hola " + nombre_usuario + " tienes " + edad + "años.");
    }
}
