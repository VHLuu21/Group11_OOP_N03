package Week2.Code2.main.java.mycompany.app.Polymorphism_ex9;

public class Mouse extends Rodent {
    public Mouse(String name) {
        super(name);
    }

    @Override
    public String makeSound() {
        return "Squeak squeak";
    }

    @Override
    public String eat() {
        return "Nibbling on cheese";
    }

    @Override
    public String sleep() {
        return "Sleeping in a small nest";
    }
}

