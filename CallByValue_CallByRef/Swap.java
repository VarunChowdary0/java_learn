package CallByValue_CallByRef;

public class Swap {
    public static void swap(int i,int j){
        int temp = i;
        i = j;
        j = temp;
        System.out.println("in swap method -> i = "+i+", j = "+j);
    }
    public static void main(String[] args) {
        int i = 10;
        int j = 20;
        swap(i,j);
        System.out.println("in main -> i = "+i+", j = "+j);
    }
}
