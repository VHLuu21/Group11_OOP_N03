package Week4.code1.main.java.com.mycompany.app;

public class App {
    public static void main(String[] args){
        System.out.println("This is DisruptLecture!");
        CellPhone noiseMaker = new CellPhone();
        ObnoxiousTune ot = new ObnoxiousTune();
        noiseMaker.ring(ot);
        
        System.out.println("\nThis is GlyphTest !");
        new RoundGlyph(5);

        System.out.println("\nThis is testArithmetic !");
        Node n = new Plus(
        new Plus(
        new Const(1.1), new Const(2.2)),
        new Const(3.3));
        System.out.println(""+ n.eval());

        System.out.println("\nThis is Transmogrify !");
        Stage s = new Stage();
        s.go();
        s.change();
        s.go();
    }
}
