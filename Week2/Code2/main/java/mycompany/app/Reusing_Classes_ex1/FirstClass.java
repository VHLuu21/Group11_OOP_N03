public class FirstClass {
    public FirstClass() {
        System.out.println("FirstClass instance created.");
    }

    public void doSomething() {
        System.out.println("Doing something in FirstClass.");
    }
}

 class SecondClass {
    private FirstClass firstClassInstance;

    // Method to get the FirstClass instance, using lazy initialization
    public FirstClass getFirstClassInstance() {
        if (firstClassInstance == null) {
            System.out.println("Creating FirstClass instance...");
            firstClassInstance = new FirstClass();
        }
        return firstClassInstance;
    }

    public void useFirstClass() {
        // Use the lazily initialized FirstClass instance
        FirstClass instance = getFirstClassInstance();
        instance.doSomething();
    }

    public static void main(String[] args) {
        // Example usage
        SecondClass secondClass = new SecondClass();
        secondClass.useFirstClass();
    }
}
