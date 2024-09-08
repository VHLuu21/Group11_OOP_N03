package Week2.Code2.main.java.mycompany.app.Initialization_and_Cleanup_ex7;

public class MyClass {

    // Không định nghĩa constructor nào ở đây; constructor mặc định sẽ được tự động cung cấp.

    // Bạn có thể thêm phương thức hoặc thuộc tính để kiểm tra hành vi, nhưng không có constructor nào được định nghĩa.
    public void displayMessage() {
        System.out.println("Đoi tuong cua MyClass da duoc tao bang constructor mac dinh!");
    }

    public static void main(String[] args) {
        // Tạo một đối tượng của MyClass
        MyClass myObject = new MyClass();
        
        // Gọi phương thức để xác minh rằng đối tượng đã được tạo thành công
        myObject.displayMessage();
    }
}

