package Week2.Code2.main.java.mycompany.app.Intialization_and_Cleanup_ex10;

public class MyClass {

    @SuppressWarnings("removal")
    protected void finalize() throws Throwable {
        System.out.println("finalize() method is called.");
        super.finalize(); // Đảm bảo gọi phương thức finalize của lớp cha
    }

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        // Tạo một đối tượng của MyClass
        MyClass obj = new MyClass();
        
        // Đặt đối tượng thành null
        obj = null;
        
        // Yêu cầu JVM thực hiện thu gom rác
        System.gc();
        
        // Đợi một chút để chắc chắn finalize() được gọi
        try {
            Thread.sleep(500); // Đợi 0.5 giây
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main method finished.");
    }
}
