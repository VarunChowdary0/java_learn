package AbstractClass;

abstract class MobilePhone{
    public abstract void screen();
    public abstract void touch();
    public abstract void calling();
    public abstract void more();
}

abstract class Gen1 extends MobilePhone{
    public void screen(){
        System.out.println("Gen1 - screen");
    }
}

abstract class Gen2 extends Gen1{
    public void touch(){
        System.out.println("Gen2 - touch");
    }
}

abstract class Gen3 extends Gen2 {
    public void calling(){
        System.out.println("Gen3 - calling");
    }
}

class Gen4 extends Gen3{  // Latest version should not be an abstract 
                         // all required methods are implemented.
    public void more(){
        System.out.println("Gen4 - Addition features");
    }
}

public class AbsEx2 {
    public static void main(String[] args) {
        MobilePhone M = new Gen4();
        M.screen();
        M.touch();
        M.calling();
        M.more();
    }
}
