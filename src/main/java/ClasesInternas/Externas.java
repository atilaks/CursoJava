package ClasesInternas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

class Externas {
    private int intervalo;
    private boolean sonido;

    public Externas(int intervalo, boolean sonido){
        this.intervalo = intervalo;
        this.sonido = sonido;
    }

    public void enMArcha(){
        ActionListener oyente = new ClaseInterna();

        Timer mi_temporizador = new Timer(intervalo, oyente);
        mi_temporizador.start();
    }

    private class ClaseInterna implements ActionListener{
        public void actionPerformed(ActionEvent evento){
            Date ahora = new Date();
            System.out.println("Te doy la hora cada 3'': " + ahora);
            if (sonido){        //Accede a la variable sonido, que está fuera de la clase
                Toolkit.getDefaultToolkit().beep();
            }
        }
    }
}
