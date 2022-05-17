package Eventos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventosBotonMetodo {
    public static void main(String[] args){
        MarcoMetodo mi_marco = new MarcoMetodo();
        mi_marco.setVisible(true);
        mi_marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoMetodo extends JFrame {
    public MarcoMetodo(){
        setTitle("Botones y eventos");
        setBounds(700, 300, 500, 300);
        LaminaMetodo mi_lamina = new LaminaMetodo();
        add(mi_lamina);
    }
}

class LaminaMetodo extends JPanel implements ActionListener {      // Objeto Listener (color del panel)
    JButton boton_azul = new JButton("Azul");           // Objeto fuente ("botón azul")
    JButton boton_rojo = new JButton("Rojo");
    JButton boton_amarillo = new JButton("Amarillo");

    public LaminaMetodo(){
        add(boton_azul);                                    // Objeto evento (clic)
        add(boton_rojo);
        add(boton_amarillo);

        boton_azul.addActionListener(this);
        boton_rojo.addActionListener(this);
        boton_amarillo.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        Object boton_pulsado = e.getSource();
        if (boton_pulsado == boton_azul) {
            setBackground(Color.BLUE);
        } else if (boton_pulsado == boton_rojo) {
            setBackground(Color.RED);
        } else if (boton_pulsado == boton_amarillo) {
            setBackground(Color.YELLOW);
        }
    }
}