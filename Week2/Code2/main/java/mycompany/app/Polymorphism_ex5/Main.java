package Week2.Code2.main.java.mycompany.app.Polymorphism_ex5;

// Base class Cycle
abstract class Cycle {
    // Abstract method that must be overridden in subclasses
    public abstract String ride();

    // Abstract method to return the number of wheels
    public abstract int wheels();
}

// Subclass Unicycle
class Unicycle extends Cycle {
    @Override
    public String ride() {
        return "Riding a unicycle with " + wheels() + " wheel";
    }

    @Override
    public int wheels() {
        return 1;
    }
}

// Subclass Bicycle
class Bicycle extends Cycle {
    @Override
    public String ride() {
        return "Riding a bicycle with " + wheels() + " wheels";
    }

    @Override
    public int wheels() {
        return 2;
    }
}

// Subclass Tricycle
class Tricycle extends Cycle {
    @Override
    public String ride() {
        return "Riding a tricycle with " + wheels() + " wheels";
    }

    @Override
    public int wheels() {
        return 3;
    }
}

// Main class to demonstrate upcasting and polymorphism
public class Main {
    public static void main(String[] args) {
        // Create instances of each type
        Cycle unicycle = new Unicycle();
        Cycle bicycle = new Bicycle();
        Cycle tricycle = new Tricycle();
        
        // Demonstrate upcasting and polymorphism
        demonstrateRide(unicycle);  // Output: Riding a unicycle with 1 wheel
        demonstrateRide(bicycle);   // Output: Riding a bicycle with 2 wheels
        demonstrateRide(tricycle);  // Output: Riding a tricycle with 3 wheels
    }
    
    // Function to demonstrate upcasting and polymorphism
    public static void demonstrateRide(Cycle cycle) {
        System.out.println(cycle.ride());
    }
}

