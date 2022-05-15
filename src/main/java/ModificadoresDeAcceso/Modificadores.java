package ModificadoresDeAcceso;

/*
    - public: Accesible desde cualquier estructura
    - private: Solo accesible desde la clase
        + No accesible desde subclase
    - por defecto: Solo accesible desde la clase y el paquete
        + No accesible desde subclase
    - protected: Solo accesible desde la clase, el paquete y una subclase desde un paquete distinto
 */

import ModificadoresDeAcceso.PaqueteEnPaquete.ClaseEnPaqueteDePaquete;
import ModificadoresDeAccesoOtroPaquete.ClaseOtroPaquete;

public class Modificadores {
    public static void main(String args[]){
        ClasePrincipal instancia1 = new ClasePrincipal();
        ClaseEnPaqueteDePaquete instancia2 = new ClaseEnPaqueteDePaquete();
        ClaseOtroPaquete intancia3 = new ClaseOtroPaquete();
    }
}
