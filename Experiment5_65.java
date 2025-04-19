// Define the package
package mypackage;

public class Vehicle {
    // Method inside the package
    public void display() {
        System.out.println("This is a Vehicle class inside the mypackage package.");
    }
}

// Import the package
import mypackage.Vehicle;

// Interface declaration
interface Animal {
    void sound();
    void eat();
}

// Base class
class AnimalBase {
    String name;

    public AnimalBase(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println(name + " is eating.");
    }
}

// Derived class using inheritance
class Dog extends AnimalBase implements Animal {
    String breed;

    public Dog(String name, String breed) {
        super(name); // Call superclass constructor
        this.breed = breed;
    }

    // Implementing methods from the interface
    public void sound() {
        System.out.println("Dog says: Woof! Woof!");
    }

    public void eat() {
        System.out.println(name + " is eating bones.");
    }

    // Overloading method
    public void displayInfo() {
        System.out.println("Dog Name: " + name);
        System.out.println("Dog Breed: " + breed);
    }

    public void displayInfo(String food) {
        System.out.println(name + " loves " + food);
    }
}

public class Main {
    public static void main(String[] args) {
        // Using a package
        Vehicle vehicle = new Vehicle();
        vehicle.vehicleInfo();

        // Creating objects and demonstrating inheritance and interface
        Dog dog = new Dog("Buddy", "Golden Retriever");
        dog.sound();
        dog.eat();

        // Calling overloaded methods
        dog.displayInfo();
        dog.displayInfo("bones");
    }
}
