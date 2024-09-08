package Week2.Code2.main.java.mycompany.app.Reusing_Classes_ex19;

class Example {
    // Blank final reference to an object
    private final String message;

    // Constructor that initializes the blank final reference
    public Example(String message) {
        this.message = message;
    }

    // Method to display the message
    public void displayMessage() {
        System.out.println("Message: " + message);
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Create instances of Example with different messages
        Example example1 = new Example("Hello, World!");
        Example example2 = new Example("Java is fun!");

        // Display messages
        example1.displayMessage();
        example2.displayMessage();

    }
}
