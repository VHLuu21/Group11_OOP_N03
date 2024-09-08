package Week2.Code2.main.java.mycompany.app.Polymorphism_ex3;

public class Shapes {
    private static RandomShapeGenerator gen = new RandomShapeGenerator();

    public static void main(String[] args) {
        Shape[] s = new Shape[9];
        // Điền vào mảng với các hình:
        for (int i = 0; i < s.length; i++)
            s[i] = gen.next();
        
        // Thực hiện các cuộc gọi phương thức đa hình:
        for (Shape shp : s) {
            shp.draw();
            shp.printInfo();  // Gọi phương thức mới
        }
    }
}
