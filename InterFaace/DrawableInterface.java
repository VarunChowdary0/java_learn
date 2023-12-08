package InterFaace;

interface draw{
    void shape();
    void resize();
}

class Square implements draw{
    public void shape(){
        System.out.println("This is square shape");
    }
    public void resize(){
        System.out.println("And Square resized");
    }
}

class Triangle implements draw{
    public void shape(){
        System.out.println("This is Triangle");
    }

    public void resize(){
        System.out.println("Trinagle Resized");
    }
}
public class DrawableInterface {
    public static void main(String[] args) {
        draw Sq = new Square();
        draw Tr = new Triangle();

        Sq.shape();;
        Tr.shape();

        Sq.resize();
        Tr.resize();
    }    
}

