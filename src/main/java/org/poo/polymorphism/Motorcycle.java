package org.poo.polymorphism;

public class Motorcycle extends Vehicle {
    private boolean performTrick;

    public Motorcycle(boolean performTrick, String vehicleBrand, String model, String color) {
        super(vehicleBrand, model, color);
        this.performTrick = performTrick;
    }

    public boolean getIsPerformTrick() {
        return performTrick;
    }

    public void setPerformTrick(boolean performTrick) {
        this.performTrick = performTrick;
    }

    @Override
    public String toString() {
        return "performTrick: "+this.getIsPerformTrick()+"\nVehicle Brand: "+this.getVehicleBrand()+"\nModel: "+this.getModel()+"\nColor: "+this.getColor();
    }
}
