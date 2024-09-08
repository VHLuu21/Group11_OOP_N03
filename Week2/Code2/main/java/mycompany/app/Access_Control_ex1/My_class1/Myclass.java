package Week2.Code2.main.java.mycompany.app.Access_Control_ex1.My_class1;


public class Myclass {
    private String message;

    public Myclass(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String toString() {
        return "Myclass [message = " + message + "]";
    }
}
