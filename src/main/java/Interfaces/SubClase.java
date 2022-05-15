package Interfaces;

public class SubClase extends Clase implements Comparable, Interfaz {
    private String rango;

    public SubClase(String departamento, int salario, String rango) {
        super(departamento, salario);
        this.rango = rango;
    }

    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }

    @Override
    public int compareTo(Object miIbjeto) {
        SubClase otroEmpleado = (SubClase) miIbjeto;
        if (this.getSalario() < otroEmpleado.getSalario()){
            return -1;
        }
        if (this.getSalario() > otroEmpleado.getSalario()){
            return 1;
        }
        return 0;
    }

    @Override
    public String tomar_decisiones(String decision) {
        return "Un miembro de la dirección ha tomado la decisión de " + decision;
    }
}
