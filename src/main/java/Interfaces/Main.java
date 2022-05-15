package Interfaces;

// instanceof: Para saber si una instancia (de tipo interfaz o no) pertenece a una clase

public class Main {
    public static void main(String args[]){
        SubClase Trabajador = new SubClase("RRHH", 1500, "Base");
        Comparable ejInterfaz = new SubClase("Administración", 1400, "Base");

        if (Trabajador instanceof Clase){
            System.out.println("Es de tipo Clase");
        }

        if (ejInterfaz instanceof Comparable){
            System.out.println("Implementa la interfaz comparable");
        }

        System.out.println(Trabajador.tomar_decisiones("subir el sueldo a todos"));
    }
}
