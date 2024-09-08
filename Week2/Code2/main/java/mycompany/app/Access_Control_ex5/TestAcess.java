package Week2.Code2.main.java.mycompany.app.Access_Control_ex5;

public class TestAcess {
    public static void main(String[] args){
        AcessModifiers obj = new AcessModifiers();

            // Truy cập trường và phương thức public
            System.out.println("Truong public: " + obj.PublicField);
            obj.publicMethod();

            // Truy cập trường và phương thức protected
            System.out.println("Trường protected: " + obj.ProtecField);
            obj.protectedMethod();

            // Truy cập trường và phương thức default
            System.out.println("Truong default: " + obj.DefaultField);
            obj.defaultMethod();
    }
    
}
