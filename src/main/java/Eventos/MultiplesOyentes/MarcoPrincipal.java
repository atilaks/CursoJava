package Eventos.MultiplesOyentes;

import javax.swing.*;

public class MarcoPrincipal extends JFrame {
    public MarcoPrincipal(){
        setTitle("Prueba multiples oyentes");
        setBounds(1300, 100, 300, 200);
        LaminaPrincipal lamina = new LaminaPrincipal();
        add(lamina);
    }
}
