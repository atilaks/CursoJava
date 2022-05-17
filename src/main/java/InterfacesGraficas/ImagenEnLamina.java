package InterfacesGraficas;

/*
    - Image:
        + getWidth: Guarda el ancho de la imagen
        + getHeight: Guarda el alto de la imagen
    - ImageIO: Captura imágenes que se encuentran fuera del programa
        + read: Lee el directorio o URL donde se encuentra la imagen
    - Graphics:
        + drawImage: Permite dibujar una imagen en la lámina
        + copyArea: Permite determinar un área y copiar sus dimensiones
 */

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class ImagenEnLamina {
    public static void main(String args[]){
        MarcoConImagen marco1 = new MarcoConImagen();
        marco1.setVisible(true);
        marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        MarcoConImagenRepetida marco2 = new MarcoConImagenRepetida();
        marco2.setVisible(true);
        marco2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoConImagen extends JFrame {
    public MarcoConImagen(){
        setTitle("Prueba de imágenes");
        setBounds(750, 300, 800, 630);
        LaminaConImagen mi_lamina = new LaminaConImagen();
        add(mi_lamina);
    }
}

class LaminaConImagen extends JPanel{
    private Image imagen;
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        try {
            imagen = ImageIO.read(new File("src/main/java/InterfacesGraficas/imagen1.gif"));
        } catch (IOException e){
            System.out.println("No encontrada");
        }
        g.drawImage(imagen, 0, 0, null);
    }
}

class MarcoConImagenRepetida extends JFrame {
    public MarcoConImagenRepetida(){
        setTitle("Prueba de imágenes");
        setBounds(750, 300, 1000, 600);
        LaminaConImagenRepetida mi_lamina = new LaminaConImagenRepetida();
        add(mi_lamina);
    }
}

class LaminaConImagenRepetida extends JPanel{
    private Image imagen;
    public LaminaConImagenRepetida(){
        try {
            imagen = ImageIO.read(new File("src/main/java/InterfacesGraficas/imagen2.gif"));
        } catch (IOException e){
            System.out.println("No encontrada");
        }
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(imagen, 0, 0, null);
        for (int i = 0; i < 1000; i++) {
            for (int j = 0; j < 600; j++) {
                g.copyArea(0, 0, 250, 150, i*250, j*150);
            }
        }
    }
}