package Herencia;

/*
    - Java no permite herencia múltiple (suplida por interfaces)
    - Superclase: Clase padre
    - Subclase: Clase hijo
    - final: Detiene la cadena de la herencia, haciendo que ninguna futura clase pueda heredar de esta
    - Sobrecarga de métodos: Dos o más métodos con el mismo nombre en la clase sub y súper
        + Siempre utilizará el de la clase sub al quedar sobreescrito
        + Es posible aplicar final para evitar la sobrecarga

 */

final public class EjFurgoneta extends EjAutomovil {
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

    public String getInfo(){
        return "El vehículo tiene: "
                + getRuedas() + " ruedas, "
                + getPeso() + " kilos de peso, "
                + getColor() + " de color, "
                + getCarga() + " kilos de carga, "
                + getPlazas() + " plazas.";
    }
}
