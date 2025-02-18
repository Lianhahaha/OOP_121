/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vehicleeee;

/**
 *
 * @author CRUZ_CPE121
 */
public abstract class Vehicleeee {
    protected String make;
    protected String model;
    protected double rentalPrice;

    public Vehicleeee(String make, String model, double rentalPrice) {
        this.make = make;
        this.model = model;
        this.rentalPrice = rentalPrice;
    }

    public void displayDetails() {
        System.out.println("Vehicle Details:");
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Rental Price per Day: $" + rentalPrice);
    }

    public double calculateRentalCost(int days) {
        return rentalPrice * days;
    }

    public double calculateDiscountedRentalCost(int days, double discountPercentage) {
        double totalCost = rentalPrice * days;
        return totalCost * (1 - discountPercentage / 100);
    }

    public abstract void performMaintenance();
}
