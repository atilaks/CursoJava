package InterfacesGraficas;

/*
    - JPanel: Clase encargada de construir láminas
        + La clase con la lámina tiene que heredar de esta
        + paintComponent: Método para dibujar encima de la lámina
 */

import javax.swing.*;
import java.awt.*;

public class Laminas {
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
        MiLamina mi_panel = new MiLamina();
        add(mi_panel);
    }
}

class MiLamina extends JPanel {
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawString("Aprendiendo Swing", 100, 100);
    }
}