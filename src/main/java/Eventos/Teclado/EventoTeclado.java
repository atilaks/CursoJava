package Eventos.Teclado;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

class EventoTeclado implements KeyListener {
    public void keyTyped(KeyEvent e) {
        char letra = e.getKeyChar();
        System.out.println(letra);
    }

    public void keyPressed(KeyEvent e) {
        int codigo = e.getKeyCode();
        System.out.println(codigo);
    }

    public void keyReleased(KeyEvent e) {
        System.out.println("has apretado una tecla");
    }
}
