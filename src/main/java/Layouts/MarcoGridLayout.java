package Layouts;

import javax.swing.*;

public class MarcoGridLayout extends JFrame {
    public MarcoGridLayout() {
        setTitle("Prueba GridLayout");
        setBounds(600, 350, 600, 300);
        PanelGridLayout lamina = new PanelGridLayout();
        add(lamina);
    }
}
