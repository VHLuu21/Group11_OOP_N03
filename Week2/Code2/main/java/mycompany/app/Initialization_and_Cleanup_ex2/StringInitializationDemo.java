package Week2.Code2.main.java.mycompany.app.Initialization_and_Cleanup_ex2;

public class StringInitializationDemo {
    // Field initialized at the point of declaration
    private String stringAtDeclaration = "Initialized at declaration";

    // Field initialized by the constructor
    private String stringInConstructor;

    // Constructor that initializes the stringInConstructor field
    public StringInitializationDemo(String initialValue) {
        this.stringInConstructor = initialValue;
    }

    // Method to display the values of both fields
    public void displayValues() {
        System.out.println("stringAtDeclaration: " + stringAtDeclaration);
        System.out.println("stringInConstructor: " + stringInConstructor);
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Create an instance of the class with a constructor parameter
        StringInitializationDemo demo = new StringInitializationDemo("Initialized in constructor");
        
        // Display the values of both fields
        demo.displayValues();
    }
}

