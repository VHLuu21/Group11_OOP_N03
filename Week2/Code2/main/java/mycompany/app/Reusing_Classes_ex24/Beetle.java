package Week2.Code2.main.java.mycompany.app.Reusing_Classes_ex24;

//: reusing/Beetle.java
// The full process of initialization.

class Insect {
    private int i = 9;
    protected int j;
    Insect() {
        System.out.println("i = " + i + ", j = " + j);
        j = 39;
    }
    @SuppressWarnings("unused")
    private static int x1 = printInit("static Insect.x1 initialized");
    static int printInit(String s) {
        System.out.println(s);
        return 47;
    }
}

public class Beetle extends Insect {
    private int k = printInit("Beetle.k initialized");

    public Beetle() {
        System.out.println("k = " + k);
        System.out.println("j = " + j);
    }

    @SuppressWarnings("unused")
    private static int x2 = printInit("static Beetle.x2 initialized");

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        System.out.println("Beetle constructor");
        Beetle b = new Beetle();
    }
}

