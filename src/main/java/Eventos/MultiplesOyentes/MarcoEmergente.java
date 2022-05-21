package Eventos.MultiplesOyentes;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MarcoEmergente extends JFrame {
    private static int contador = 0;

    public MarcoEmergente (JButton boton_de_principal) {
        contador ++;
        setTitle("Ventana " + contador);
        setBounds(40*contador, 40*contador, 300, 150);
        CierraTodos oyente_cerrar = new CierraTodos();
        boton_de_principal.addActionListener(oyente_cerrar);
    }

    private class CierraTodos implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            dispose();
        }
    }
}
