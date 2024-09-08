package Week2.Code2.main.java.mycompany.app.Polymorphism_ex9;

public class Hamster extends Rodent {
    public Hamster(String name) {
        super(name);
    }

    @Override
    public String makeSound() {
        return "Squeak squeak squeak";
    }

    @Override
    public String eat() {
        return "Eating fruits and vegetables";
    }

    @Override
    public String sleep() {
        return "Sleeping in a cozy house";
    }
}
