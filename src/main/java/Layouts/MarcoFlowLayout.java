package Layouts;

import javax.swing.*;

public class MarcoFlowLayout extends JFrame {
    public MarcoFlowLayout() {
        setTitle("Prueba FlowLayout");
        setBounds(600, 350, 600, 300);
        PanelFlowLayout lamina = new PanelFlowLayout();
        add(lamina);
    }
}
