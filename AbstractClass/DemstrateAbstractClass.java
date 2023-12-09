package AbstractClass;

abstract class Parent_234{
    static void goi(){
        System.out.println();
    }
    public static void hi(){
        System.out.println("Hi");
        goi();
    }
}
public class DemstrateAbstractClass extends Parent_234{
    public static void main(String[] args) {
        DemstrateAbstractClass a = new DemstrateAbstractClass();
        a.main2();
    }
    public void main2() {
        super.hi();
    }
}