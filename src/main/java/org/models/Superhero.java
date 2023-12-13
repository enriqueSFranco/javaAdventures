package org.models;

/**
 * =============== INTERFACES ===============
 * Colección de métodos abstractos con atributos CONSTANTES
 * Solamente puede extender o implementar otras interfaces
 * Da a conocer que se debe hacer pero sin mostrar su implementación (SOLO MÉTODOS ABSTRACTOS)
 * Solo métodos publicos
 * Solo constantes public static final
 * La palabra "abstract" en los métodos no es obligatoria
 * Indica el "PUEDE HACER" de un objeto
 **/

public interface Superhero {
    void fly();
    void superStrength();

    String getName();
}
