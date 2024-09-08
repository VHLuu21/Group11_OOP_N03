package Week2.Code2.main.java.mycompany.app.Reusing_Classes_ex17;


// Base class
class Amphibian {
    // Method to simulate breathing
    public void breathe() {
        System.out.println("Amphibian is breathing.");
    }

    // Method to simulate movement
    public void move() {
        System.out.println("Amphibian is moving.");
    }

    // Method to simulate sound
    public void sound() {
        System.out.println("Amphibian makes a sound.");
    }
}

// Derived class
class Frog extends Amphibian {
    // Override the breathe method
    @Override
    public void breathe() {
        System.out.println("Frog is breathing through its skin.");
    }

    // Override the move method
    @Override
    public void move() {
        System.out.println("Frog is hopping.");
    }

    // Override the sound method
    @Override
    public void sound() {
        System.out.println("Frog croaks.");
    }

    // Method specific to Frog
    public void jump() {
        System.out.println("Frog is jumping.");
    }
}

// Main class to demonstrate polymorphism
public class Main {
    public static void main(String[] args) {
        // Create an instance of Frog
        Frog frog = new Frog();

        Amphibian amphibian = frog;

        // Demonstrate that all overridden methods still work
        amphibian.breathe();  // Calls the overridden method in Frog
        amphibian.move();     // Calls the overridden method in Frog
        amphibian.sound();    // Calls the overridden method in Frog

    }
}
