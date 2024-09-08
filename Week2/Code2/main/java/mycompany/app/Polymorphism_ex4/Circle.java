package Week2.Code2.main.java.mycompany.app.Polymorphism_ex4;


public class Circle extends Shape {
    public void draw() { System.out.println("Circle.draw()"); }
    public void erase() { System.out.println("Circle.erase()"); }

    // Ghi đè phương thức printInfo() trong lớp Circle
    @Override
    public void printInfo() {
        System.out.println("Đây là một vòng tròn.");
    }
} ///:~
