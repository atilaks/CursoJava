package Layouts;

import javax.swing.*;
import java.awt.*;

public class PanelFlowLayout extends JPanel {
    public PanelFlowLayout() {
        setLayout(new FlowLayout(FlowLayout.CENTER, 75, 100));
        add(new JButton("Amarillo"));
        add(new JButton("Rojo"));
        add(new JButton("Azul"));
    }
}
