package Week2.Code2.main.java.mycompany.app.Reusing_Classes_ex15.anotherpackage;

import Week2.Code2.main.java.mycompany.app.Reusing_Classes_ex15.Mypackage.BaseClass;

public class DerivedClass extends BaseClass {
    public void callProtectedMethod() {
        protectedMethod(); // This is allowed
    }
    
    public static void main(String[] args) {
        DerivedClass derived = new DerivedClass();
        derived.callProtectedMethod(); // This will call the protected method
    }
}

