package ExceptionHandeling;

import java.io.IOException;

public class ThrowsKeyWord {
    static void method_1() throws IOException{
        throw new IOException("Exception occured");
    }

    static void d() {
        try{
            method_1();
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            System.out.println("End");
        }
    }

    public static void main(String[] args) {
        d();
    }
}