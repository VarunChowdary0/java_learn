package Module_1_prgs;
/**
 * Write a program to read two numbers
through the keyboard and find the value
of one number raised to the power of
another. (Do not use Java built-in
method)

 */

import java.util.Scanner;

public class Power__ {
   public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int a = Sc.nextInt();
        int b = Sc.nextInt();
        int powOfA = 1;
        int powOfB = 1;
        int temp = b;
        while(temp>0){
            powOfA = powOfA * a;
            temp--;
        }
        temp = a;
        while (temp>0) {
            powOfB = powOfB * b;
            temp--;
        }
        System.out.println(powOfA+" , "+powOfB);
   }
}
