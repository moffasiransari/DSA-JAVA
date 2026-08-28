package sheriyans_qs;
import java.util.Scanner;

public class a31_Vshaped_star {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // value of n-dash
        int ndash = 2 * n - 3;
        // old method
        /*
         * for (int i = 1; i <= n; i++) {//i represents line num
         * //outer spaces
         * for (int j = 0; j < i-1; j++) {
         * System.out.print(" ");
         * }//1st star
         * System.out.print("*");
         * //iner spaces
         * for (int j = 0; j <ndash ; j++) {
         * System.out.print(" ");
         * }//updating n dash value
         * ndash -=2;
         * //printing 2nd star
         * if (i!=n) {
         * System.out.print("*");
         * }System.out.println("");
         * }
         */

        // easy method
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < 2 * n; j++) {
                if (j == i || j == 2 * n - i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }
}
