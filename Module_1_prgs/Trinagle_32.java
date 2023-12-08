package Module_1_prgs;

public class Trinagle_32 {
    public static void main(String[] args) {
        int i,j,k;
        int n  = 6;
        for ( i = 1; i <= n; i++) {
            // Print spaces for alignment
            for ( j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            // Print numbers for the pattern
            for ( k = 1; k <= 2 * i - 1; k++) {
                System.out.print(i);
            }

            // Move to the next line after completing each row
            System.out.println();
        }
    }
}
