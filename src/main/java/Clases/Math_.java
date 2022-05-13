package Clases;

/*
    - sqrt(n): raíz cuadrada de un numero (n es un double)
    - pow(base, exponente): potencia de un número (se expresan en doubles)
    - sin(ángulo), cos(ángulo), tan(ángulo), atan(ángulo): seno, coseno, tangente, arco tangente
    - round(decimal): redondeo de un numero
    -PI: constante de clase con el numero PI
 */

public class Math_ {
    public static void main(String args[]){
        double raiz = Math.sqrt(9);
        System.out.println(raiz);

        float num1 = 8.85F;
        int redondeo = Math.round(num1);
        System.out.println(redondeo);

        double base = 5;
        double exponente = 3;
        int potencia = (int)Math.pow(base, exponente);
        System.out.println(potencia);
    }
}
