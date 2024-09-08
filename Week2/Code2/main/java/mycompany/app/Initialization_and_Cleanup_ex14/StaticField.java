
public class StaticField {
    //Trường string tĩnh được khởi tạo tại điẻm định nghĩa
    private static final String DEFINITION = "Initializaed at definition";
    //Trường string tĩnh được tạo trong khối tĩnh 
    private static String STATICBLOCK;
    
    //Khối tạo để tạo trường tĩnh
    static{
        STATICBLOCK = "Initialized in static block";
    }
    //Phương thức tĩnh để in cả 2 trường tĩnh
    public static void PrintField(){
        System.out.println("Field initialized at definition: "+ DEFINITION);
        System.out.println("Field intialized in static block: "+ STATICBLOCK);
    }

    public static void main(String[] args){
        PrintField();
    }
}
