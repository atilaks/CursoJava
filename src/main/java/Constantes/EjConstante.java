package Constantes;

/*
    - final: concierte el objeto en constante, de tal forma que no podrá ser modificado ni tener setter
    - static: genera un valor aleatorio y no repetido que pertenece a la clase, no a sus instancias
 */

public class EjConstante {
    public static void main(String args[]){
        EjEmpleados trabajador1 = new EjEmpleados("Paco");
        EjEmpleados trabajador2 = new EjEmpleados("Emilio");

        trabajador1.setSeccion("RRHH");
        System.out.println(trabajador1.getDatos() + "\n"
                + trabajador2.getDatos());
        System.out.println(EjEmpleados.DameIdSiguiente());
    }
}
