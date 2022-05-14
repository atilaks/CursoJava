package POO;

/*
    - this: para distinguir la variable de la clase del argumento del método
 */

public class EjCoche {
    private int ruedas;
    private double largo;
    private double ancho;
    private String motor;
    private int peso;
    private boolean climatizador;

    public EjCoche(int ruedas, double largo, double ancho, String motor, int peso, boolean climatizador) {
        this.ruedas = ruedas;
        this.largo = largo;
        this.ancho = ancho;
        this.motor = motor;
        this.peso = peso;
        this.climatizador = climatizador;
    }

    public int getRuedas() {
        return ruedas;
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public boolean isClimatizador() {
        return climatizador;
    }

    public void setClimatizador(boolean climatizador) {
        this.climatizador = climatizador;
    }
}
