package sheriyans_qs;
import java.util.Scanner;

public class a23_ISBNnum {
    public static void main(String[] args) {
        /*
         * An ISBN-10 (International Standard Book Number) consists of 10
         * digits.
         * Rules: . Multiply each digit of the ISBN-10 by its position value (1 for the
         * first digit, 2 for the second
         * digit, and so on, up to 10 for the last digit). Sum these products. .
         * If the total sum is divisible by 11, the ISBN-10 is considered valid.
         * Otherwise, it is invalid.
         */
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int sum = 0;
        String isValid = "No";
        if (String.valueOf(n).length() == 10) {
            for (int i = 10; i > 0; i--) {// mulitplying from end
                sum += (n % 10 * i);
                n /= 10;
            }
        }
        if (sum % 11==0 &&sum!=0) {
            isValid = "Yes";
        }
        System.out.println(isValid);

    }
}
