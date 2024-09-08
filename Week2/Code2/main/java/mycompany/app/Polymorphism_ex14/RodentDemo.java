package Week2.Code2.main.java.mycompany.app.Polymorphism_ex14;

public class RodentDemo {

    // Color class with reference counting
    static class Color {
        private String colorName;
        private int referenceCount;

        public Color(String colorName) {
            this.colorName = colorName;
            this.referenceCount = 1; // Initially, one reference
        }

        public String getColorName() {
            return colorName;
        }

        public void addReference() {
            referenceCount++;
        }

        public void removeReference() {
            referenceCount--;
            if (referenceCount <= 0) {
                // Optional: Clean up if needed
                System.out.println("Color " + colorName + " is no longer referenced.");
            }
        }

        @Override
        public String toString() {
            return colorName;
        }
    }

    // Base class
    static class Rodent {
        String name;
        int age; // Example of a member variable

        // Constructor for Rodent
        public Rodent(String name) {
            System.out.println("Initializing Rodent: " + name);
            this.name = name;
            this.age = 0; // Default age
            System.out.println("Rodent " + name + " initialized with age " + this.age);
        }

        // Method to be overridden
        public String makeSound() {
            return "Some generic rodent sound";
        }

        // Method to be overridden
        public String move() {
            return "The rodent scurries around";
        }

        @Override
        public String toString() {
            return name + " is a rodent";
        }
    }

    // Derived class Mouse
    static class Mouse extends Rodent {
        private Color color; // Shared object

        // Constructor for Mouse
        public Mouse(String name, Color color) {
            super(name); // Call base class constructor
            this.color = color;
            color.addReference(); // Increment reference count
            System.out.println("Initializing Mouse: " + name + " with color " + color);
        }

        @Override
        public String makeSound() {
            return "Squeak! Squeak!";
        }

        @Override
        public String move() {
            return "The mouse darts quickly across the floor";
        }

        @Override
        public String toString() {
            return name + " is a mouse with color " + color;
        }

        // Destructor-like method to handle reference count
        @SuppressWarnings("removal")
        @Override
        protected void finalize() throws Throwable {
            super.finalize();
            color.removeReference(); // Decrement reference count
        }
    }

    // Derived class Gerbil
    static class Gerbil extends Rodent {
        int wheelSize; // Example of a member variable

        // Constructor for Gerbil
        public Gerbil(String name, int wheelSize) {
            super(name); // Call base class constructor
            System.out.println("Initializing Gerbil: " + name);
            this.wheelSize = wheelSize;
            System.out.println("Gerbil " + name + " initialized with wheel size " + this.wheelSize);
        }

        @Override
        public String makeSound() {
            return "Squeak! Squeak! (in a higher pitch)";
        }

        @Override
        public String move() {
            return "The gerbil runs in circles in its wheel";
        }

        @Override
        public String toString() {
            return name + " is a gerbil";
        }
    }

    // Derived class Hamster
    static class Hamster extends Rodent {
        String habitat; // Example of a member variable

        // Constructor for Hamster
        public Hamster(String name, String habitat) {
            super(name); // Call base class constructor
            this.habitat = habitat;
            System.out.println("Initializing Hamster: " + name);
            System.out.println("Hamster " + name + " initialized with habitat " + this.habitat);
        }

        @Override
        public String makeSound() {
            return "Chirp! Chirp!";
        }

        @Override
        public String move() {
            return "The hamster crawls around slowly";
        }

        @Override
        public String toString() {
            return name + " is a hamster";
        }
    }

    public static void main(String[] args) {
        // Create shared Color object
        Color grayColor = new Color("Gray");

        // Create an array of Rodent objects
        Rodent[] rodents = {
            new Mouse("Mickey", grayColor),
            new Mouse("Jerry", grayColor),
            new Gerbil("Gerry", 12),
            new Hamster("Hammy", "Sand")
        };

        // Iterate through the array and call methods
        for (Rodent rodent : rodents) {
            System.out.println(rodent);             // Calls the toString method
            System.out.println(rodent.makeSound()); // Calls the overridden method
            System.out.println(rodent.move());      // Calls the overridden method
            System.out.println();
        }

        // Force garbage collection to see finalize() output
        System.gc();
    }
}
