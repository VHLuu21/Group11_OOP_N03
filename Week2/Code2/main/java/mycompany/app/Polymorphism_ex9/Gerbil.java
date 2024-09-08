package Week2.Code2.main.java.mycompany.app.Polymorphism_ex9;

public class Gerbil extends Rodent {
    public Gerbil(String name) {
        super(name);
    }

    @Override
    public String makeSound() {
        return "Chatter chatter";
    }

    @Override
    public String eat() {
        return "Eating grains";
    }

    @Override
    public String sleep() {
        return "Sleeping in a burrow";
    }
}

