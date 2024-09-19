package orchestra_ex;

abstract class Instrument {
    @SuppressWarnings("unused")
    private int i;

    abstract void play(Note n);

    public String what() {
        return "Instrument";
    }

    public abstract void adjust();
}
