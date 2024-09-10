public class Radar {
    private DiscreteSignal signal;
    // Constructor nhận một đối tượng DiscreteSignal
    public Radar(DiscreteSignal signal) {
        this.signal = signal;
    }
    // Phương thức để tính giá trị tín hiệu X(n)
    public double calculateSignalValue(int n) {
        // Kiểm tra n
        if (n >= 0 && n <= 15) {
            return 1 - (double) n / 15;
        } else {
            return 0;
        }
    }
    // Phương thức để hiển thị giá trị tín hiệu cho n đã cho
    public void displaySignalValue(int n) {
        System.out.printf("X(%d) = %.4f%n", n, calculateSignalValue(n));
    }

    public static void main(String[] args) {
        // Tạo đối tượng DiscreteSignal
        DiscreteSignal discreteSignal = new DiscreteSignal(1.0, 1000.0, 0.001, 0.3);
        // Tạo đối tượng Radar với DiscreteSignal
        Radar radar = new Radar(discreteSignal);    
        // Tính và hiển thị giá trị tín hiệu cho n = 4
        radar.displaySignalValue(4);
    }
}
