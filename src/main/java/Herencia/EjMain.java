package Herencia;

public class EjMain {
    public static void main(String args[]){
        EjFurgoneta nueva_furgoneta = new EjFurgoneta(4, 1500, "blanca", 4000, 3);

        EjAutomovil[] Automoviles = new EjAutomovil[3];
        Automoviles[0] = new EjAutomovil(6,2000, "negro");
        Automoviles[1] = new EjAutomovil(4,1000, "azul");
        Automoviles[2] = nueva_furgoneta;
        //ej Polimorfismo. Almacena en una variable que espera de tipo Automovil, un objeto subclase de tipo Furgoneta
    }
}
