package Week2.Code2.main.java.mycompany.app.Access_Control_ex4.Pr_Cd;


public class Child extends Parent {
    public void accessMethods() {
        // Truy cập phương thức protected
        protectedMethod(); // Hoạt động vì Child nằm trong cùng package với Parent

        // Truy cập phương thức public
        publicMethod(); // Hoạt động vì phương thức này là public
    }
}
