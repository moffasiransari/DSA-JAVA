package sheriyans_qs;
import java.util.Scanner;

public class a22_neonNum {
    public static void main(String[] args) {
        /* Neon no. -> where sum of digits of the square of the no. is no. itself*/
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        int square = n*n;
        int sumSquareDigits = 0;
        String isNeon = "No";

        while (square>0) {
            sumSquareDigits+=(square%10);
            square/=10;
        }if (sumSquareDigits == n) {//auto handles n==0
            isNeon = "Yes";
        }System.out.println(isNeon);
    }
}
