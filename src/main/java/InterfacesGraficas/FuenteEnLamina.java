package InterfacesGraficas;

/*
    - Graphics2D:
        + setFont: Establece el tipo de letra, asignando el tipo
    - Font:
        + Font: Establece el tipo de letra, asignando tipo, estilo y tamaño
            * BOLD: Negrita
            * PLAIN: Normal
            * ITALIC: Cursiva
 */

import javax.swing.*;
import java.awt.*;

public class FuenteEnLamina {
    public static void main(String args[]){
        MarcoConFuente marco = new MarcoConFuente();
        marco.setVisible(true);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoConFuente extends JFrame {
    public MarcoConFuente(){
        setTitle("Prueba de fuentes");
        setSize(400, 400);
        LaminaConFuente mi_lamina = new LaminaConFuente();
        add(mi_lamina);
        mi_lamina.setBackground(SystemColor.window); // SystemColor.window: color por defecto de windows
    }
}

class LaminaConFuente extends JPanel{
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

        Font mi_fuente = new Font("Arial", Font.BOLD, 26);
        g2.setFont(mi_fuente);
        g2.drawString("Jaime", 100, 100);

        g2.setFont(new Font("Courier", Font.ITALIC, 14));
        g2.drawString("Franco", 100, 200);
    }
}