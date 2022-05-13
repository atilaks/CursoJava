package Condicionales;

/*

 */

import java.util.Scanner;

public class If {
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Edad?: ");
        int edad = entrada.nextInt();

        if (edad > 18){
            System.out.println("Puedes pasar");
        } else if (edad == 18) {
            System.out.println("De que mes?:");
        } else {
            System.out.println("No puedes pasar");
        }
    }
}
