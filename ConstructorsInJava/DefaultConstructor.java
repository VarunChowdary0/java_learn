package ConstructorsInJava;

public class DefaultConstructor {
    DefaultConstructor(){
        System.out.println("This is an non-parameterized Default Constructor");
    }
    
    public static void main(String[] args) {
        DefaultConstructor DC = new DefaultConstructor();
        //  when object is created its constructor is called .
    }
}
