package Week2.Code2.main.java.mycompany.app.Reusing_Classes_ex6;

//: reusing/Chess.java
// Inheritance, constructors and arguments.
//import static net.mindview.util.Print.*;
class Game {
        Game(int i) {
            System.out.println("Game constructor");
        }
}
    
class BoardGame extends Game {
        BoardGame(int i) {
            super(i);
            System.out.println("BoardGame constructor");
        }
}

public class Chess extends BoardGame {

        Chess() {
            super(11);
            System.out.println("Chess constructor");
        }

@SuppressWarnings("unused")
public static void main(String[] args) {
    Chess x = new Chess();
}
}
/* Output:
Game constructor
BoardGame constructor
Chess constructor
*/