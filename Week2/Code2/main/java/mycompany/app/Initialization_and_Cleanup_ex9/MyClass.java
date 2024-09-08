package Week2.Code2.main.java.mycompany.app.Initialization_and_Cleanup_ex9;

public class MyClass {
    private int number;
    private String text;

    //constructor đầu tiên
    public MyClass(int num) {
        // Gọi constructor thứ 2 với một giá trị mặc định chô chuỗi
        this(num, "Default String");
        System.out.println("First constructor called with num = " + num);
    }

    //constructor thứ 2
    public MyClass(int num, String str) {
        this.number = num;
        this.text = str;
        System.out.println("Second constructor called with num = " + num + " and str = " + str);
    }

    public void display() {
        System.out.println("Number: " + number + ", Text: " + text);
    }

    public static void main(String[] args) {
        // Tạo đối tượng sử dụng constructor đầu tiên
        MyClass obj1 = new MyClass(42);
        obj1.display();

        // Tạo đối tượng sử dụng constructor thứ 2
        MyClass obj2 = new MyClass(7, "Hello World");
        obj2.display();
    }
}

