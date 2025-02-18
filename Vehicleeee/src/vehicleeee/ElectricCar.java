package vehicleeee;

/**
 *
 * @author CRUZ_CPE121
 */
public class ElectricCar extends Vehicleeee {
    private double batteryCapacity;

    public ElectricCar(String make, String model, double rentalPrice, double batteryCapacity) {
        super(make, model, rentalPrice);
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
    }

    @Override
    public void performMaintenance() {
        System.out.println("Checking battery health and charging system for the electric car.");
    }

    public void displayBatteryInfo() {
        System.out.println("This electric car has a battery capacity of " + batteryCapacity + " kWh.");
    }
}
