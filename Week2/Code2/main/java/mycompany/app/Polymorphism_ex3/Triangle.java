package Week2.Code2.main.java.mycompany.app.Polymorphism_ex3;


public class Triangle extends Shape {
    public void draw() { System.out.println("Triangle.draw()"); }
    public void erase() { System.out.println("Triangle.erase()"); }

    // Ghi đè phương thức printInfo() trong lớp Triangle
    @Override
    public void printInfo() {
        System.out.println("Đây là một hình tam giác.");
    }
} ///:~
