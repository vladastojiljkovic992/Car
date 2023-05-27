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
    
    public Main() {
        
    }
    
    public Main(String brand, String model, String color, int buildYear) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.buildYear = buildYear;
    }
    
    public Main(int bulidYear) {
        this.buildYear = bulidYear;
    }
    
    public int getBuildYear() {
        return this.buildYear;
    }
    
    public void printAttributes() {
        System.out.println("Brand: " + this.brand);
        System.out.println("Model: " + this.model);
        System.out.println("Color: " + this.color);
        System.out.println("Build Year: " + this.getBuildYear());
    }
}
