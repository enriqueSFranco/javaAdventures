package org.models;

public class SuperheroImpl implements Superhero {

    private String name;

    public SuperheroImpl(String name) {
        this.name = name;
    }

    @Override
    public void fly() {
        System.out.println(name + " is flying high in the sky.");
    }

    public  void superStrength() {
        System.out.println(name + " is demonstrating incredible strength.");
    }

    @Override
    public String getName() {
        return this.name;
    }
}
