package Clases;

/*
    - Sirve para acceder a partes del sistema
    - Métodos:
        + beep: Sonido de alerta del sistema
        + getScreenSize: Devuelve las dimensiones de la pantalla
 */

import java.awt.Toolkit;

public class Toolkit_ {
    public static void main(String args[]) {
        System.out.println("Hola");
        Toolkit.getDefaultToolkit().beep();
    }
}
