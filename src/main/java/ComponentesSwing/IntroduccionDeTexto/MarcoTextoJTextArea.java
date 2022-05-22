package ComponentesSwing.IntroduccionDeTexto;

import javax.swing.*;

public class MarcoTextoJTextArea extends JFrame {
    public MarcoTextoJTextArea() {
        setBounds(600, 300, 600, 350);
        LaminaTextoJTextArea mi_lamina = new LaminaTextoJTextArea();
        add(mi_lamina);
        setVisible(true);
    }
}
