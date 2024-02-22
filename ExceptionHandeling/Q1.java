package ExceptionHandeling;
// Define an exception called
// “NotEqualException” that is thrown
// when a float value is not equal to 3.14.
// Write a program that uses the above

class NotEqualException extends Exception{
    NotEqualException(String s){
        super(s);
    }
}
class TestEqualException{
    void isEqual(float f) throws NotEqualException{
        if(f!=3.14f){
            throw new NotEqualException("The value not equal to the 3.14 ");
        }
        else{
            System.out.println("Equal");
        }
    }
}
public class Q1 {
    public static void main(String[] args) {
        TestEqualException t1 = new TestEqualException();
        try{
            t1.isEqual(3.14f);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
