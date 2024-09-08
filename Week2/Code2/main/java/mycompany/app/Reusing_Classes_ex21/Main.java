package Week2.Code2.main.java.mycompany.app.Reusing_Classes_ex21;

// Định nghĩa một lớp cơ sở với một phương thức final
class Base {
    // Phương thức final không thể bị ghi đè
    public final void finalMethod() {
        System.out.println("Base finalMethod");
    }
}

// Định nghĩa một lớp dẫn xuất cố gắng ghi đè phương thức final
class Derived extends Base {
    // Cố gắng ghi đè phương thức final sẽ gây lỗi biên dịch
    // Việc mở dòng sau sẽ gây lỗi biên dịch
    /*
    @Override
    public void finalMethod() {
        System.out.println("Derived finalMethod");
    }
    */
}

public class Main {
    public static void main(String[] args) {
        Base base = new Derived();
        base.finalMethod(); // Gọi phương thức finalMethod từ lớp Base
    }
}

