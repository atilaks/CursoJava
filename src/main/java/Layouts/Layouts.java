package Layouts;

/*
    - Son las disposiciones de los elementos en ventana
    - Tipos:
        + FlowLayout: Determinado por una composición centrada o lateral (por defecto)
        + BorderLayout: Determinado por una composición Norte/Sur/Este/Oeste/Centro
        + GridLayout: Determinada por una cuadrícula
    - setLayout: Método para determinar que disposición va a tener
    - Es posible combinarlos en el mismo marco por zonas
 */

import javax.swing.*;

public class Layouts {
    public static void main (String[] args) {
        MarcoFlowLayout marco_flow = new MarcoFlowLayout();
        marco_flow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco_flow.setVisible(true);

        MarcoBorderLayout marco_border = new MarcoBorderLayout();
        marco_border.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco_border.setVisible(true);

        MarcoGridLayout marco_grid = new MarcoGridLayout();
        marco_grid.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco_grid.setVisible(true);
    }
}
