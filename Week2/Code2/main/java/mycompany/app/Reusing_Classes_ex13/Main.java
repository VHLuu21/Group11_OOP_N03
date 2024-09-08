package Week2.Code2.main.java.mycompany.app.Reusing_Classes_ex13;

// Base class with overloaded methods
class BaseClass {

    public void method() {
        System.out.println("BaseClass method with no arguments");
    }

    public void method(int arg1) {
        System.out.println("BaseClass method with one argument: " + arg1);
    }
    public void method(int arg1, int arg2) {
        System.out.println("BaseClass method with one argument: " + arg1 + ", " + arg2);
    }
}

// Derived class that extends BaseClass
class DerivedClass extends BaseClass {
    // Overloaded method in the derived class with three parameters
    public void method(int arg1, int arg2, int arg3) {
        System.out.println("DerivedClass method with three arguments: " + arg1 + ", " + arg2 + ", " + arg3);
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an instance of DerivedClass
        DerivedClass obj = new DerivedClass();

        // Call all versions of the method
        obj.method();           
        obj.method(1); 
        obj.method(1, 2);        
        obj.method(1, 2, 3); 
}
}
