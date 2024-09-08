package Week2.Code2.main.java.mycompany.app.Access_Control_ex4.Ot;


import Week2.Code2.main.java.mycompany.app.Access_Control_ex4.Pr_Cd.Parent;

public class OutsideClass {
    public void accessMethods() {
        Parent parent = new Parent();

        // parent.protectedMethod(); // Dòng này sẽ gây lỗi biên dịch

        /*  Bởi vì protectedMethod() không thể truy cập ở đây (bên ngoài package) trừ khi 
         OutsideClass là lớp kế thừa của Parent.*/

        parent.publicMethod(); // Hoạt động vì publicMethod() là public
    }
}
