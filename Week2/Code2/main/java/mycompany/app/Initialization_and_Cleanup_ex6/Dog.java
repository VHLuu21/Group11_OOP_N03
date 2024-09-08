package Week2.Code2.main.java.mycompany.app.Initialization_and_Cleanup_ex6;

public class Dog {

    // Phương thức để giả lập tiếng sủa khi không có tham số
    public void bark() {
        System.out.println("Gau! Gau!");
    }

    // Phương thức để giả lập tiếng sủa với tham số kiểu int (ví dụ: âm lượng sủa)
    public void bark(int volume) {
        System.out.println("Gau! Gau! (Am luong: " + volume + ")");
    }

    // Phương thức để giả lập tiếng sủa với tham số kiểu double (ví dụ: cao độ sủa)
    public void bark(double pitch) {
        System.out.println("Gau! Gau! (Cao đo: " + pitch + ")");
    }

    // Phương thức để giả lập tiếng sủa với tham số kiểu boolean (ví dụ: chó có phấn khích không)
    public void bark(boolean excited) {
        if (excited) {
            System.out.println("Gsu! Gsu! (Rat phan khich!)");
        } else {
            System.out.println("Gsu... (Điem tinh)");
        }
    }

    // Phương thức để giả lập tiếng sủa với tham số kiểu char (ví dụ: loại tiếng sủa)
    public void bark(char type) {
        switch (type) {
            case 'H':
                System.out.println("Rit! Rit!");
                break;
            case 'W':
                System.out.println("Gau! Gau!");
                break;
            case 'R':
                System.out.println("Gau! Gau!");
                break;
            default:
                System.out.println("Loai sua khong xac đinh!");
                break;
        }
    }

    // Phương thức overloaded với hai tham số: int và double
    public void bark(int volume, double pitch) {
        System.out.println("Gau! Gau! (am luong: " + volume + ", Cao đo: " + pitch + ")");
    }

    // Phương thức overloaded với hai tham số: double và int
    public void bark(double pitch, int volume) {
        System.out.println("Gau! Gau! (Cao đo: " + pitch + ", Am lượng: " + volume + ")");
    }

    public static void main(String[] args) {
        Dog myDog = new Dog();

        // Gọi các phiên bản khác nhau của phương thức bark
        myDog.bark();                   // Không có tham số
        myDog.bark(5);                  // Tham số kiểu int
        myDog.bark(3.14);               // Tham số kiểu double
        myDog.bark(true);               // Tham số kiểu boolean
        myDog.bark('H');                // Tham số kiểu char
        myDog.bark(5, 3.14);            // Tham số kiểu int và double
        myDog.bark(3.14, 5);            // Tham số kiểu double và int
    }
}
