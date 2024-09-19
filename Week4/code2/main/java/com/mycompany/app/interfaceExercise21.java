
interface myInterface {
String getMessenge();

    static class myNested {
        static void display(myInterface instance){
            System.out.println("This is " + instance.getMessenge());
        }
    }
}

class myImplement implements myInterface {
        public String getMessenge (){
            return "Implements of interface";
        }
}

public class interfaceExercise21 {
    public static void main(String[] args){
        myImplement obj = new myImplement();
        myInterface.myNested.display(obj);
    }
}
