package Eventos.Raton;

/*
    - MouseEvent: Clase adaptadora de MouseListener
        + getX: Posición X donde se encuentra el ratón
        + getY: Posición Y donde se encuentra el ratón
        + getModifiersEx: Para saber que botón del ratón se ha presionado
        + getClickCount: Para saber cuantos clics ha hecho
 */

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class EventosRatonAdaptador {
    public static void main(String args[]) {
        MarcoRatonAdaptador mi_marco = new MarcoRatonAdaptador();
        mi_marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoRatonAdaptador extends JFrame {
    public MarcoRatonAdaptador() {
        setVisible(true);
        setBounds(300, 300, 500, 350);
        EventoRatonAdaptador evento_raton = new EventoRatonAdaptador();
        addMouseListener(evento_raton);
        addMouseMotionListener(evento_raton);
    }
}

class EventoRatonAdaptador extends MouseAdapter {
    public void mouseClicked(MouseEvent e) {
        System.out.println("Coordenada X = " + e.getX() + " y coordenada Y = " + e.getY());
        System.out.println("Has hecho " + e.getClickCount() + " clics");
    }

    public void mousePressed(MouseEvent e) {
        System.out.println(e.getModifiersEx());
    }
    public void mouseDragged(MouseEvent e){
        System.out.println("Estás arrastrando");
    }
    public void mouseMoved(MouseEvent e){
        System.out.println("Estás moviendo");
    }
}
