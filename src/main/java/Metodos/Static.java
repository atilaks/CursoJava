package Metodos;

/*
    - Pertenecen a la clase no a instancias de esta
    - No operan sobre objetos
    - Hay que utilizar la clase para llamar al método. Nunca la instancia
    - No actúan nunca sobre campos de variables, a no ser que la variable sea también estático
 */

public class Static {
    private static String elemento = "Coche";

    public static String getElemento(){
        return "El elemento es " + elemento;
    }
}
