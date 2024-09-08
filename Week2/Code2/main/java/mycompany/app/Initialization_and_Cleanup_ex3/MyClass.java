package Week2.Code2.main.java.mycompany.app.Initialization_and_Cleanup_ex3;

public class MyClass {
    public MyClass() {
        System.out.println("Default constructor called");
    }
@SuppressWarnings("unused")
    public static void main(String[] args) {
        // Creating an object of MyClass

        MyClass obj = new MyClass();
    }
}
