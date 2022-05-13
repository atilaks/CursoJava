package Condicionales;

import java.util.Scanner;

public class Switch {
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Edad?: ");
        int edad = entrada.nextInt();

        switch (edad){
            case 18:
                System.out.println("Joven");
                break;
            case 35:
                System.out.println("Adulto");
                break;
            case 65:
                System.out.println("Mayor");
                break;
        }
    }
}
