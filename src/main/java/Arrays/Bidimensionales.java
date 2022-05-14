package Arrays;

public class Bidimensionales {
    public static void main(String args[]){
        //Declarado en distinta línea a la iniciación. Impreso con for
        int [][] matriz_bi1 = new int[2][3];
        matriz_bi1[0][0] = 15;
        matriz_bi1[0][1] = 2;
        matriz_bi1[0][2] = 14;

        matriz_bi1[1][0] = 12;
        matriz_bi1[1][1] = 3;
        matriz_bi1[1][2] = 8;

        System.out.println(matriz_bi1[1][0]);
        for (int i = 0; i < 2; i++){
            for (int j = 0; j < 3; j++){
                System.out.println(matriz_bi1[i][j]);
            }
        }

        //Declarado e iniciado en misma línea. Impreso con for each
        int [][] matriz_bi2 = {
                {5, 6, 2},
                {6, 7, 1}
        };

        for (int[]fila:matriz_bi2){
            System.out.println();
            for (int z: fila){
                System.out.print(z + " ");
            }
        }

        //Ejemplo práctico
        double acumulado;
        double interes = 0.10;

        double [][] saldo = new double[6][5];

        for (int i = 0; i < 6; i++){
            saldo[i][0] = 10000;
            acumulado = 10000;
            for (int j = 1; j < 5; j++){
                acumulado = acumulado + (acumulado * interes);
                saldo[i][j] = acumulado;
            }
            interes = interes + 0.01;
        }
        for (int z = 0; z < 6; z++){
            System.out.println();
            for (int h = 0; h < 5; h++){
                System.out.printf("%1.2f", saldo[z][h]);
                System.out.print(" ");
            }
        }
    }
}
