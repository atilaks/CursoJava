package Eventos.MultiplesFuentesDeEventos;

/*
    - Action: Esta interfaz hereda de actionPerformed
        + setEnabled: Permite poner activo o no un objeto
        + putValue: Permite almacenar parejas de clave/valor
        + addPropertyChangedListener: Agrega una propiedad al objeto
        + isEnabled: Devuelve si el objeto está activo o no
        + getValue: Permite recuperar el valor desde la clave
        + removePropertyChangedListener: Elimina una propiedad del objeto
    - AbstractAction: Clase abstracta que actúa como si fuera una clase adaptadora
 */

import javax.swing.*;

public class EventosMultiples {
    public static void main (String[] args) {
        MarcoAccion marco = new MarcoAccion();
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
    }
}

