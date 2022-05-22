package ComponentesSwing.IntroduccionDeTexto;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LaminaTextoJTextField extends JPanel {
    JTextField campo1;

    public LaminaTextoJTextField() {
        campo1 = new JTextField(20);
        add(campo1);
        JButton mi_boton = new JButton("Introduce");
        DameTexto mi_evento = new DameTexto();
        mi_boton.addActionListener(mi_evento);
        add(mi_boton);
    }

    private class DameTexto implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            System.out.println(campo1.getText().trim());
        }
    }
}
