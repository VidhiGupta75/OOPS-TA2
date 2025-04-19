// Class definition
class Vehicle {
    // Attributes
    String type;
    int wheels;

    // Default constructor
    Vehicle() {
        this.type = "Unknown";
        this.wheels = 0;
        System.out.println("Default constructor invoked.");
    }

    // Parameterized constructor
    Vehicle(String type, int wheels) {
        this.type = type;
        this.wheels = wheels;
        System.out.println("Parameterized constructor invoked.");
    }

    // Method overloading - Different variants of the method
    void displayInfo() {
        System.out.println("Vehicle Type: " + type);
        System.out.println("Number of Wheels: " + wheels);
    }

    void displayInfo(String fuelType) {
        System.out.println("Vehicle Type: " + type);
        System.out.println("Number of Wheels: " + wheels);
        System.out.println("Fuel Type: " + fuelType);
    }

    // Simulated destructor (Java does not have explicit destructors)
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Vehicle object is being cleaned up.");
        super.finalize();
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        // Using the default constructor
        Vehicle vehicle1 = new Vehicle();
        vehicle1.displayInfo();

        // Using the parameterized constructor
        Vehicle vehicle2 = new Vehicle("Car", 4);
        vehicle2.displayInfo("Petrol");

        // Nullifying the objects to simulate cleanup (optional in Java)
        vehicle1 = null;
        vehicle2 = null;

        // Requesting garbage collection explicitly
        System.gc();
    }
}

