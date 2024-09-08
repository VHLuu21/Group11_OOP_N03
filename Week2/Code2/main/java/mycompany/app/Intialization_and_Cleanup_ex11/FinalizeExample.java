package Week2.Code2.main.java.mycompany.app.Intialization_and_Cleanup_ex11;

class MyClass {
    // Phương thức dọn dẹp, được gọi trong finalize()
    @SuppressWarnings("removal")
    @Override
    protected void finalize() throws Throwable {
        try {
            System.out.println("finalize() method called: Retrieving object.");
        } finally {
            super.finalize();
        }
    }
    
    // Constructor
    public MyClass() {
        System.out.println("Constructor called: MyClass object created.");
    }
}

public class FinalizeExample {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        // Tạo một đối tượng của MyClass
        MyClass obj = new MyClass();
        
        // Đặt obj thành null, xóa tham chiếu đến đối tượng
        obj = null;
        
        // Gợi ý cho JVM thực hiện thu hồi rác
        System.gc();
        
        // Đợi một thời gian để Garbage Collector có thể thực hiện thu hồi rác
        try {
            Thread.sleep(1000); // Ngủ 1 giây để đảm bảo thu hồi rác có thời gian thực hiện
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
