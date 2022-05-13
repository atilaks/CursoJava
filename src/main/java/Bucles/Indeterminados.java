package Bucles;

/*
Bucle indeterminado: no sabes cuantas veces se repetirá el bucle
    - while: mientras la condición sigua dándose, se repetirá
    - do while: hace una acción previa al bucle
 */

import javax.swing.*;
import java.util.Scanner;

public class Indeterminados {
    public static void main(String args[]){
        //wile
        int aleatorio = (int)(Math.random()*100);
        Scanner entrada = new Scanner(System.in);
        int numero = 0;
        while (numero != aleatorio){
            System.out.println("Introduce un numero: ");
            numero = entrada.nextInt();
            if(aleatorio < numero){
                System.out.println("Es más bajo");
            } else if (aleatorio > numero){
                System.out.println("Es más alto");
            }
        }
        System.out.println("Correcto");

        //do wile
        String genero = "";
        do{
            genero = JOptionPane.showInputDialog("Introduce tu género (H/M)");
        } while (!genero.equalsIgnoreCase("H") && !genero.equalsIgnoreCase("M"));
        int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce altura en cm"));
        int peso_ideal = 0;
        if (genero.equalsIgnoreCase("H")){
            peso_ideal = altura - 110;
        } else if (genero.equalsIgnoreCase("M")) {
            peso_ideal = altura - 120;
        }
        System.out.println("Tu peso ideal es " + peso_ideal);
    }
}
