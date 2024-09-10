package Bai2;

public class DiscreteSignal implements Signal {
    public double amplitude; // Hệ số A
    public int impulsePosition; // Vị trí xung đơn vị k

    // Constructor để khởi tạo tín hiệu với hệ số và vị trí xung
    public DiscreteSignal(double amplitude, int impulsePosition) {
        this.amplitude = amplitude;
        this.impulsePosition = impulsePosition;
    }

    // Hàm đơn vị gamma(n) theo định nghĩa
    public int gamma(int n) {
        if(n == 0){
            return 1;
        }else{
            return 0;
        }
    }
    public double getValueAt(int n) {
        // Sử dụng hàm delta để tính giá trị của tín hiệu
        return amplitude * gamma(n);
    }
@Override
    public double getValueAt(double time) {
        int discreteTime = (int) time;
        return amplitude * gamma(discreteTime - impulsePosition);
    }
}

