// Base class
class Base {
    @SuppressWarnings("unused")
    private int value;

    // Non-default constructor
    public Base(int value) {
        this.value = value;
        System.out.println("Base constructor called with value: " + value);
    }
}

// Derived class
class Derived extends Base {

    // Default constructor
    public Derived() {
        // Call the Base class constructor with a default value
        super(0); // Call Base's non-default constructor with a default value
        System.out.println("Derived default constructor called");
    }

    // Non-default constructor
    public Derived(int value) {
        // Call the Base class constructor with the provided value
        super(value); // Call Base's non-default constructor with the provided value
        System.out.println("Derived non-default constructor called with value: " + value);
    }
}

// Main class to test the constructors
public class Main {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Derived d1 = new Derived();   // Calls the default constructor of Derived
        Derived d2 = new Derived(42); // Calls the non-default constructor of Derived
    }
}
