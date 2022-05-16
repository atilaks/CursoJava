package Clases;

/*
    - Se declara como cualquier clase, primera letra en mayúscula
    - La palabra es una instancia de la clase String, no una variable
    - La clase String tiene sus propios métodos:
        + length(): devuelve la longitud
        + charAt(n): devuelve el elemento en la posición n
        + substring(x, y): devuelve subcadena entre los elementos expresados (x, y)
        + equals(cadena): devuelve true si es igual
        + equalsIgnoreCase(cadena): igual que equals sin tener en cuenta mayúsculas y minúsculas
 */

public class String_ {
    public static void main(String args[]){
        String nombre1 = "Jaime", nombre2 = "jaime";
        System.out.println(nombre1);

        System.out.println(nombre1.length());
        System.out.println(nombre1.charAt(1));
        System.out.println(nombre1.substring(1, 3));
        System.out.println(nombre1.equals(nombre2));
        System.out.println(nombre1.equalsIgnoreCase(nombre2));
    }
}
