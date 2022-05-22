package Layouts;

import javax.swing.*;
import java.awt.*;

public class PanelBorderLayout extends JPanel{
    public PanelBorderLayout() {
        setLayout(new BorderLayout(10, 10));
        add(new JButton("Norte"), BorderLayout.NORTH);
        add(new JButton("Sur"), BorderLayout.SOUTH);
        add(new JButton("Este"), BorderLayout.EAST);
        add(new JButton("Oeste"), BorderLayout.WEST);
        add(new JButton("Centro"), BorderLayout.CENTER);
    }
}
