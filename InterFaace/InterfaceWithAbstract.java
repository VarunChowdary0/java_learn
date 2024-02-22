package InterFaace;

import java.util.Scanner;

/*
 * Building a calculator using interface and abstact class;
 * -> Addition;
 * -> Subrction;
 * -> Mutiplication;
 * -> Division;
 * -> Reminder;
 */
interface Calculator{
    public void Addition(int a,int b);
    public void Subrction(int a,int b);
    public void Mutiplication(int a,int b);
    public void Division(int a,int b);
    public void Reminder(int a,int b);
}
abstract class AbstactImpelmenter implements Calculator{
    public void Addition(int a,int b){
        System.out.println("Addition: "+(a+b));
    }
}
abstract class AbsExtender1 extends AbstactImpelmenter{
    public void Subrction(int a,int b){
        System.out.println("Subraction: "+(a-b));
    }
}
abstract class AbsExtender2 extends AbsExtender1{
    public void Mutiplication(int a,int b){
        System.out.println("Multiplication: "+(a*b));
    }
}
abstract class AbsExtender3 extends AbsExtender2{
    public void Division(int a,int b){
        double res=0;
        try{
            res = (double)a/b;
        }
        catch(Exception e){
            res = 0;
        }
        finally{
            System.out.println("Division: "+res);
        }
    }
}
class AbsExtender4 extends AbsExtender3{
    public void Reminder(int a,int b){
        System.out.println("Reminder :"+(a%b));
    }
}
public final class InterfaceWithAbstract {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        AbstactImpelmenter cal = new AbsExtender4();
        int a,b;
        int choice;
        boolean next = true;
        System.out.println("1 -> Addition \n2 -> Subraction \n 3 -> Multiplication \n 4 -> Division \n 5 -> Remider\n");
        while (next) {
            System.out.print("Enter a and b: ");
            a=Sc.nextInt();
            b=Sc.nextInt();
            System.out.print("Enter Operation: ");
            choice = Sc.nextInt();
            switch (choice) {
                case 1:
                    cal.Addition(a, b);
                    break;
                case 2:
                    cal.Subrction(a, b);
                    break;
                case 3:
                    cal.Mutiplication(a, b);
                    break;
                case 4:
                    cal.Division(a, b);
                    break;
                case 5:
                    cal.Reminder(a, b);
                default:
                    next = false;
                    break;
            }
        }

    }
}
