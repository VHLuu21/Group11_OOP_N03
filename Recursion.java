public class Recursion {
    public int factorial(int n) {
        if (n == 0) {
            return 1; 
        } else {
            return n * factorial(n - 1);
        }
    }
    public int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2); 
        }
    }

    public static void main(String[] args) {
        Recursion recursion = new Recursion();

        int fact = recursion.factorial(5);
        System.out.println("Factorial of 5 is: " + fact);
        int fib = recursion.fibonacci(7);
        System.out.println("7th Fibonacci number is: " + fib);
    }
}
