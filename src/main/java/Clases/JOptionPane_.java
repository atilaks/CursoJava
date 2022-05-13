package Clases;

/*
La clase JOptionPane sirve para pedir información en cuadro de texto
    - showInputDialog: abre un cuadro de diálogo con una consulta
 */

import javax.swing.*;

public class JOptionPane_ {
    public static void main(String args[]){
       String nombre_usuario = JOptionPane.showInputDialog("Introduce tu nombre");
       String edad_usuario = JOptionPane.showInputDialog("Introduce tu edad");


        System.out.println("Hola " + nombre_usuario + " tienes " + edad_usuario + "años.");
    }
}
