package sheriyans_qs;
import java.util.Scanner;

public class a17_hcf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); 
        int b = sc.nextInt(); 
        int bigInt = Math.max(a, b);
        int hcf = 1; //for co-primes
        for (int i = bigInt; i >0; i--) {
            if (a%i==0 && b%i==0) {
                //the moment the first no. comes here we'll exit ->HCF
                hcf = i;
                break;
            }
        }System.out.println(hcf);

    }
}
