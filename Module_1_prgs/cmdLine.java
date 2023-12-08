package Module_1_prgs;

public class cmdLine {
    public static void main(String[] args) {
        int[] arr = new int[5];
        int i;
        int sum = 0;
        double avg ; 
        for(i=0;i<5;i++){
            arr[i] = Integer.parseInt(args[i]);
            sum+=arr[i];
        }
        avg = sum/5.0;
        System.out.println("Sum: "+sum+", Average: "+avg);
    }
}
