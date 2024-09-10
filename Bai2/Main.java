package Bai2;

public class Main {
    public static void main(String[] args){

    DiscreteSignal obj1 = new DiscreteSignal(10, 3);
    double Xn = obj1.getValueAt(4);
        System.out.println("Tin hieu roi rac: "+ Xn);

    Radar obj2 = new Radar();
    double XN = obj2.Analyze(4);
        System.out.println("Phan tich tin hieu: "+ XN);
    }
}
