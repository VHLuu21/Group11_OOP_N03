package Bai1;

interface Signal{
    public void Xsignal();
}
class DiscreteSignal implements Signal{
    public void Xsignal(){
        System.out.println("Thong tin tin hieu Discrete");
        System.out.println("    Bien do: A \n    Tinh thuong xuyen: t\n    Chu ky: N\n    Buoc song: lamda");
    }
}

class ContinuousSignal implements Signal{
    public void Xsignal(){
        System.out.println("\nThong tin tin hieu Continuous");
        System.out.println("    Bien do: A \n    Tinh thuong xuyen: t\n    Chu ky: N\n    Buoc song: lamda");
    }

}
public class Main {
    public static void main(String[] args){
        DiscreteSignal obj1 = new DiscreteSignal();
        ContinuousSignal obj2 = new ContinuousSignal();

        obj1.Xsignal();
        obj2.Xsignal();
    }
}
