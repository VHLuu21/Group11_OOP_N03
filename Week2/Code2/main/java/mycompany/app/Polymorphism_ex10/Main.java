package Week2.Code2.main.java.mycompany.app.Polymorphism_ex10;

// Base class definition
class Base {
    // First method that calls the second method
    public void firstMethod() {
        System.out.println("Base: Calling secondMethod");
        secondMethod(); // Calls the second method
    }

    // Second method
    public void secondMethod() {
        System.out.println("Base: secondMethod");
    }
}

// Derived class definition
class Derived extends Base {
    // Override the second method
    @Override
    public void secondMethod() {
        System.out.println("Derived: secondMethod");
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an object of the Derived class
        Base baseObj = new Derived(); // Upcast to Base type

        // Call the first method
        baseObj.firstMethod();
    }
}
