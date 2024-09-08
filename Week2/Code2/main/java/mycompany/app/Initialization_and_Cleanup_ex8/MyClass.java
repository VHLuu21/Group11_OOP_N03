package Week2.Code2.main.java.mycompany.app.Initialization_and_Cleanup_ex8;

public class MyClass {

    // Phương thức thứ hai sẽ được gọi
    public void methodTwo() {
        System.out.println("Phuong thuc thu 2 duoc goi");
    }

    // Phương thức đầu tiên gọi phương thức thứ hai
    public void methodOne() {
        // Gọi methodTwo thông qua một đối tượng mới của MyClass
        MyClass newInstance = new MyClass();
        newInstance.methodTwo();
        // Gọi methodTwo bằng cách sử dụng 'this'
        this.methodTwo();

        System.out.println("Phuong thuc 1 duoc goi");
    }

    public static void main(String[] args) {
        // Tạo một đối tượng của MyClass
        MyClass obj = new MyClass();
        obj.methodOne();
    }
}
