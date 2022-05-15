package Clases;

/*
    - Para almacenar en una variable valores, no modificable ni ampliable
    - La variable enum tiene que declararse fuera del main
    - Admite parámetros de una clase genérica
    - Permiten la formación y uso de constructores, getters y setters
    - No permiten la creación de objetos (por eso el constructor es private)
    - valueOf: Devuelve el nombre de la constante enumerada
 */

import java.util.Scanner;

public class Enum_ {
    enum Talla {
        PEQUEÑA("S"), MEDIANA("M"), GRANDE("L");

        private String abreviatura;

        private Talla(String abreviatura) {
            this.abreviatura = abreviatura;
        }

        public String getAbreviatura(){
            return abreviatura;
        }
    }

    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escribe tu talla (PEQUEÑA, MEDIANA O GRANDE): ");
        String entrada_datos = entrada.next().toUpperCase();
        Talla la_talla = Enum.valueOf(Talla.class, entrada_datos);
        System.out.println("Talla = " + la_talla);
        System.out.println("Abreviatura = " + la_talla.getAbreviatura());
    }
}
