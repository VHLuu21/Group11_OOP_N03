package Week2.Code2.main.java.mycompany.app.Reusing_Classes_ex24;

//: reusing/RhinocerosBeetle.java
// Inheriting from Beetle and adding more specific initialization.

@SuppressWarnings("unused")
public class RhinocerosBeetle extends Beetle {
    private int z = printInit("RhinocerosBeetle.z initialized");

    public RhinocerosBeetle() {
        System.out.println("z = " + z);
    }

    private static int x3 = printInit("static RhinocerosBeetle.x3 initialized");

    public static void main(String[] args) {
        System.out.println("RhinocerosBeetle constructor");
        RhinocerosBeetle rb = new RhinocerosBeetle();
    }
}
