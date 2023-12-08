package ConstructorsInJava;

import java.util.Scanner;

public class ParameterizedConstructor {
    String name;
    int age;  // Must be declared above as instance variables ;
    ParameterizedConstructor(String N,int a){
        name = N;
        age = a;  // And again assaign;
        System.out.println("Constructed");
    }
    public void display(){
        System.out.println("My name is "+name+", and I'm "+age+" years old !");
    }

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Name: ");
        String name = Sc.nextLine();
        System.out.print("Age: ");
        int age = Sc.nextInt();

        ParameterizedConstructor PC = new ParameterizedConstructor(name, age);
        // Constructor is activated when object is created and provides data to class ;
        PC.display();
    }
}
