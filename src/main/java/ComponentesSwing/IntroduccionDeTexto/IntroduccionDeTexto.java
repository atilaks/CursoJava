package ComponentesSwing.IntroduccionDeTexto;

/*
    - JTextField: Crea un cajon donde el usuario puede introducir una línea texto
    - JTextArea: Crea un cajon donde el usuario puede introducir un área amplia para texto
 */

import javax.swing.*;

public class IntroduccionDeTexto {
    public static void main (String[] args) {
        MarcoTextoJTextField mi_marco_JTextField = new MarcoTextoJTextField();
        mi_marco_JTextField.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        MarcoTextoJTextArea mi_marco_JTextArea = new MarcoTextoJTextArea();
        mi_marco_JTextArea.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
