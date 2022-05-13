package Clases;

/*
Integer transforma objetos
    - parseInt(n): pasa un string a int
    - parseDouble(n): pasa un string a double
 */

public class Integer_ {
    public static void main(String args[]){
        String edad = "25";
        int int_edad = Integer.parseInt(edad);
        System.out.println(int_edad + 1);

        String num1 = "2";
        double num2 = Double.parseDouble(num1);
        System.out.println(num2);
    }
}
