package Week2.Code2.main.java.mycompany.app.Polymorphism_ex8;

//: polymorphism/music3/Music3.java
// An extensible program.
import java.util.Random;
import Week2.Code2.main.java.mycompany.app.Polymorphism_ex6.Note;

class Instrument {
    void play(Note n) { System.out.println("Instrument.play() " + n); }
    @Override
    public String toString() { return "Instrument"; }
    void adjust() { System.out.println("Adjusting Instrument"); }
}

class Wind extends Instrument {
    void play(Note n) { System.out.println("Wind.play() " + n); }
    @Override
    public String toString() { return "Wind"; }
    void adjust() { System.out.println("Adjusting Wind"); }
}

class Percussion extends Instrument {
    void play(Note n) { System.out.println("Percussion.play() " + n); }
    @Override
    public String toString() { return "Percussion"; }
    void adjust() { System.out.println("Adjusting Percussion"); }
}

class Stringed extends Instrument {
    void play(Note n) { System.out.println("Stringed.play() " + n); }
    @Override
    public String toString() { return "Stringed"; }
    void adjust() { System.out.println("Adjusting Stringed"); }
}

class Brass extends Wind {
    void play(Note n) { System.out.println("Brass.play() " + n); }
    @Override
    public String toString() { return "Brass"; }
    void adjust() { System.out.println("Adjusting Brass"); }
}

class Woodwind extends Wind {
    void play(Note n) { System.out.println("Woodwind.play() " + n); }
    @Override
    public String toString() { return "Woodwind"; }
}

class Harp extends Stringed {
    void play(Note n) { System.out.println("Harp.play() " + n); }
    @Override
    public String toString() { return "Harp"; }
}

public class Music3 {
    private static final Random RAND = new Random();
    private static final Class<?>[] INSTRUMENT_TYPES = {
        Wind.class, Percussion.class, Stringed.class, Brass.class, Woodwind.class, Harp.class
    };
    private static final int ORCHESTRA_SIZE = 10; // Define the size of the orchestra

    public static void tune(Instrument i) {
        i.play(Note.MIDDLE_C);
    }

    public static void tuneAll(Instrument[] e) {
        for (Instrument i : e)
            tune(i);
    }

    public static void main(String[] args) {
        // Create a random orchestra
        Instrument[] orchestra = new Instrument[ORCHESTRA_SIZE];
        for (int i = 0; i < ORCHESTRA_SIZE; i++) {
            try {
                // Randomly select an Instrument class
                Class<?> instrumentClass = INSTRUMENT_TYPES[RAND.nextInt(INSTRUMENT_TYPES.length)];
                // Create a new instance of the selected class
                orchestra[i] = (Instrument) instrumentClass.getDeclaredConstructor().newInstance();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        tuneAll(orchestra);

        // Print each Instrument
        for (Instrument i : orchestra) {
            System.out.println(i); // This implicitly calls i.toString()
        }
    }
}

