package Week2.Code2.main.java.mycompany.app.Reusing_Classes_ex23;

class SingletonLoader {
    static {
        System.out.println("SingletonLoader class loaded");
    }
}


public class TestSingletonLoader {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        // Load SingletonLoader class the first time
        SingletonLoader instance1 = new SingletonLoader();

        // Load SingletonLoader class again; it should not trigger reloading
        SingletonLoader instance2 = new SingletonLoader();
    }
}
