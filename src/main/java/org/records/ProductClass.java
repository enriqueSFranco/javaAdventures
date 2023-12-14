package org.records;

import java.util.Objects;

public class ProductClass {
    private final int idProduct; // propiedad inmutable con final
    private final String name;
    private final double price;
    private final boolean status;

    public ProductClass(int idProduct, String name, double price, boolean status) {
        this.idProduct = idProduct;
        this.name = name;
        this.price = price;
        this.status = status;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public boolean isStatus() {
        return status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductClass that = (ProductClass) o;
        return idProduct == that.idProduct && Double.compare(price, that.price) == 0 && status == that.status && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idProduct, name, price, status);
    }

    @Override
    public String toString() {
        return STR."ProductClass{idProduct=\{idProduct}, name='\{name}\{'\''}, price=\{price}, status=\{status}\{'}'}";
    }
}
