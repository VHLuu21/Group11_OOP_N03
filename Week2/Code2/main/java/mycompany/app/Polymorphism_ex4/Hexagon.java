package Week2.Code2.main.java.mycompany.app.Polymorphism_ex4;

public class Hexagon extends Shape {
    public void draw() { System.out.println("Hexagon.draw()"); }
    public void erase() { System.out.println("Hexagon.erase()"); }

    // Tùy chọn ghi đè phương thức printInfo() nếu cần
    @Override
    public void printInfo() {
        System.out.println("Đây là một hình lục giác.");
    }
} ///:~

