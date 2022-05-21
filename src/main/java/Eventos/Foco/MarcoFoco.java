package Eventos.Foco;

import javax.swing.*;

class MarcoFoco extends JFrame {
    public MarcoFoco() {
        setVisible(true);
        setBounds(300, 300, 500, 350);
        add(new LaminaFoco());
    }
}
