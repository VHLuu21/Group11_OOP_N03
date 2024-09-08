package Week2.Code2.main.java.mycompany.app.Polymorphism_ex16;

// Define the AlertStatus interface with a method that will be used by Starship
interface AlertStatus {
    void alert();
}

// Implement different states of the AlertStatus
class RedAlert implements AlertStatus {
    public void alert() {
        System.out.println("Red Alert: All systems are at maximum readiness!");
    }
}

class YellowAlert implements AlertStatus {
    public void alert() {
        System.out.println("Yellow Alert: Caution, stay alert!");
    }
}

class GreenAlert implements AlertStatus {
    public void alert() {
        System.out.println("Green Alert: All systems are functioning normally.");
    }
}

// Define the Starship class that uses the AlertStatus interface
class Starship {
    private AlertStatus alertStatus = new GreenAlert(); // Default state

    // Method to change the alert status
    public void setAlertStatus(AlertStatus newStatus) {
        this.alertStatus = newStatus;
    }

    // Method to perform the current alert action
    public void performAlert() {
        alertStatus.alert();
    }
}

// Main class to demonstrate the functionality
public class AlertSystemDemo {
    public static void main(String[] args) {
        Starship starship = new Starship();
        
        // Perform alert with the initial status
        starship.performAlert(); // Should print: Green Alert: All systems are functioning normally.

        // Change to Red Alert and perform
        starship.setAlertStatus(new RedAlert());
        starship.performAlert(); // Should print: Red Alert: All systems are at maximum readiness!

        // Change to Yellow Alert and perform
        starship.setAlertStatus(new YellowAlert());
        starship.performAlert(); // Should print: Yellow Alert: Caution, stay alert!
    }
}

