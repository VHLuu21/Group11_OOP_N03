
    public class VarargExample {

        // Method that accepts varargs
        public static void printStrings(String... strings) {
            for (String str : strings) {
                System.out.println(str);
            }
        }
    
        public static void main(String[] args) {
            // Passing comma-separated Strings
            printStrings("Hello", "World", "Java");
    
            // Passing an array of Strings
            String[] stringArray = {"Array", "of", "Strings"};
            printStrings(stringArray);
        }
    }
    
    