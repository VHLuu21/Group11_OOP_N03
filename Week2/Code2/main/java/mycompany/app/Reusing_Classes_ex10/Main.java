package Week2.Code2.main.java.mycompany.app.Reusing_Classes_ex10;

// Component1 class with a non-default constructor
class Component1 {
    @SuppressWarnings("unused")
    private String name;

    public Component1(String name) {
        this.name = name;
        System.out.println("Component1 initialized with name: " + name);
    }
}

// Component2 class with a non-default constructor
class Component2 {
    @SuppressWarnings("unused")
    private int value;

    public Component2(int value) {
        this.value = value;
        System.out.println("Component2 initialized with value: " + value);
    }
}

// Component3 class with a non-default constructor
class Component3 {
    @SuppressWarnings("unused")
    private boolean isActive;

    public Component3(boolean isActive) {
        this.isActive = isActive;
        System.out.println("Component3 initialized with is_active: " + isActive);
    }
}

// Root class containing instances of Component1, Component2, and Component3
class Root {
    protected Component1 component1;
    protected Component2 component2;
    protected Component3 component3;

    public Root(String comp1Name, int comp2Value, boolean comp3IsActive) {
        System.out.println("Root initialized");
        this.component1 = new Component1(comp1Name);
        this.component2 = new Component2(comp2Value);
        this.component3 = new Component3(comp3IsActive);
    }
}

// Stem class extending Root and also containing its own instances of the components
class Stem extends Root {
    public Stem(String comp1Name, int comp2Value, boolean comp3IsActive) {
        super(comp1Name, comp2Value, comp3IsActive); // Call the Root constructor
        System.out.println("Stem initialized");

        this.component1 = new Component1(comp1Name);
        this.component2 = new Component2(comp2Value);
        this.component3 = new Component3(comp3IsActive);
    }
}

// Example usage
public class Main {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Stem stem = new Stem("Component1Name", 42, true);
    }
}

