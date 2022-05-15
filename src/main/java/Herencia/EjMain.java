package Herencia;

/*
    - Polimorfismo: Utilizar un objeto de subclase siempre que herede de una superclase
        + Los objetos son polimorfos, se comportan de forma distinta según el contexto
    - Enlazado dinámico: Sabe a qué método de la clase sub o súper tiene que llamar
    - Refundición (casting): Cambiar el tipo de variable manualmente
        + No es posible cambiar un objeto de clase súper a otro de clase sub
 */

public class EjMain {
    public static void main(String args[]){
        EjFurgoneta nueva_furgoneta1 = new EjFurgoneta(4, 1500, "blanca", 4000, 3);

        EjAutomovil[] Automoviles = new EjAutomovil[3];
        Automoviles[0] = new EjAutomovil(6,2000, "negro");
        Automoviles[1] = new EjAutomovil(4,1000, "azul");
        Automoviles[2] = nueva_furgoneta1;
        //ej Polimorfismo. Almacena en una variable que espera de tipo Automovil, un objeto subclase de tipo Furgoneta

        System.out.println(Automoviles[0].getInfo());
        System.out.println(Automoviles[1].getInfo());
        System.out.println(Automoviles[2].getInfo());
    }
}
