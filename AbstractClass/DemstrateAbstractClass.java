package AbstractClass;

abstract class MainAbs{
    public abstract void abs1();   // Abstract method
    public abstract void abs2();
    public static void hi(){
        System.out.println("Hi");
    }
}

abstract class SubAbs1 extends MainAbs{
    public void abs1(){
        System.out.println("This happened in SubAbs1...");
    }
} 

class SubAbs2 extends SubAbs1{
    public void abs2(){
        System.out.println("This happened in SubAbs2...");
    }
}
public class DemstrateAbstractClass{
    public static void main(String[] args) {
        MainAbs a = new SubAbs2(); // cannot instance the abstract class 
                                        // unless all abstract methods are defined.
        a.hi();
        a.abs1();
        a.abs2();
    }
}