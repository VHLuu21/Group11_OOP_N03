package Week2.Code1.main.java.com.mycompany.app;


public class App {
    public static void main(String[] args) {
        // Test Book class
        Book book = new Book("Java Programming", "John Doe", 2022);
        System.out.println(book);

        // Test Time class
        Time time = new Time(12, 30, 45);
        System.out.println(time);

        // Test Recursion class
        Recursion recursion = new Recursion();
        System.out.println("Factorial of 5: " + recursion.factorial(5));
        System.out.println("Counting numbers:");
        recursion.printNumbers(5);

        // Test NNCollection class
        NNCollection<NameNumber> collection = new NNCollection<>();
        collection.addItem(new NameNumber("Luu", 1));
        collection.addItem(new NameNumber("Duc", 2));
        System.out.println("Collection: " + collection);

        // Retrieve an item
        NameNumber item = collection.getItem(0);
        System.out.println("Retrieved item: " + item);

        // Print size of collection
        System.out.println("Collection size: " + collection.size());
    }
}
