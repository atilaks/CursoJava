package Eventos.MultiplesOyentes;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LaminaPrincipal extends JPanel {
    JButton boton_cerrar;

    public LaminaPrincipal () {
        JButton boton_nuevo = new JButton("Nuevo");
        add(boton_nuevo);
        boton_cerrar = new JButton("Cerrar todo");
        add(boton_cerrar);
        OyenteNuevo mi_oyente = new OyenteNuevo();
        boton_nuevo.addActionListener(mi_oyente);
    }

    private class OyenteNuevo implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            MarcoEmergente marco = new MarcoEmergente(boton_cerrar);
            marco.setVisible(true);
        }
    }
}
