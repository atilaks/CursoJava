package ComponentesSwing.IntroduccionDeTexto;

import javax.swing.*;

public class MarcoTextoJTextField extends JFrame {
    public MarcoTextoJTextField() {
        setBounds(600, 300, 600, 350);
        LaminaTextoJTextField mi_lamina = new LaminaTextoJTextField();
        add(mi_lamina);
        setVisible(true);
    }
}
