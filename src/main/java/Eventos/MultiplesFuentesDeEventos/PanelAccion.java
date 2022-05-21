package Eventos.MultiplesFuentesDeEventos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class PanelAccion extends JPanel {
    public PanelAccion() {
        AccionColor accion_amarillo = new AccionColor("Amarillo",
                new ImageIcon("src/main/java/Eventos/MultiplesFuentesDeEventos/amarillo.gif"), Color.yellow);
        AccionColor accion_rojo = new AccionColor("Rojo",
                new ImageIcon("src/main/java/Eventos/MultiplesFuentesDeEventos/rojo.gif"), Color.red);
        AccionColor accion_azul = new AccionColor("Azul",
                new ImageIcon("src/main/java/Eventos/MultiplesFuentesDeEventos/azul.gif"), Color.blue);
        add(new JButton(accion_amarillo));
        add(new JButton(accion_rojo));
        add(new JButton(accion_azul));

        InputMap mapa_entrada = getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
        mapa_entrada.put(KeyStroke.getKeyStroke("ctrl Y"), "Fondo amarillo");
        mapa_entrada.put(KeyStroke.getKeyStroke("ctrl R"), "Fondo rojo");
        mapa_entrada.put(KeyStroke.getKeyStroke("ctrl B"), "Fondo azul");
        ActionMap mapa_accion = getActionMap();
        mapa_accion.put("Fondo amarillo", accion_amarillo);
        mapa_accion.put("Fondo rojo", accion_rojo);
        mapa_accion.put("Fondo azul", accion_azul);
    }

    private class AccionColor extends AbstractAction {
        public AccionColor (String nombre, Icon icono, Color color_boton) {
            putValue(Action.NAME, nombre);
            putValue(Action.SMALL_ICON, icono);
            putValue(Action.SHORT_DESCRIPTION, "Poner la lámina de color " + nombre);
            putValue("Color de fondo", color_boton);
        }
        public void actionPerformed(ActionEvent e) {
            Color c = (Color) getValue("Color de fondo");
            setBackground(c);
            System.out.println("Color de fondo: " + getValue(Action.NAME));
        }
    }
}
