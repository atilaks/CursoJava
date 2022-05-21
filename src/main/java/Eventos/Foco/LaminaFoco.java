package Eventos.Foco;

import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

class LaminaFoco extends JPanel {
    JTextField cuadro1;
    JTextField cuadro2;

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        setLayout(null);
        cuadro1 = new JTextField();
        cuadro2 = new JTextField();
        cuadro1.setBounds(120, 10, 150, 20);
        cuadro2.setBounds(120, 50, 150, 20);
        add(cuadro1);
        add(cuadro2);
        LanzaFoco foco = new LanzaFoco();
        cuadro1.addFocusListener(foco);
    }

    private class LanzaFoco implements FocusListener {
        public void focusGained(FocusEvent e) {
            System.out.println("Foco ganado");
        }

        public void focusLost(FocusEvent e) {
            System.out.println("Foco perdido");
        }
    }
}
