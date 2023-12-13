package org.poo.polymorphism;

public class Vehicle {
    private String vehicleBrand;
    private String model;
    private String color;

    public Vehicle(String vehicleBrand, String model, String color) {
        this.vehicleBrand = vehicleBrand;
        this.model = model;
        this.color = color;
    }

    public void startVehicle() {
        System.out.println("El vehículo se ha encendido.");
    }

    public void turnOffVehicle() {
        System.out.println("El vehículo se ha apagado.");
    }

    public void curb() {
        System.out.println("El vehículo se ha denetido.");
    }

    public  void speedUp() {
        System.out.println("El vehículo ha acelerado.");
    }

    public String getVehicleBrand() {
        return vehicleBrand;
    }

    public void setVehicleBrand(String vehicleBrand) {
        this.vehicleBrand = vehicleBrand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
