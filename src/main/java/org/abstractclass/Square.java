package org.abstractclass;

public class Square extends Figure {

    private double l;

    public Square(double x, double y, double l) {
        super(x, y);
        this.l = l;
    }

    @Override
    public double area() {
        return Math.pow(l, 2);
    }
}
