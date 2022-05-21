package Eventos.Foco;

/*
    - FocusListener
        + focusGained: Cuando el componente gana el foco
        + focusLost: Cuando el componente pierde el foco
 */

import javax.swing.*;

public class EventosFoco {
    public static void main(String args[]) {
        MarcoFoco mi_marco = new MarcoFoco();
        mi_marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
