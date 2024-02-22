package ExceptionHandeling;

class InvalidAgeException extends Exception{
    InvalidAgeException(String s){
        super(s);
    }
}

class TestAgeException{
    void Validate(int age) throws InvalidAgeException{
        if(age<18){
            throw new InvalidAgeException("Invalid Age Exception");
        }
        else{
            System.out.println("Welcome !");
        }
    }
}
public class CustomException {
    public static void main(String[] args) {
        TestAgeException T1 = new TestAgeException();
        try{
            T1.Validate(14);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}