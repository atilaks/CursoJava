package InterfacesGraficas;

/*
    - Graphics: Clase para hacer dibujos sencillos en láminas
        + drawRect: Rectángulos
        + drawLine: Lineas
        + drawArc: Arcos
    - Java2D: Es una biblioteca más actual, que permite más complejidad
        + Rectangle2D: Rectángulos
        + Ellipse2D: Círculos
        + Line2D: Líneas
 */

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

public class DibujoEnLamina {
    public static void main(String args[]){
        MarcoConDibujosGraphics mi_marco_graphics = new MarcoConDibujosGraphics();
        mi_marco_graphics.setVisible(true);
        mi_marco_graphics.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        MarcoConDibujosJava2D mi_marco_java2D = new MarcoConDibujosJava2D();
        mi_marco_java2D.setVisible(true);
        mi_marco_java2D.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoConDibujosGraphics extends JFrame {
    public MarcoConDibujosGraphics(){
        setTitle("Prueba de dibujo");
        setSize(400, 400);
        LaminaConFigurasGraphics mi_lamina_graphics = new LaminaConFigurasGraphics();
        add(mi_lamina_graphics);
    }
}

class LaminaConFigurasGraphics extends JPanel {
    public  void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawRect(50, 50, 200, 200);
        g.drawLine(100, 100, 300, 200);
        g.drawArc(50, 100, 100, 200, 120, 150);
    }
}

class MarcoConDibujosJava2D extends JFrame {
    public MarcoConDibujosJava2D(){
        setTitle("Prueba de dibujo");
        setBounds(400, 0, 400, 400);
        LaminaConFigurasJava2D mi_lamina_java2D = new LaminaConFigurasJava2D();
        add(mi_lamina_java2D);
    }
}

class LaminaConFigurasJava2D extends JPanel {
    public  void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        Rectangle2D rectangulo = new Rectangle2D.Double(100, 100, 200.25, 150);
        g2.draw(rectangulo);
        Ellipse2D elipse = new Ellipse2D.Double();
        elipse.setFrame(rectangulo);
        g2.draw(elipse);
        g2.draw(new Line2D.Double(100, 100, 300, 250));

        double CentroEnX = rectangulo.getCenterX();
        double CentroEnY = rectangulo.getCenterY();
        double radio = 150;
        Ellipse2D circulo = new Ellipse2D.Double();
        circulo.setFrameFromCenter(CentroEnX, CentroEnY, CentroEnX+radio, CentroEnY+radio);
        g2.draw(circulo);
    }
}