package Constantes;

public class EjEmpleados {
    private int Id;
    private static int IdSiguiente = 1;
    private final String nombre;
    private String seccion;

    private String datos;

    public EjEmpleados(String nombre) {
        Id = IdSiguiente;
        IdSiguiente++;
        this.nombre = nombre;
        seccion = "Administración";
        setDatos();
    }

    public String getNombre() {
        return nombre;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
        setDatos();
    }

    public String getDatos() {
        return datos;
    }

    public int getId() {
        return Id;
    }

    public void setDatos() {
        this.datos = "El empleado " + getNombre() + " con id " + getId() + " pertenece a " + getSeccion();
    }

    public static String DameIdSiguiente(){
        return "El id siguiente es " + IdSiguiente;
    }
}
