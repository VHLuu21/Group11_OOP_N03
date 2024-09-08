// Base class
class Amphibian {

    public void breathe() {
        System.out.println("Amphibian is breathing.");
    }


    public void move() {
        System.out.println("Amphibian is moving.");
    }


    public void sound() {
        System.out.println("Amphibian makes a sound.");
    }
}

// Derived class
class Frog extends Amphibian {
    // Method to simulate jumping
    public void jump() {
        System.out.println("Frog is jumping.");
    }

    public void sound() {
        System.out.println("Frog croaks.");
    }
}

// Main class to demonstrate polymorphism
public class Main {
    public static void main(String[] args) {
        // Create an instance of Frog
        Frog frog = new Frog();

        Amphibian amphibian = frog;

        amphibian.breathe();  // Inherited from Amphibian
        amphibian.move();     // Inherited from Amphibian
        amphibian.sound();    // Overridden method in Frog
    }
}
