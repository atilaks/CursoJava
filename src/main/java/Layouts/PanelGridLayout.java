package Layouts;

import javax.swing.*;
import java.awt.*;

public class PanelGridLayout extends JPanel{
    public PanelGridLayout() {
        setLayout(new GridLayout(2, 2));
        add(new JButton("Arriba izquierda"));
        add(new JButton("Arriba derecha"));
        add(new JButton("Abajo izquierda"));
        add(new JButton("Abajo derecha"));
    }
}
