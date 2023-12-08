package AccessControl;

public class PublicExample {
    private static void test(){
        System.out.println("Hello this is private can be used in this current class, not even in inheritance");
    }
    
    static void test1(){
        System.out.println("Hello this is default can be used as package private");
    }

    protected static void test3(){
        System.out.println("Hello this is protected can be used in current and inherited classes");
    }

    public static void main(String[] args) {
        test();
        test1();
        test3();
    }
}
