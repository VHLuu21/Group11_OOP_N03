package Week2.Code2.main.java.mycompany.app.Initialization_and_Cleanup_ex1;

public class UninitializedStringDemo {
    // Declaring a String reference without initializing it
    private String uninitializedString;

    // Method to demonstrate the uninitialized String reference
    public void showUninitializedString() {
        // Print the value of the uninitialized String reference
        System.out.println("The value of uninitializedString is: " + uninitializedString);
    }

    // Main method to run the demonstration
    public static void main(String[] args) {
        // Create an instance of UninitializedStringDemo
        UninitializedStringDemo demo = new UninitializedStringDemo();
        
        // Call the method to show the value of the uninitialized String
        demo.showUninitializedString();
    }
}

