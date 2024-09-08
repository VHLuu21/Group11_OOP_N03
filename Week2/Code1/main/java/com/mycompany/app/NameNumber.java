package Week2.Code1.main.java.com.mycompany.app;


public class NameNumber {
    private String name;
    private int number;

    // Constructor
    public NameNumber(String name, int number) {
        this.name = name;
        this.number = number;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "NameNumber [name=" + name + ", number=" + number + "]";
    }
}
