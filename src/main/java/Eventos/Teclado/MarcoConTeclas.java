package Eventos.Teclado;

import javax.swing.*;

class MarcoConTeclas extends JFrame {
    public MarcoConTeclas() {
        setVisible(true);
        setBounds(300, 300, 500, 350);
        EventoTeclado tecla = new EventoTeclado();
        addKeyListener(tecla);
    }
}
