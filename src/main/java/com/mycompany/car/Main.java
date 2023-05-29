/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.car;


public class Main {
    public String brand;
    public String model;
    public String color;
    private int buildYear;
    private int mileage = 0;
    private int fuel;
    private int consumption = 5;
    
    public Main() {
        this.brand = "";
        this.model = "";
        this.color = "";
        this.buildYear = 0;
    }
    
    public Main(String brand, String model, String color, int buildYear, int mileage, int fuel, int consumption) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.buildYear = buildYear;
        this.mileage = mileage;
        this.fuel = fuel;
        this.consumption = consumption;
    }
    
    public Main(int bulidYear) {
        this.buildYear = bulidYear;
    }
    
    public int getBuildYear() {
        return this.buildYear;
    }
    
    private int getMileage() {
        return this.mileage;
    }
    
    private void setMileage(int newMileage) {
        this.mileage = newMileage;
    }
    
    private int getConsumption() {
        return this.consumption;
    }
    
    private int getFuel() {
        return this.fuel;
    }
    
    private void setFuel(int fuel) {
        this.fuel = fuel;
    }
    
    public void printAttributes() {
        System.out.println("Brand: " + this.brand);
        System.out.println("Model: " + this.model);
        System.out.println("Color: " + this.color);
        System.out.println("Build Year: " + this.getBuildYear());
        System.out.println("Mileage: " + this.getMileage());
        System.out.println("Current fuel: " + this.getFuel());
        System.out.println("");
    }
    
    public void travel(int distance) {
        int fuelNeededForTravel = this.getConsumption() * distance / 100;
        if (this.getFuel() >= fuelNeededForTravel) {
        // int newMileage = this.getMileage() + distance;
        // this.setMileage(newMileage);
        this.setMileage(this.getMileage() + distance);
//        int spentFuel = this.getConsumption() * distance;
//        int newFuel = this.getFuel() - spentFuel;
//        this.setFuel(newFuel);
        this.setFuel(this.getFuel() - this.getConsumption() * distance / 100);    
        System.out.println("Uspesno je predjen put od: " + distance + " kilometara");
        } else {
            System.out.println("Nema dovoljno goriva za takav put");
        }
        
    }
    
    // public fuelUp(int amountOfFuel)
    // maxFuel (kapacitet reyervoara)
}
