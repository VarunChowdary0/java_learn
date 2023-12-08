package Module_1_prgs;

import java.util.Scanner;

public class DOwhileQ {
    public static void main(String[] args) {
        int a,b;
        Scanner Sc = new Scanner(System.in);
        int sum = 0;
        String x;
        boolean next = true;
        do{
            System.out.print("Enter a and b: ");
            a = Sc.nextInt();
            b = Sc.nextInt();
            Sc.nextLine(); // clearing new line
            sum += a+b;
            System.out.println("Sum : "+sum);
            System.out.print("Continue ? Yes:y => ");
            x = Sc.nextLine();
            if (!x.equals("y")) {
                next = false;
            }
        }
        while(next);
    }
}
