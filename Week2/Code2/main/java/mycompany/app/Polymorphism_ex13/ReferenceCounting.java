package Week2.Code2.main.java.mycompany.app.Polymorphism_ex13;

//: polymorphism/ReferenceCounting.java
// Cleaning up shared member objects.

class Shared {
    private int refcount = 0;
    private static long counter = 0;
    private final long id = counter++;
    
    public Shared() {
        System.out.println("Creating " + this);
    }
    
    public void addRef() { 
        refcount++; 
    }
    
    protected void dispose() {
        if (--refcount == 0) {
            System.out.println("Disposing " + this);
        }
    }
    
    @Override
    public String toString() { 
        return "Shared " + id; 
    }
    @SuppressWarnings("removal")
    @Override
    protected void finalize() throws Throwable {
        try {
            System.out.println("Finalizing " + this);
            dispose(); // Make sure resources are released
        } finally {
            super.finalize(); // Always call the superclass's finalize method
        }
    }
}

class Composing {
    private Shared shared;
    private static long counter = 0;
    private final long id = counter++;
    
    public Composing(Shared shared) {
        System.out.println("Creating " + this);
        this.shared = shared;
        this.shared.addRef();
    }
    
    protected void dispose() {
        System.out.println("Disposing " + this);
        shared.dispose();
    }
    
    @Override
    public String toString() { 
        return "Composing " + id; 
    }
    
    @SuppressWarnings("removal")
    @Override
    protected void finalize() throws Throwable {
        try {
            System.out.println("Finalizing " + this);
            dispose(); // Make sure resources are released
        } finally {
            super.finalize(); // Always call the superclass's finalize method
        }
    }
}

public class ReferenceCounting {
    public static void main(String[] args) {
        Shared shared = new Shared();
        Composing[] composing = {
            new Composing(shared),
            new Composing(shared),
            new Composing(shared),
            new Composing(shared),
            new Composing(shared)
        };
        for (Composing c : composing) {
            c.dispose();
        }
        // Suggest garbage collection to see finalize in action
        System.gc();
        // Give some time for GC to run
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

