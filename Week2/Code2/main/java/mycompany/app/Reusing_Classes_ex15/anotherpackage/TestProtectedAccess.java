package Week2.Code2.main.java.mycompany.app.Reusing_Classes_ex15.anotherpackage;

import Week2.Code2.main.java.mycompany.app.Reusing_Classes_ex15.Mypackage.BaseClass;

public class TestProtectedAccess {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        BaseClass base = new BaseClass();
        // Attempt to call the protected method
        // base.protectedMethod(); // This line will cause a compilation error
    }
}

