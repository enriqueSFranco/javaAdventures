package org.poo.inheritance;

public class Employee extends Person {
    private String job;
    private double salary;

    public Employee(String job, double salary, String name, String lastName, int age, char gender) {
        super(name, lastName, age, gender);

        this.job = job;
        this.salary = salary;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Name: "+ this.getName()+"\nLast Name: "+ this.getLastName()+"\nAge: "+ this.getAge()+"\nGender: "+ this.getGender()+"\nJob: "+ this.getJob()+"\nSalary: "+this.getSalary();
    }
}
