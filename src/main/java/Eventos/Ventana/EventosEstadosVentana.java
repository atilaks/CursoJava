package Eventos.Ventana;

/*
    - WindowStateListener:
        + windowStateChanged: Informa cada vez que el estado de la ventana cambia
    - WindowEvent:
        + getNewState: Devuelve estado nuevo de la ventana (a la acción)
        + getOldState: Devuelve estado viejo de la ventana (a la acción)
 */

import javax.swing.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;

public class EventosEstadosVentana {
    public static void main(String args[]) {
        MarcoEstadoVentana mi_marco = new MarcoEstadoVentana();
        mi_marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoEstadoVentana extends JFrame {
    public MarcoEstadoVentana() {
        setVisible(true);
        setBounds(300, 300, 500, 350);
        CambiaEstado nuevo_estado = new CambiaEstado();
        addWindowStateListener(nuevo_estado);
    }
}

class CambiaEstado implements WindowStateListener {
    public void windowStateChanged(WindowEvent e){
        System.out.println("La ventana ha cambiado de estado");
        System.out.println(e.getNewState());
    }
}