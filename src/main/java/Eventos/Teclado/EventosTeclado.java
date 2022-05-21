package Eventos.Teclado;

/*
    - KeyListener:
        + keyPressed: Al presionar una tecla
        + keyReleased: Después de que dejemos de presionar la tecla
        + keyTyped: Después de que la tecla haya sido presionada y levantada
 */

import javax.swing.*;

public class EventosTeclado {
    public static void main(String args[]) {
        MarcoConTeclas mi_marco = new MarcoConTeclas();
        mi_marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
