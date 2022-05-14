package POO;

//Contiene el método main que gestiona el código de coche

public class EjUsoCoche {
    public static void main(String args[]){
        EjCoche Renault = new EjCoche(4, 4.2, 1.5, "tdi5", 2500, true);
        System.out.println("Este coche tiene " + Renault.getRuedas() + " ruedas");
        System.out.println("Este coche tiene " + Renault.getLargo() + " largo");
        System.out.println("Este coche tiene " + Renault.getAncho() + " ancho");
        System.out.println("Este coche tiene " + Renault.getMotor() + " de motor");
        System.out.println("Este coche tiene " + Renault.getPeso() + " peso");
        if (Renault.isClimatizador()){System.out.println("Este coche tiene climatizador");}
    }
}
