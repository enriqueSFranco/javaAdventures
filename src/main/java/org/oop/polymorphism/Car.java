package org.oop.polymorphism;

public class Car extends Vehicle {
    private boolean isSporty;

    public Car(boolean isSporty, String vehicleBrand, String model, String color) {
        super(vehicleBrand, model, color);
        this.isSporty = isSporty;
    }

    public boolean getIsSporty() {
        return isSporty;
    }

    public void setSporty(boolean sporty) {
        isSporty = sporty;
    }

    @Override
    public String toString() {
        return "Sporty: "+this.getIsSporty()+"\nVehicle Brand: "+this.getVehicleBrand()+"\nModel: "+this.getModel()+"\nColor: "+this.getColor();
    }
}
