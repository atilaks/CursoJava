package Clases;

/*
    - sort: Ordena un array del tipo indicado
        + compareTo: Compara los objetos del tipo indicado
 */

import Interfaces.SubClase;

import java.util.Arrays;

public class Array_ {
    public static void main(String args[]) {
        SubClase[] Trabajadores = new SubClase[3];
        Trabajadores[0] = new SubClase("RRHH", 1500, "Base");
        Trabajadores[1] = new SubClase("Administración", 1400, "Base");
        Trabajadores[2] = new SubClase("Gerencia", 1800, "Director");

        Arrays.sort(Trabajadores);

        for (SubClase trabajador : Trabajadores) {
            System.out.println("En " + trabajador.getDepartamento()
                    + " , con un rango de " + trabajador.getRango()
                    + " . Se cobra: " + trabajador.getSalario());
        }
    }
}
