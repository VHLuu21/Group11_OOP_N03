
// Base class
class Cycle {
    public void ride() {
        System.out.println("Riding a cycle");
    }
}

// Subclass for Unicycle
class Unicycle extends Cycle {
    @Override
    public void ride() {
        System.out.println("Riding a unicycle");
    }
    
    public void balance() {
        System.out.println("Balancing a unicycle");
    }
}

// Subclass for Bicycle
class Bicycle extends Cycle {
    @Override
    public void ride() {
        System.out.println("Riding a bicycle");
    }
    
    public void balance() {
        System.out.println("Balancing a bicycle");
    }
}

// Subclass for Tricycle
class Tricycle extends Cycle {
    @Override
    public void ride() {
        System.out.println("Riding a tricycle");
    }
    
    // No balance method here
}

public class PolymorphismExercise17 {
    // Function to demonstrate upcasting and attempting to call balance
    public static void demonstrateBalance(Cycle[] cycles) {
        for (Cycle cycle : cycles) {
            // Attempt to call the balance method
            if (cycle instanceof Unicycle) {
                ((Unicycle) cycle).balance();
            } else if (cycle instanceof Bicycle) {
                ((Bicycle) cycle).balance();
            } else {
                System.out.println("This cycle does not have a balance method");
            }
        }
    }

    public static void main(String[] args) {
        // Create instances of each subclass
        Unicycle unicycle = new Unicycle();
        Bicycle bicycle = new Bicycle();
        Tricycle tricycle = new Tricycle();

        // Upcast to Cycle and put into an array
        Cycle[] cycleArray = { unicycle, bicycle, tricycle };

        // Demonstrate calling balance method
        demonstrateBalance(cycleArray);
    }
}
