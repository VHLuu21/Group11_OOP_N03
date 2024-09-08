package Week2.Code2.main.java.mycompany.app.Polymorphism_ex9;

public class Main {
    public static void main(String[] args) {
        // Create an array of Rodent objects
        Rodent[] rodents = {
            new Mouse("Mickey"),
            new Gerbil("Gerby"),
            new Hamster("Hammy")
        };

        // Iterate over the array and call base-class methods
        for (Rodent rodent : rodents) {
            System.out.println(rodent.getName() + " says: " + rodent.makeSound());
            System.out.println(rodent.getName() + " is " + rodent.eat());
            System.out.println(rodent.getName() + " is " + rodent.sleep());
            System.out.println();
        }
    }
}
