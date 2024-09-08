package Week2.Code2.main.java.mycompany.app.Reusing_Classes_ex9;

// Define Component1
class Component1 {
    public Component1() {
        System.out.println("Component1 created");
    }
}

// Define Component2
class Component2 {
    public Component2() {
        System.out.println("Component2 created");
    }
}

// Define Component3
class Component3 {
    public Component3() {
        System.out.println("Component3 created");
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
}
@SuppressWarnings("unused")
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
}
@SuppressWarnings("unused")
// Main class to test the classes
public class Main {
    public static void main(String[] args) {
        Stem stem = new Stem();
    }
}

