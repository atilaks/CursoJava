package InterfacesGraficas;

/*
    - JPanel: Clase encargada de construir panales
        + La clase con el panel tiene que heredar de esta
        + paintComponent: Método para dibujar encima del panel
 */

import javax.swing.*;
import java.awt.*;

public class Paneles {
    public static void main(String args[]){
        MarcoConTexto mi_marco = new MarcoConTexto();
        mi_marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoConTexto extends JFrame {
    public MarcoConTexto(){
        setVisible(true);
        setSize(600, 450);
        setLocation(700, 400);
        setTitle("Primer texto");
        Panel mi_panel = new Panel();
        add(mi_panel);
    }
}

class Panel extends JPanel {
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawString("Aprendiendo Swing", 100, 100);
    }
}