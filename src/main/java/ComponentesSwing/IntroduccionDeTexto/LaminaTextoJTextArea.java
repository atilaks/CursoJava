package ComponentesSwing.IntroduccionDeTexto;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LaminaTextoJTextArea extends JPanel {
    JTextArea mi_area;
    public LaminaTextoJTextArea () {
        mi_area = new JTextArea(8, 20);
        JScrollPane lamina_barras = new JScrollPane(mi_area);
        mi_area.setLineWrap(true);
        add(lamina_barras);
        JButton mi_boton = new JButton("Introduce");
        mi_boton.addActionListener(new GestionaArea());
        add(mi_boton);
    }

    private class GestionaArea implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            System.out.println(mi_area.getText());
        }
    }
}
