package Week4.code1.main.java.com.mycompany.app;

abstract class Actor {
    abstract void act();
}

class HappyActor extends Actor {
    public void act() {
        System.out.println("HappyActor is acting.");
    }
}

class SadActor extends Actor {
    public void act() {
        System.out.println("SadActor is acting.");
    }
}

class Stage {
    Actor a = new HappyActor();
    
    void change() { 
        a = new SadActor(); 
    }
    
    void go() { 
        a.act(); 
    }
}

