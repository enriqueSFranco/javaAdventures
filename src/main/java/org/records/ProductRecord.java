package org.records;

/**
 * Por defecto sobre-escribe el método toString
 * */
public record ProductRecord(int idProduct, String name, double price, boolean status) {
    public ProductRecord(String name) {
        this(1, name, 1500, true);
    }
}
