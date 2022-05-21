package Eventos.Ventana;

/*
    - WindowListener: Para construir la acción de pantalla es necesario implementar los siete métodos
        + windowActivated: Desencadena al activar ventana
        + windowClosed: Desencadena al cerrar ventana
        + windowClosing: Desencadena cuando se está cerrando la ventana
        + windowDeactivated: Desencadena al desactivar ventana
        + windowDeiconified: Desencadena al restaurar la ventana
        + windowIconified: Desencadena al minimizar ventana
        + windowOpened: Desencadena al abrir ventana
 */

import javax.swing.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class EventosVentanaWindowsListener {
    public static void main(String args[]){
        MarcoVentanaWindowsListener mi_marco1 = new MarcoVentanaWindowsListener();
        mi_marco1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        MarcoVentanaWindowsListener mi_marco2 = new MarcoVentanaWindowsListener();
        mi_marco2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}

class MarcoVentanaWindowsListener extends JFrame {
    public MarcoVentanaWindowsListener(){
        setBounds(300, 300, 500, 350);
        setVisible(true);
        VentanaOyenteWindowsListener oyente = new VentanaOyenteWindowsListener();
        addWindowListener(oyente);
    }
}

class VentanaOyenteWindowsListener implements WindowListener {
    public void windowActivated(WindowEvent e) {
        System.out.println("Ventana activada");
    }
    public void windowClosed(WindowEvent e) {
        System.out.println("Ventana cerrada");
    }
    public void windowClosing(WindowEvent e) {
        System.out.println("Cerrando ventana");
    }
    public void windowDeactivated(WindowEvent e) {
        System.out.println("Ventana desactivada");
    }
    public void windowDeiconified(WindowEvent e) {
        System.out.println("Ventana restaurada");
    }
    public void windowIconified(WindowEvent e) {
        System.out.println("Ventana minimizada");
    }
    public void windowOpened(WindowEvent e) {
        System.out.println("Ventana abierta");
    }
}