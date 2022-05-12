package Estructuras;

/** TIPOS PRIMITIVOS
 * - bolean (2b): true/false
 * - byte (1b): -128 a 127
 * - short (2b): -32768 a 32767
 * - int (4b): -2147483648 a 2147483649
 * - long (8b): muy largo
 * - double (8b): mucho mas largo
 * - float (4b): con coma
 * - char (2b): caracteres
 */

public class Variables {
    public static void main(String args[]){
        byte edad = 23; //Declaracion en misma linea
        byte edad2; //Declaración en distinta variable
        edad2 = 5;

        System.out.println(edad);
        System.out.println(edad2);
    }
}
