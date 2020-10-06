package com.company;

public class Dealership {

    public static void main(String[] args) {


        Customer customer1 = new Customer("Tom","123 river rd",12000);
        Customer customer2 = new Customer("Julie","104 main st",10000);
        Customer customer3 = new Customer("Jennifer","148 castle ave",40000);
        Customer customer4 = new Customer("Mark","170 side lane", 25000);


        Employee emp1 = new Employee();
        Employee emp2 = new Employee();
        Employee emp3 = new Employee();
        Employee emp4 = new Employee();

        Vehicle vehicle1 = new Vehicle("Honda","Pilot",40000.00);
        Vehicle vehicle2 = new Vehicle("Jeep","Wrangler",25000.00);
        Vehicle vehicle3 = new Vehicle("Nissan", "Sentra",12000);


        customer1.purchaseCar(vehicle3,emp1,false);
        customer3.purchaseCar(vehicle1,emp2,false);
        customer2.purchaseCar(vehicle3,emp3,true);
        customer4.purchaseCar(vehicle1,emp4,true);


    }


}