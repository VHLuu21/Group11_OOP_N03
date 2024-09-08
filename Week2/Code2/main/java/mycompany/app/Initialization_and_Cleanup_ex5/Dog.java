package Week2.Code2.main.java.mycompany.app.Initialization_and_Cleanup_ex5;

public class Dog {
    
    // Phương thức giả lập tiếng sủa khi không có tham số
    public void bark() {
        System.out.println("Woof! Woof!");
    }
    
    //Phương thức giả lập tiếng sủa với kiểu tham số int (e.g., barking volume)
    public void bark(int volume) {
        System.out.println("Woof! Woof! (Volume: " + volume + ")");
    }
    
    // Phương thức giả lập tiếng sủa với kiểu tham số double (e.g., barking pitch)
    public void bark(double pitch) {
        System.out.println("Woof! Woof! (Pitch: " + pitch + ")");
    }
    
    // Phương thức giả lập tiếng sủa với kiểu tham số boolean (e.g., whether the dog is excited)
    public void bark(boolean excited) {
        if (excited) {
            System.out.println("Woof! Woof! (So excited!)");
        } else {
            System.out.println("Woof... (Calmly)");
        }
    }
    
    // Phương thức giả lập tiếng sủa với kiểu tham số char parameter (e.g., the type of bark)
    public void bark(char type) {
        switch(type) {
            case 'H':
                System.out.println("Howl! Howl!");
                break;
            case 'W':
                System.out.println("Woof! Woof!");
                break;
            case 'R':
                System.out.println("Ruff! Ruff!");
                break;
            default:
                System.out.println("Unknown bark type!");
                break;
        }
    }
    
    public static void main(String[] args) {
        Dog myDog = new Dog();
        
        // Gọi các phiên bản khác nhau của phương thức bark
        myDog.bark();           //Không có tham số
        myDog.bark(5);          //xe Integer 
        myDog.bark(3.14);       //xe Double 
        myDog.bark(true);       //xe Boolean 
        myDog.bark('H');        //xe Char 
    }
}

