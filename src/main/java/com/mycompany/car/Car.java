/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.car;

public class Car {

    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        Main audi  = new Main ();
        audi.printAttributes();
        audi.brand = "Audi";
        audi.model = "A4";
        audi.color = "black";
//        audi.buildYear = 2005;
        audi.printAttributes();
        audi.travel(150);
        audi.printAttributes();
        audi.fuelUp(30);
        audi.travel(300);
        
        Main bmv  = new Main ();
        bmv.brand = "bmv";
        bmv.model = "X5";
        bmv.printAttributes();
        
        Main fiat  = new Main(2010);
        
        System.out.println("Godina proizvodnje: " + fiat.getBuildYear());
        
        Main lada = new Main("Lada", "Niva", "green", 2018, 0, 50, 10, 30, 60); 
        lada.printAttributes();
        lada.travel(300);
        lada.printAttributes();
        lada.travel(200);
        lada.printAttributes();
        lada.travel(100);
        lada.printAttributes();
    }
}
