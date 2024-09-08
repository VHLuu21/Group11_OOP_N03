package Week2.Code2.main.java.mycompany.app.Access_Control_ex6;

public class StringInitializationDemo {
    // Declare a String reference without initializing it
    private String myString;

    public void printString() {
        // Print the value of the String reference
        System.out.println("The value of myString is: " + myString);
    }

    public static void main(String[] args) {
        // Create an instance of StringInitializationDemo
        StringInitializationDemo demo = new StringInitializationDemo();

        // Call the method to print the value of the uninitialized String reference
        demo.printString();
    }
}

