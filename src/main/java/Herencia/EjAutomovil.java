package Herencia;

public class EjAutomovil {
    private int ruedas;
    private int peso;
    private String color;

    public EjAutomovil(int ruedas, int peso, String color) {
        this.ruedas = ruedas;
        this.peso = peso;
        this.color = color;
    }

    public final int getRuedas() {
        return ruedas;
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }

    public final int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public final String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getInfo(){
        return "El vehículo tiene: "
                + getRuedas() + " ruedas, "
                + getPeso() + " kilos de peso, "
                + getColor() + " de color.";
    }
}
