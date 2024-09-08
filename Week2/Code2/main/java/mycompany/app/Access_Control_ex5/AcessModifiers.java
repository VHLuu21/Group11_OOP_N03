package Week2.Code2.main.java.mycompany.app.Access_Control_ex5;

public class AcessModifiers {
    //Trường public
    public int PublicField = 1;
    
    //Trường Protected
    protected int ProtecField = 2;

     // Trường riêng tư
    // private int PrivateField = 3;

    //Trường Default
    int DefaultField = 4;

    // Phuong thuc public
    public void publicMethod() {
        System.out.println("Phuong thuc public");
    }

    // Phuong thuc protected
    public void protectedMethod() {
        System.out.println("Phuong thuc protected");
    }

    // Phuong thuc private
    public void privateMethod() {
        System.out.println("Phuong thuc private");
    }

    // Phuong thuc default
    public void defaultMethod() {
        System.out.println("Phuong thuc default");
    }


}
