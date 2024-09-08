package Week2.Code2.main.java.mycompany.app.Polymorphism_ex4;

public class Square extends Shape {
    public void draw() { System.out.println("Square.draw()"); }
    public void erase() { System.out.println("Square.erase()"); }

    // Ghi đè phương thức printInfo() trong lớp Square
    @Override
    public void printInfo() {
        System.out.println("Đây là một hình vuông.");
    }
} ///:~

