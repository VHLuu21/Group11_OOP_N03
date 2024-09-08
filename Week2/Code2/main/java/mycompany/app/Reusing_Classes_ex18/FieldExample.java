package Week2.Code2.main.java.mycompany.app.Reusing_Classes_ex18;

public class FieldExample {
    // Static final field: Shared among all instances of the class
    public static final int STATIC_FINAL_FIELD = 100;

    // Final field: Unique to each instance of the class
    private final int instanceFinalField;

    // Constructor to initialize the final field
    public FieldExample(int value) {
        this.instanceFinalField = value;
    }

    // Method to demonstrate the use of the fields
    public void displayFields() {
        System.out.println("STATIC_FINAL_FIELD: " + STATIC_FINAL_FIELD);
        System.out.println("instanceFinalField: " + instanceFinalField);
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Create an instance of FieldExample
        FieldExample example1 = new FieldExample(200);
        FieldExample example2 = new FieldExample(300);

        // Display fields for example1
        System.out.println("Example 1:");
        example1.displayFields();

        // Display fields for example2
        System.out.println("Example 2:");
        example2.displayFields();

        // Display static final field using class name
        System.out.println("Access STATIC_FINAL_FIELD using class name: " + FieldExample.STATIC_FINAL_FIELD);
    }
}
