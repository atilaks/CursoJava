package ClasesInternas;

/*
    - Inner class
    - Las clases internas sí que pueden tener acceso private
        + Las clases normales no pueden tener acceso private
    - Utilidades:
        + Para acceder a los campos privados de una clase a otra
        + Para ocultar una clase a otras del mismo paquete (encapsular)
        + Para crear clases internas anónimas (retrollamadas)
        + Para gestionar cuando una clase debe acceder a los campos de ejemplar de otra clase
 */

import javax.swing.*;

public class Main {
    public static void main(String args[]){
        Externas mi_reloj1 = new Externas(3000, true);
        mi_reloj1.enMArcha();
        JOptionPane.showMessageDialog(null, "Pulsa aceptar para terminar");

        Locales mi_reloj2 = new Locales();
        mi_reloj2.enMArcha(2000, true);
        JOptionPane.showMessageDialog(null, "Pulsa aceptar para terminar");
        System.exit(0);
    }
}
