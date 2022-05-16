package ClasesInternas;

/*
    - Es una clase dentro de un método
    - Útil cuando solo se va a utilizar (instanciar) una sola vez
    - Su ámbito queda restringido al método donde son declaradas
        + Están más encapsuladas, por lo que ni la clase puede acceder a ella (solo desde el método)
    - El código es más sencillo
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class Locales {
    public void enMArcha(int intervalo, final boolean sonido){
        class ClaseInternaLocal implements ActionListener{
            public void actionPerformed(ActionEvent evento){
                Date ahora = new Date();
                System.out.println("Te doy la hora cada 2'': " + ahora);
                if (sonido){
                    Toolkit.getDefaultToolkit().beep();
                }
            }
        }

        ActionListener oyente = new ClaseInternaLocal();

        Timer mi_temporizador = new Timer(intervalo, oyente);
        mi_temporizador.start();
    }
}
