public class Fibbonaci_ {
    public static void main(String[] args) {
        int n = 100;
        long a=0;
        long b=1;
        long c;
        while (n>0) {
            System.out.print(a+"  ");
            c = a+b;
            a = b;
            b = c;
            n--;
        }
    }
}
