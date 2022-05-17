package InterfacesGraficas;

/*
    - Graphics2D: Actúa sobre las láminas
        + setPaint: Establecer color
            * brighter: Otorga brillo
            * darker: Otorga oscuridad
    - JPanel: Actúa sobre el marco
        + setBackground: Establece color de fondo en la lámina
        + setForeground: Establece color del borde de los dibujos en la lámina
 */

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

public class ColorEnLamina {
    public static void main(String args[]){
        MarcoConDibujosColoreados mi_marco = new MarcoConDibujosColoreados();
        mi_marco.setVisible(true);
        mi_marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoConDibujosColoreados extends JFrame {
    public MarcoConDibujosColoreados(){
        setTitle("Prueba de colores");
        setSize(400, 400);
        LaminaConColor mi_lamina = new LaminaConColor();
        add(mi_lamina);
        mi_lamina.setBackground(SystemColor.window); // SystemColor.window: color por defecto de windows
    }
}

class LaminaConColor extends JPanel {
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

        Rectangle2D rectangulo = new Rectangle2D.Double(100, 100, 200, 150);
        g2.setPaint(Color.CYAN);
        g2.fill(rectangulo);
        g2.draw(rectangulo);

        Ellipse2D elipse = new Ellipse2D.Double();
        elipse.setFrame(rectangulo);
        g2.setPaint(new Color(0, 140, 255).darker());
        g2.fill(elipse);
        g2.draw(elipse);
    }
}