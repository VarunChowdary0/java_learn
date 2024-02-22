package garbageCollection;

public class GrabageCollector {
    public void somefunction(){
        System.out.println("Hi This is a method !");
    }
    public static void main(String[] args) {
        GrabageCollector G1 = new GrabageCollector();
        GrabageCollector G2 = new GrabageCollector();
        GrabageCollector G3 = new GrabageCollector();
        G2 = null;
        G3 = null;
        G1.somefunction();
        System.gc();
        /*
         * Here G2 and G3 objects are destroyed / removed from heap memory.
         */
    }
}
