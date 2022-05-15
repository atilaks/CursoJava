package Clases;

/*
    - Ejecuta una acción cada x segundos (en milisegundos)
    - Hereda de la clase Object e implementa una interfaz
    - Recibe dos parámetros uno de tipo entero y una interfaz
        + La interfaz que implementa es ActionListener
            * Esta contiene un método llamado actionPerformed
    - Métodos:
        +start: Comienza el temporizador empezando por mandar las acciones los oyentes
 */

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class Timer_ {
    public static void main(String args[]){
        DameHora oyente = new DameHora();
        Timer miTemporizador = new Timer(5000, oyente);
        miTemporizador.start();

        JOptionPane.showMessageDialog(null, "Pulsa Aceptar para detener");
        System.exit(0);
    }
}

class DameHora implements ActionListener {
    public void actionPerformed (ActionEvent e){
        Date ahora = new Date();

        System.out.println("Te pongo la hora cada 5'': " + ahora);
    }
}