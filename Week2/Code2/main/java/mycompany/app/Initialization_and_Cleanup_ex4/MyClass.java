package Week2.Code2.main.java.mycompany.app.Initialization_and_Cleanup_ex4;

public class MyClass {
    //constructor mặc định
    public MyClass() {
        System.out.println("Default constructor called");
    }

    // constructor quá tải
    public MyClass(String message) {
        System.out.println("Overloaded constructor called with message: " + message);
    }

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        // tạo đối tượng của MyClass 
        MyClass obj1 = new MyClass();  // gọi constructor mặc định
          // gọi constructor quá tải
        MyClass obj2 = new MyClass("Hello, this is an overloaded constructor!");
    }
}

