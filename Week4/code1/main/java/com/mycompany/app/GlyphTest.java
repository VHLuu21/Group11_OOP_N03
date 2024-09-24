package Week4.code1.main.java.com.mycompany.app;

abstract class Glyph {
    abstract void draw();
    
    Glyph() {
        System.out.println("Glyph() before draw");
        draw(); // Calls the overridden draw method in RoundGlyph
        System.out.println("Glyph() after draw");
    }
}

class RoundGlyph extends Glyph {
    int radius = 1;
    
    RoundGlyph(int r) {
        radius = r;
        System.out.println("RoundGlyph(), radius=" + radius);
    }
    
    void draw() {
        System.out.println("RoundGlyph.draw(), radius=" + radius);
    }
}
