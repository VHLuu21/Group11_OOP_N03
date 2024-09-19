package orchestra_ex;

public class Orchestra {
    static void tune(Instrument i) {
        i.play(Note.MIDDLE_C);
    }

    static void tuneAll(Instrument[] e) {
        for (Instrument i : e) {
            tune(i);
        }
    }

    public static void main(String[] args) {
        Instrument[] Orchestra = {
                new Wind(), new Percussion(), new Stringed(), new Stringed(), new Brass()
        };
        tuneAll(Orchestra);
    }

}
