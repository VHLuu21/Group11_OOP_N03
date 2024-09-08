package Week2.Code2.main.java.mycompany.app.Polymorphism_ex1;

// Base class Cycle
abstract class Cycle {
    // Abstract method that must be overridden in subclasses
    public abstract String ride();
}

// Subclass Unicycle
class Unicycle extends Cycle {
    @Override
    public String ride() {
        return "Riding a unicycle";
    }
}

// Subclass Bicycle
class Bicycle extends Cycle {
    @Override
    public String ride() {
        return "Riding a bicycle";
    }
}

// Subclass Tricycle
class Tricycle extends Cycle {
    @Override
    public String ride() {
        return "Riding a tricycle";
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
        demonstrateRide(unicycle);  // Output: Riding a unicycle
        demonstrateRide(bicycle);   // Output: Riding a bicycle
        demonstrateRide(tricycle);  // Output: Riding a tricycle
    }
    
    // Function to demonstrate upcasting and polymorphism
    public static void demonstrateRide(Cycle cycle) {
        System.out.println(cycle.ride());
    }
}
