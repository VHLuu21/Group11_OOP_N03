package Week2.Code2.main.java.mycompany.app.Reusing_Classes_ex22;

// Khai báo lớp final
public final class FinalClass {
    public void display() {
        System.out.println("Đây là một lớp final.");
    }
}

/* 
Cố gắng kế thừa từ lớp final
public class SubClass extends FinalClass { // Điều này sẽ gây ra lỗi biên dịch
    public void show() {
        System.out.println("Đây là một lớp con.");
    }
}
*/
