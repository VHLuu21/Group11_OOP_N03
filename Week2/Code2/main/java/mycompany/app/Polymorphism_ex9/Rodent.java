package Week2.Code2.main.java.mycompany.app.Polymorphism_ex9;

public abstract class Rodent {
    protected String name;

    public Rodent(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Common methods
    public abstract String makeSound();
    public abstract String eat();
    public abstract String sleep();
}

