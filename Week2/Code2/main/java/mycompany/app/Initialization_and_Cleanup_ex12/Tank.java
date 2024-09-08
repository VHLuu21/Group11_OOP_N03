package Week2.Code2.main.java.mycompany.app.Initialization_and_Cleanup_ex12;

public class Tank {
    private int capacity; // Dung tích bể
    private int currentLevel; //Mức nước hiện tại trong bể

    // Constructor khởi tạo bể với dung tích cho trước
    public Tank(int capacity) {
        this.capacity = capacity;
        this.currentLevel = 0;
    }

    // Phương thức làm đầy bể
    public void fill(int amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Amount cannot be negative.");
        }
        if (currentLevel + amount > capacity) {
            currentLevel = capacity;
        } else {
            currentLevel += amount;
        }
    }

    // Phương thức xả bể
    public void empty() {
        currentLevel = 0;
    }

    // Phương thức lấy mức nước hiện tại của bể
    public int getCurrentLevel() {
        return currentLevel;
    }

    // Phương thức kiểm tra nếu bể đang trống
    private boolean isEmpty() {
        return currentLevel == 0;
    }


    @SuppressWarnings("removal")
    @Override
    protected void finalize() throws Throwable {
        try {
            if (!isEmpty()) {
                System.err.println("Warning: Tank is not empty during finalization!");
            }
        } finally {
            super.finalize();
        }
    }

    // Main method to test various scenarios
    public static void main(String[] args) {
        // TH1 : Bể được xả đúng cách
        Tank tank1 = new Tank(100);
        tank1.fill(50);
        tank1.empty();  
        tank1 = null;   
        System.gc();    
        // TH2 : Bể không được xả
        Tank tank2 = new Tank(100);
        tank2.fill(80);
        tank2 = null;    
        System.gc();     
        // TH3 : Làm đầy và xả nhiều lần
        Tank tank3 = new Tank(200);
        tank3.fill(100);
        tank3.empty();  
        tank3.fill(50);
        tank3.empty();  
        tank3 = null;   
        System.gc();   
    }
}


