package Week2.Code2.main.java.mycompany.app.Access_Control_ex1;

import Week2.Code2.main.java.mycompany.app.Access_Control_ex1.My_class1.Myclass;


public class Main {
    public static void main(String[] args) {
        // Tạo instance của Myclass
        Myclass myclassInstance = new Myclass("Xin chao tu Myclass!");

        // Sử dụng instance
        System.out.println(myclassInstance);
        System.out.println("Thong điep: " + myclassInstance.getMessage());

        // Thay đổi thông điệp
        myclassInstance.setMessage("Thong điep moi");
        System.out.println("Thong điep da cap nhat: " + myclassInstance.getMessage());
    }
}
