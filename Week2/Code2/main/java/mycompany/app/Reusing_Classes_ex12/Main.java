package Week2.Code2.main.java.mycompany.app.Reusing_Classes_ex12;


// Define Component1
class Component1 {
    public Component1() {
        System.out.println("Component1 created");
    }

    public void dispose() {
        System.out.println("Component1 disposed");
    }
}

// Define Component2
class Component2 {
    public Component2() {
        System.out.println("Component2 created");
    }

    public void dispose() {
        System.out.println("Component2 disposed");
    }
}

// Define Component3
class Component3 {
    public Component3() {
        System.out.println("Component3 created");
    }

    public void dispose() {
        System.out.println("Component3 disposed");
    }
}

// Define Root class containing instances of Component1, Component2, and Component3
class Root {
    protected Component1 comp1;
    protected Component2 comp2;
    protected Component3 comp3;

    public Root() {
        comp1 = new Component1();
        comp2 = new Component2();
        comp3 = new Component3();
        System.out.println("Root created");
    }

    public void dispose() {
        comp1.dispose();
        comp2.dispose();
        comp3.dispose();
        System.out.println("Root disposed");
    }
}

// Define Stem class derived from Root, containing instances of Component1, Component2, and Component3
class Stem extends Root {
    private Component1 comp1;
    private Component2 comp2;
    private Component3 comp3;

    public Stem() {
        super(); // Calls the constructor of Root
        comp1 = new Component1();
        comp2 = new Component2();
        comp3 = new Component3();
        System.out.println("Stem created");
    }

    @Override
    public void dispose() {
        // Dispose of the new components in Stem
        comp1.dispose();
        comp2.dispose();
        comp3.dispose();
        // Call the dispose method of the superclass (Root)
        super.dispose();
        System.out.println("Stem disposed");
    }
}

// Main class to test the classes
public class Main {
    public static void main(String[] args) {
        Stem stem = new Stem();
        stem.dispose(); // Call dispose() to release resources
    }
}
