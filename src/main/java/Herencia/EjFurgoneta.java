package Herencia;

/*
    - Java no permite herencia múltiple (suplida por interfaces)
    - Superclase: clase padre
    - Subclase: clase hijo
    - Polimorfismo: Utilizar un objeto de subclase siempre que herede de una superclase
        + Los objetos son polimorfos, se comportan de forma distinta según el contexto
    - Enlazado dinámico: Sabe a qué método de la clase sub o super tiene que llamar
 */

public class EjFurgoneta extends EjAutomovil {
    private int carga;
    private int plazas;

    public EjFurgoneta(int ruedas, int peso, String color, int carga, int plazas) {
        super(ruedas, peso, color);
        this.carga = carga;
        this.plazas = plazas;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public int getPlazas() {
        return plazas;
    }

    public void setPlazas(int plazas) {
        this.plazas = plazas;
    }
}
