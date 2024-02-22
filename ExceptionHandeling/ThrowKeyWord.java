package ExceptionHandeling;

public class ThrowKeyWord {
    static void validateAge(int age){
        if(age<18){
            throw new ArithmeticException("Under Aged");
            // throw keyword is used to explicitely throw an exception/custom-exception.
        }
        else{
            System.out.println("Welcome !");
        }
    }
    public static void main(String[] args) {
        validateAge(30);
        validateAge(3);
    }
}
