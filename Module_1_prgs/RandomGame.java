package Module_1_prgs;
import java.util.Random;
import java.util.Scanner;

/**
 * Write a program that generates a
random number and asks the user to
guess what the number is. If the user’s
guess is higher than the random
number, the program should display
”Too high, try again.” If the user’s
guess is lower than the random number,
the program should display ”Too low,
try again.” The program should use a
loop that repeats until the user
correctly guesses the random number.
 */
public class RandomGame {
   public static void main(String[] args) {
        Random random = new Random();
        int randomNuber = random.nextInt(100); 
        Scanner Sc = new Scanner(System.in);
        int myNum ;
        int Count=0;
        while(true){
            System.out.print("Enter between 0 - 100: ");
            myNum = Sc.nextInt();
            Count++;
            if (myNum>randomNuber) {
                System.out.println("Too High, try again !");
            }
            else if(myNum<randomNuber){
                System.out.println("Too low, try again !");
            }
            else{
                System.out.println("You won! no of attempts: "+Count);
                break;
            }
        }
   }
}
