package Eventos.MultiplesFuentesDeEventos;

import javax.swing.*;

class MarcoAccion extends JFrame {
    public MarcoAccion () {
        setTitle("Prueba acciones");
        setBounds(600, 350, 600, 300);
        PanelAccion lamina = new PanelAccion();
        add(lamina);
    }
}
