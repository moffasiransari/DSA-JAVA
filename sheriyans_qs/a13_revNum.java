package sheriyans_qs;
import java.util.Scanner;

public class a13_revNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        int runOnce = 1;
        while (n>0) {
            //removing ending 0s so that 1200->21 not 0021    
            while (runOnce==1&&n%10==0) {
                n/=10;
            }runOnce=0;
            System.out.print(n%10);
            n/=10;
        }

    }
}
