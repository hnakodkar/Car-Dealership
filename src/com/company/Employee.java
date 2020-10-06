package com.company;

public class Employee {

    String name;
    Long id;



    public void handleCustomer(Customer customer, Vehicle vehicle, boolean finance){
        if (finance==true){
           double loanAmount = vehicle.getPrice() - customer.getCashOnHand();
            runCreditHistory(customer, 10000,vehicle);
        }
        else if(vehicle.getPrice() <= customer.getCashOnHand()){
            processTransaction(customer, vehicle);
        }
        else{
            System.out.println("Please bring more money to purchase a " + vehicle.getMake());
        }

    }

    public void runCreditHistory(Customer customer, double loanAmount, Vehicle vehicle){
        System.out.println("Ran credit history for " + customer.getName());
        System.out.println( "and " + customer.getName() + " has been approved to purchase " + vehicle);
    }
    public void processTransaction(Customer customer, Vehicle vehicle){
        System.out.println(customer.getName() + " has purchased a " + vehicle + " in Cash.");

    }

}
