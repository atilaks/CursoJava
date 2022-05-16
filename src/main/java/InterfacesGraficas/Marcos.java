package InterfacesGraficas;

/*
    - setVisible: hacer visible la ventana
    - setDefaultCloseOperation: Definir el comportamiento al cerrar ventana
        + JFrame.EXIT_ON_CLOSE: Detener programa
        + JFrame.HIDE_ON_CLOSE: Cerrar ventana sin detener programa
    - Métodos importantes:
        + setSize: Define las dimensiones de la ventana
        + setLocation: Cambia la ubicación de la ventana
        + setBounds: Cambia la ubicación de la ventana y define dimensiones
        + setIconImage: Cambia el icono de la ventana
            * getImage: Devuelve un objeto de tipo image
        + setTitle: Cambia el título de la ventana
        + setResizable: Otorgar capacidad para redimensionar la ventana
        + setExtendedState:
            * Frame.MAXIMIZED_HORIZ: Maximiza horizontalmente
            * Frame.MAXIMIZED_VERT: Maximiza verticalmente
            * Frame.MAXIMIZED_BOTH: Ventana en pantalla completa
 */

import javax.swing.*;
import java.awt.*;

public class Marcos {
    public static void main(String args[]){
        MiMarco marco1 = new MiMarco();
        marco1.setVisible(true);
        marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MiMarco extends JFrame {
    public MiMarco(){
        setSize(500, 300);
        setLocation(700, 400);
        setBounds(700, 400, 500, 500);
        setTitle("Mi ventana");
        setResizable(false);
        setExtendedState(Frame.MAXIMIZED_BOTH);

        Toolkit mi_pantalla = Toolkit.getDefaultToolkit();
        Image mi_icono = mi_pantalla.getImage("src/main/java/InterfacesGraficas/icono.gif");
        setIconImage(mi_icono);
    }
}