package org.abstractclass;

/**
 * =============== CLASES ABSTRACTAS ===============
 * No pueden ser instanciadas
 * Generalemente declaran la existencia de métodos pero no su implementación, convirtiendolas en una clase padre
 * Al menos unos de sus métodos debe ser abstracto (puede tener métodos no abstractos)
 * Su nivel de visualización debe ser public o protected
 * Una clase no puede heredar de varias clases abstractas
 * Indican el "ES/SER" de un objeto
 **/

public abstract class Figure {

    private double x;
    private double y;

    public Figure (double x, double y) {
        this.x = x;
        this.y = y;
    }

    public abstract double area();
}
