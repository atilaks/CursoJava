package Eventos.Boton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventosBotonClase {
    public static void main(String[] args) {
        MarcoSubClase mi_marco = new MarcoSubClase();
        mi_marco.setVisible(true);
        mi_marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoSubClase extends JFrame {
    public MarcoSubClase(){
        setTitle("Botones y eventos");
        setBounds(700, 300, 500, 300);
        LaminaSubClase mi_lamina = new LaminaSubClase();
        add(mi_lamina);
    }
}

class LaminaSubClase extends JPanel {                                // Objeto Listener (color del panel)
    JButton boton_azul = new JButton("Azul");                   // Objeto fuente ("botón azul")
    JButton boton_rojo = new JButton("Rojo");
    JButton boton_amarillo = new JButton("Amarillo");

    public LaminaSubClase(){
        add(boton_azul);                                            // Objeto evento (clic)
        add(boton_rojo);
        add(boton_amarillo);
        LaminaColorFondo azul = new LaminaColorFondo(Color.BLUE);
        LaminaColorFondo rojo = new LaminaColorFondo(Color.RED);
        LaminaColorFondo amarillo = new LaminaColorFondo(Color.YELLOW);

        boton_azul.addActionListener(azul);
        boton_rojo.addActionListener(rojo);
        boton_amarillo.addActionListener(amarillo);
    }

    private class LaminaColorFondo implements ActionListener {
        private Color color_de_fondo;

        public LaminaColorFondo (Color c) {
            color_de_fondo = c;
        }

        public void actionPerformed(ActionEvent e){
            setBackground(color_de_fondo);
        }
    }
}