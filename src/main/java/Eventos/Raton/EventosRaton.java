package Eventos.Raton;

/*
    - MouseListener:
        + mouseClicked: Después de que se haya presionado y levantado el botón
        + mouseEntered: Después de que el ratón entre al elemento
        + mouseExited: Después de que el ratón salga del elemento
        + mousePressed: Después de presionar el botón
        + mouseReleased: Después de levantar el botón
 */

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class EventosRaton {
    public static void main(String args[]) {
        MarcoRaton mi_marco = new MarcoRaton();
        mi_marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoRaton extends JFrame {
    public MarcoRaton() {
        setVisible(true);
        setBounds(300, 300, 500, 350);
        EventoRaton evento_raton = new EventoRaton();
        addMouseListener(evento_raton);
    }
}

class EventoRaton implements MouseListener {
    public void mouseClicked(MouseEvent e) {
        System.out.println("Has hecho clic");
    }
    public void mousePressed(MouseEvent e) {
        System.out.println("Acabas de presionar");
    }
    public void mouseReleased(MouseEvent e) {
        System.out.println("Acabas de levantar");
    }
    public void mouseEntered(MouseEvent e) {
        System.out.println("Acabas de entrar");
    }
    public void mouseExited(MouseEvent e) {
        System.out.println("Acabas de salir");
    }
}