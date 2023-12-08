package Module_1_prgs;

public class Fiboonacci100 {
    public static void main(String[] args) {
        long a = 0;
        long b = 1;
        long c;
        int n = 100;
        while(n>0){
            System.out.print(a+"\t");
            c = a+b;
            a = b;
            b = c;
            n--;
        }
    }
}
