/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehicleeee;

/**
 *
 * @author CRUZ_CPE121
 */
public class Truck extends Vehicleeee {
    private double payloadCapacity;

    public Truck(String make, String model, double rentalPrice, double payloadCapacity) {
        super(make, model, rentalPrice);
        this.payloadCapacity = payloadCapacity;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Payload Capacity: " + payloadCapacity + " tons");
    }

    @Override
    public void performMaintenance() {
        System.out.println("Checking payload systems and engine oil for the truck.");
    }

    @Override
    public double calculateDiscountedRentalCost(int days, double discountPercentage) {
        double totalCost = super.calculateDiscountedRentalCost(days, discountPercentage);
        if (days > 3) {
            totalCost *= 0.95; // Additional 5% discount for rentals over 3 days
        }
        return totalCost;
    }
}
