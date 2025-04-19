// Base class (superclass)
class Animal {
    // Properties of the superclass
    String name;

    // Constructor of the superclass
    Animal(String name) {
        this.name = name;
    }

    // Method of the superclass
    void eat() {
        System.out.println(name + " is eating.");
    }
}

// Derived class (subclass)
class Dog extends Animal {
    // Additional property of the subclass
    String breed;

    // Constructor of the subclass
    Dog(String name, String breed) {
        // Call the constructor of the superclass
        super(name);
        this.breed = breed;
    }

    // Additional method of the subclass
    void bark() {
        System.out.println(name + " is barking.");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        // Create an object of the subclass
        Dog dog = new Dog("Buddy", "Golden Retriever");

        // Access methods from both the superclass and subclass
        dog.eat();  // Method from the superclass
        dog.bark(); // Method from the subclass

        // Access properties from both the superclass and subclass
        System.out.println("Dog's Name: " + dog.name);
        System.out.println("Dog's Breed: " + dog.breed);
    }
}
