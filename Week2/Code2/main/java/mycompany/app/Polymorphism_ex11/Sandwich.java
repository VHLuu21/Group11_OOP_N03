package Week2.Code2.main.java.mycompany.app.Polymorphism_ex11;

//: polymorphism/Sandwich.java
// Order of constructor calls.
class Meal {
    Meal() { System.out.println("Meal()"); }
}

class Bread {
    Bread() { System.out.println("Bread()"); }
}

class Cheese {
    Cheese() { System.out.println("Cheese()"); }
}

class Lettuce {
    Lettuce() { System.out.println("Lettuce()"); }
}

class Pickle {
    Pickle() { System.out.println("Pickle()"); }
}

class Lunch extends Meal {
    Lunch() { System.out.println("Lunch()"); }
}

class PortableLunch extends Lunch {
    PortableLunch() { System.out.println("PortableLunch()"); }
}
@SuppressWarnings("unused")
public class Sandwich extends PortableLunch {
    private Bread b = new Bread();
    private Cheese c = new Cheese();
    private Lettuce l = new Lettuce();
    private Pickle p = new Pickle(); // Added Pickle instance

    public Sandwich() { System.out.println("Sandwich()"); }

    public static void main(String[] args) {
        new Sandwich();
    }
}

