package Herencia;

/*
    - Clase abstracta: Marca el diseño en la jerarquía de la herencia
        + Obliga a que todas las clases que heredan tengan que sobreescribir el método abstracto
    - Método abstracto: Es la marca del diseño para la jerarquía
        + Permite declararla sin definirla
        + Obliga a que la clase a la que pertenece se declare como abstracta
 */

abstract class EjVeiculo {
    public  abstract String getInfo();
}
