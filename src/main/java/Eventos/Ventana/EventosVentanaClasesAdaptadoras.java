package Eventos.Ventana;

/*
    - Las clases adaptadoras ya implementan las interfaces y actúan como clase puente
    - Método más corto, limpio y claro que el uso de todos los métodos de WindowsListener
    - Tipos de clases adaptadoras:
        + WindowFocusListener:
        + WindowsListener:
        + WindowsStateListener:
        + EventListener:
 */

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class EventosVentanaClasesAdaptadoras {
    public static void main(String args[]){
        MarcoVentanaClasesAdaptadoras mi_marco1 = new MarcoVentanaClasesAdaptadoras();
        mi_marco1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}

class MarcoVentanaClasesAdaptadoras extends JFrame {
    public MarcoVentanaClasesAdaptadoras(){
        setBounds(300, 300, 500, 350);
        setVisible(true);
        addWindowListener(new VentanaOyenteClasesAdaptadoras());
    }
}

class VentanaOyenteClasesAdaptadoras extends WindowAdapter {
    public void windowIconified(WindowEvent e) {
        System.out.println("Ventana minimizada");
    }
}