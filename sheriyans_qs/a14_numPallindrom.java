package sheriyans_qs;
import java.util.Scanner;

public class a14_numPallindrom {
    public static void main(String[] args) {
        /* palindrome ->no. which remains same even if is reversed */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuilder reverse = new StringBuilder("");

        if ((n % 10 != 0 || n == 0) && n >= 0) {//
            // 1230->last digit 0 ->never pallidrome
            int n2 = n;
            while (n > 0) {
                reverse.append(n % 10);
                n /= 10;
            }
            /* //method 2 generate reverse without using strbuilder
            int reverse = 0;
            while (n>0) {
                reverse = reverse*10 + (n/10);
                n/=10;
            } */
            if (n2 == 0 || Integer.parseInt(reverse.toString()) == n2) {
                //checking for zero first else ->numFormat exception
                // occur if n=0 and did parsing first->reverse has no digit
                System.out.println("Palindromic number");
            } else
                System.out.println("No Palindromic number");
        } else
            System.out.println("No Palindromic number");
       
    }
}
