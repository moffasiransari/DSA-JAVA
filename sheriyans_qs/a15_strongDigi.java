package sheriyans_qs;
import java.util.Scanner;

public class a15_strongDigi {
    public static boolean main(String[] args) {
        /* Strong no.->no. whose sum of (factorial of digits)==no. itself 
        0 is not as 0!=1 */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        int n2 = n;
        int sumFactorial = 0;
        String isStrong = "No";
        while (n>0) {
            int lastDigit = n%10;
            int factorial = 1;
            for (int i = 1; i <= lastDigit; i++) {
                    factorial*=(i);
                }        
            sumFactorial+=factorial;
            n/=10;
        }
        if (n2==0) {
            isStrong ="No";
        } else if (sumFactorial==n2) {
            isStrong ="Yes";
        }
        System.out.println(isStrong);
        if (isStrong=="No") return false; return true;
    }
}
