package sheriyans_qs;
import java.util.Scanner;

public class a21_abundantNum {
    public static void main(String[] args) {
        /* Abundant no. -> no. whose sum of proper(excld no.itself) diviser is greater than no. itself 
        eg:12*/
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        int sumFactors=0;
        String isAbundant = "No";

        for (int i = 1; i < n; i++) {//exclding the no. itself as factor
            if (n%i==0) {
                sumFactors+=i;
            }
        }if (sumFactors>n) {
            isAbundant ="Yes";
        }System.out.println(isAbundant);
    }
}
