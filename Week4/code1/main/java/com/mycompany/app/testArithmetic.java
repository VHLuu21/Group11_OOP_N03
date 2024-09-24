package Week4.code1.main.java.com.mycompany.app;

class Node {
    public Node() {}
    public double eval() {
    System.out.println("Error: eval Node");
    return 0;
    }
   }
class Binop extends Node {
    protected Node lChild, rChild;
    public Binop(Node l, Node r) {
    lChild = l; 
   rChild = r;
    }
}

class Plus extends Binop {
    public Plus(Node l, Node r) {
    super(l, r);// l, r of Binop
    }
    public double eval() {
    return lChild.eval() + rChild.eval(); //protected Note can
    //Accessed by subclass
    }
   }
class Const extends Node {
    private double value;
    public Const(double d) {
        value = d;
    }
    public double eval(){ 
        return value;
    }
}

public class testArithmetic {
    // evaluate 1.1 + 2.2 + 3.3
    public static void main(String[] args) {
    Node n = new Plus(
    new Plus(
    new Const(1.1), new Const(2.2)),
    new Const(3.3));
    System.out.println(""+ n.eval());
    }
}