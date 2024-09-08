package Week2.Code1.main.java.com.mycompany.app;

public class Recursion {
    public int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public void printNumbers(int n) {
        if (n > 0) {
            printNumbers(n - 1);
            System.out.println(n);
        }
    }
}