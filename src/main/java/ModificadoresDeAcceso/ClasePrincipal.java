package ModificadoresDeAcceso;

public class ClasePrincipal {
    //Al no tener constructor se asume que el modificador es por defecto
    int var1 = 5;
    protected int var2 = 7;
    public int var3 = 2;
    private int var4 = 9;
    String metodo(){
        return "El valor de var2 es: " + var2;
    }
}
