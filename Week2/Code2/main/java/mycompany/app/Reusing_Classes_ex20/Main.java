package Week2.Code2.main.java.mycompany.app.Reusing_Classes_ex20;

@SuppressWarnings("unused")
class Base {
    private void privateMethod() {
        System.out.println("Base private method");
    }

    public void publicMethod() {
        System.out.println("Base public method");
    }
}

@SuppressWarnings("unused")
class Derived extends Base {
    // Phương thức này không ghi đè bất kỳ phương thức nào từ lớp cơ sở
    // Nó chỉ ẩn phương thức private từ lớp Base
    private void privateMethod() {
        System.out.println("Derived private method");
    }

    // Phương thức này được định nghĩa để ghi đè phương thức public từ lớp cơ sở
    @Override
    public void publicMethod() {
        System.out.println("Derived public method");
    }
}

public class Main {
    public static void main(String[] args) {
        Base base = new Derived();
        base.publicMethod(); // Sẽ gọi phương thức publicMethod của Derived

        // base.privateMethod(); // Dòng này sẽ gây lỗi biên dịch
    }
}

