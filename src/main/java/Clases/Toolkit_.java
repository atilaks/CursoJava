package Clases;

/*
    - Sirve para acceder a partes del sistema
    - Métodos:
        + beep: sonido de alerta del sistema
 */

import java.awt.Toolkit;

public class Toolkit_ {
    public static void main(String args[]) {
        System.out.println("Hola");
        Toolkit.getDefaultToolkit().beep();
    }
}
