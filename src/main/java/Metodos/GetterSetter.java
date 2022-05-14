package Metodos;

/*
    - Sirven para encapsular las variables dentro de una clase
    - Getter: Coger valor
    - Setter: Otorgar valor
    - Desde botón derecho Generate se construyen automáticamente
 */

public class GetterSetter {
    private String color;
    private String tipo;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
