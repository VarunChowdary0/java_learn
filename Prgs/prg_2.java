// array input sum , largest , avg ;

import java.util.Scanner;

public class prg_2 {
    public static void main(String[] args) {
        Scanner Sc  = new Scanner(System.in);
        int n;
        System.out.print("n: ");
        n = Sc.nextInt();
        int sum = 0;
        int[] MyArr = new int[n];
        int max = -999999;
        int temp;
        for(int i=0;i<n;i++){
            temp = Sc.nextInt();
            if(temp>max){
                max = temp;
            }
            MyArr[i] = temp;
            sum+=temp;
        }
        System.out.println("Sum: "+sum);
        System.out.println("Average : "+sum/(float)n);
        System.out.println("Max: "+max);
    }
}
