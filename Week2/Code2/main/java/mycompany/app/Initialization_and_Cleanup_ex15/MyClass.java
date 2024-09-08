package Week2.Code2.main.java.mycompany.app.Initialization_and_Cleanup_ex15;

public class MyClass {

    private String myString;

    // Khối khởi tạo instance
    {
        myString = "Initialized using instance intializer";
    }

    // Constructor
    public MyClass() {

    }

    // Phương thức getter cho biến myString
    public String getMyString() {
        return myString;
    }

    // Phương thức main để kiểm tra lớp
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        System.out.println(obj.getMyString()); // Kết quả: Được khởi tạo bằng khối khởi tạo instance
    }
}
