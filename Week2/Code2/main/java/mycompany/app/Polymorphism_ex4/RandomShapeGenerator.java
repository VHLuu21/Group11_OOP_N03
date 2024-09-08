package Week2.Code2.main.java.mycompany.app.Polymorphism_ex4;

import java.util.*;

public class RandomShapeGenerator {
    private Random rand = new Random(47);

    public Shape next() {
        switch (rand.nextInt(4)) { // Thay đổi phạm vi thành 4 để bao gồm Hexagon
            default:
            case 0: return new Circle();
            case 1: return new Square();
            case 2: return new Triangle();
            case 3: return new Hexagon(); // Thêm Hexagon
        }
    }
} 

