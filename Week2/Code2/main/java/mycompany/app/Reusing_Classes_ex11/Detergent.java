package Week2.Code2.main.java.mycompany.app.Reusing_Classes_ex11;

public class Detergent {
    private Scrubber scrubber = new Scrubber();

    public void scrub() {
        scrubber.scrub(); // Delegate the scrub action to Scrubber
    }
}

