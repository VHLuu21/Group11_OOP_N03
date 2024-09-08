package Week2.Code2.main.java.mycompany.app.Reusing_Classes_ex7;

public class C extends A {
    @SuppressWarnings("unused")
    private B b;

    public C(String NameA, String NameB){

        super(NameA);
        b = new B(NameB);

    }
    
}
