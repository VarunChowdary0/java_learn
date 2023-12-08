import java.util.Scanner;

public class Problem_1 {
    public static int MinMoves(int Target, int k){
        int res = 0;
        while (Target > 1 && k > 0) {
            res += 1+ Target % 2;
            k--;
            Target >>= 1;
        }
        return Target - 1 + res;
    }
    public static void main(String[] args) {
        int CurrentLevel = 1;
        int Dimonds;
        int TOpLevel;
        int Steps = 0;
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter Top Level : ");
        TOpLevel = Sc.nextInt();
        System.out.print("Enter No of Dimonds: ");
        Dimonds = Sc.nextInt();
        int NoOfStepsWithLevel = 1;
        while ((CurrentLevel<=TOpLevel) ) {
            if(Dimonds == 0){
                CurrentLevel++;
                Steps++;
                System.out.println("No Dimaonds Level+1 "+CurrentLevel);
            }
            else{
                Dimonds--;
                CurrentLevel=CurrentLevel*2;
                Steps++;
                System.out.println("-1 Dimond and Level*2 "+CurrentLevel);
            }
        }
        System.out.println("No of Steps: "+Steps+" Dimond Left "+Dimonds);
        System.out.println("Min Moves: "+MinMoves(TOpLevel, Steps));
    }    
}
