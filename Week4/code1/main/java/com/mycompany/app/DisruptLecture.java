package Week4.code1.main.java.com.mycompany.app;

class CellPhone {
    CellPhone() {}
    public void ring(Tune t) {
        t.play();
    }
}

class Tune {
    public void play() {
        System.out.println("Tune.play()");
    }
}

class ObnoxiousTune extends Tune {
    ObnoxiousTune() {
    }
}

