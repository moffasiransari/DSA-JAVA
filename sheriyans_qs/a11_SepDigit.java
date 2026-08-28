package sheriyans_qs;
import java.util.Scanner;

public class a11_SepDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        String nString = String.valueOf(n);
        int i = 1;
        /* while (i<=nString.length()) {
            System.out.println(nString.charAt(nString.length()-i));
            i++;
        } */
        //method 2 fast
        while (n>0) {
            //getting digits from last
            System.out.println(n%10);
            //reducing no. from last
            n/=10;
        }
    }
}
