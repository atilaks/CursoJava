package Metodos;

/*
    - Sirve para construir una instancia definiendo los parámetros
    - Puede haber múltiples constructores (sobrecarga de constructores)
        + Sirven para otorgar valores por defecto ya sea con parámetros o valores null
        + Tienen que tener distintos argumentos
    - Tiene que llevar el mismo nombre que la clase
    - this: Para llamar a otro constructor de la clase para definir parámetros concretos
 */

public class Contructor {
    private String color;
    private String tipo;

    public Contructor(String color, String tipo) {
        this.color = color;
        this.tipo = tipo;
    }

    //Da un valor por defecto, evitando que ponga valores null
    public Contructor() {
        this("negro", "grande");
    }
}
