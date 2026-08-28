package sheriyans_qs;
import java.util.Scanner;

public class a18_harshad_niven_no {
    public static void main(String[] args) {
        /*Harshad(Niven) no.-> no. which is divisible by the sum of it's digit eg:18 */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        int nOld=n;
        int sum = 0;
        String isHarshad = "No";
        while (n>0) {
            sum+=(n%10);
            n/=10;
        }if (nOld==0||nOld%sum==0) {
            isHarshad="Yes";
        } System.out.println(isHarshad);
    }
}
