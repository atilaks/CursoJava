package Arrays;

/*
    - Permite declarar e iniciar en líneas distintas o iguales
 */

public class Arrays {
    public static void main(String args[]){
        //Iniciada en distinta línea
        int [] mi_matriz = new int[5];
        mi_matriz[0] = 5;
        mi_matriz[1] = 2;
        mi_matriz[2] = 4;
        mi_matriz[3] = 1;
        mi_matriz[4] = 6;
        for (int i = 0; i < 5; i++) {
            System.out.println(mi_matriz[i]);
        }

        //Iniciada en misma línea (simplificada o implícita)
        int [] mi_matriz2 = {5, 8, 12, 3, 6};
        for (int i = 0; i < 5; i++) {
            System.out.println(mi_matriz2[i]);
        }
    }
}
