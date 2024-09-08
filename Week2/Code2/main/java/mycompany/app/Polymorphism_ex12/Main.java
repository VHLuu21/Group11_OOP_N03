package Week2.Code2.main.java.mycompany.app.Polymorphism_ex12;

// Base class
class Rodent {
    String name;
    int age; // Example of a member variable

    // Constructor for Rodent
    public Rodent(String name) {
        System.out.println("Initializing Rodent: " + name);
        this.name = name;
        this.age = 0; // Default age
        System.out.println("Rodent " + name + " initialized with age " + this.age);
    }

    // Method to be overridden
    public String makeSound() {
        return "Some generic rodent sound";
    }

    // Method to be overridden
    public String move() {
        return "The rodent scurries around";
    }

    @Override
    public String toString() {
        return name + " is a rodent";
    }
}

// Derived class Mouse
class Mouse extends Rodent {
    String color; // Example of a member variable

    // Constructor for Mouse
    public Mouse(String name, String color) {
        super(name); // Call base class constructor
        System.out.println("Initializing Mouse: " + name);
        this.color = color;
        System.out.println("Mouse " + name + " initialized with color " + this.color);
    }

    @Override
    public String makeSound() {
        return "Squeak! Squeak!";
    }

    @Override
    public String move() {
        return "The mouse darts quickly across the floor";
    }

    @Override
    public String toString() {
        return name + " is a mouse";
    }
}

// Derived class Gerbil
class Gerbil extends Rodent {
    int wheelSize; // Example of a member variable

    // Constructor for Gerbil
    public Gerbil(String name, int wheelSize) {
        super(name); // Call base class constructor
        System.out.println("Initializing Gerbil: " + name);
        this.wheelSize = wheelSize;
        System.out.println("Gerbil " + name + " initialized with wheel size " + this.wheelSize);
    }

    @Override
    public String makeSound() {
        return "Squeak! Squeak! (in a higher pitch)";
    }

    @Override
    public String move() {
        return "The gerbil runs in circles in its wheel";
    }

    @Override
    public String toString() {
        return name + " is a gerbil";
    }
}

// Derived class Hamster
class Hamster extends Rodent {
    String habitat; // Example of a member variable

    // Constructor for Hamster
    public Hamster(String name, String habitat) {
        super(name); // Call base class constructor
        System.out.println("Initializing Hamster: " + name);
        this.habitat = habitat;
        System.out.println("Hamster " + name + " initialized with habitat " + this.habitat);
    }

    @Override
    public String makeSound() {
        return "Chirp! Chirp!";
    }

    @Override
    public String move() {
        return "The hamster crawls around slowly";
    }

    @Override
    public String toString() {
        return name + " is a hamster";
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an array of Rodent objects
        Rodent[] rodents = {
            new Mouse("Mickey", "Gray"),
            new Gerbil("Gerry", 12),
            new Hamster("Hammy", "Sand")
        };

        // Iterate through the array and call methods
        for (Rodent rodent : rodents) {
            System.out.println(rodent);             // Calls the toString method
            System.out.println(rodent.makeSound()); // Calls the overridden method
            System.out.println(rodent.move());      // Calls the overridden method
            System.out.println();
        }
    }
}

