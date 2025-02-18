/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehicleeee;

/**
 *
 * @author CRUZ_CPE121
 */
public class RentalSystemTest {
    public static void main(String[] args) {
      
        Vehicleeee[] vehicles = new Vehicleeee[5];

        vehicles[0] = new Car("Toyota", "Camry", 50.0, 4);
        vehicles[1] = new Truck("Ford", "F-150", 80.0, 2.5);
        vehicles[2] = new Motorcycle("Harley-Davidson", "Street 750", 40.0, true);
        vehicles[3] = new ElectricCar("Tesla", "Model S", 150.0, 100.0);
        vehicles[4] = new Truck("Chevrolet", "Silverado", 85.0, 3.0);

     
        for (Vehicleeee v : vehicles) {
            v.displayDetails();
            System.out.println("-----------------------------");
        }

      
        int rentalDays = 5;
        double discount = 10.0;

        System.out.println("Truck Rental Cost for " + rentalDays + " days (after discount): $"
                + vehicles[1].calculateDiscountedRentalCost(rentalDays, discount));
        System.out.println("Electric Car Rental Cost for " + rentalDays + " days (after discount): $"
                + vehicles[3].calculateDiscountedRentalCost(rentalDays, discount));

       
        System.out.println("\nPerforming Maintenance for all vehicles:");
        for (Vehicleeee v : vehicles) {
            v.performMaintenance();
            System.out.println("-----------------------------");
        }
    }
}
