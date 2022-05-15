package Interfaces;

/*
    - Establecen los comportamientos a cumplir por las clases que implementan la interfaz
    - Una clase puede implementar multiples interfaces
    - Las directrices (métodos) de la interfaz son de obligado cumplimiento
    - Hay interfaces predefinidas o propias
    - Solo pueden albergar métodos abstractos y constantes
    - Se almacenan en un .class
    - No se pueden instanciar
    - Todos sus métodos son public y abstract
        + No hace falta ponerlo
    - No tienen variables, tienen constantes
 */

public interface Interfaz {
    String tomar_decisiones(String decision);
}
