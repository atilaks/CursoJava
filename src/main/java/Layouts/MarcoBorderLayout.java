package Layouts;

import javax.swing.*;

public class MarcoBorderLayout extends JFrame {
    public MarcoBorderLayout() {
        setTitle("Prueba BorderLayout");
        setBounds(600, 350, 600, 300);
        PanelBorderLayout lamina = new PanelBorderLayout();
        add(lamina);
    }
}
