Implement the Classes and Objects in Java. 
// Define the class
class Animal {
    // Properties or attributes of the class
    String name;
    String type;

    // Constructor to initialize the object
    Animal(String name, String type) {
        this.name = name;
        this.type = type;
    }

    // Method or behavior of the class
    void displayInfo() {
        System.out.println("Animal Name: " + name);
        System.out.println("Animal Type: " + type);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        // Create objects of the class
        Animal lion = new Animal("Lion", "Mammal");
        Animal eagle = new Animal("Eagle", "Bird");

        // Call the method using objects
        lion.displayInfo();
        eagle.displayInfo();
    }
}

