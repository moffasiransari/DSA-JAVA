package sheriyans_qs;

import java.util.Scanner;

public class a4_sumOfNo {
    public static void main(String[] args) {
        //printing sum of n natural no.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        //direct formula
        /* int sum = n*(n+1)/2;
        System.out.println(sum); */
        int sum =0;
        for (int i = 1; i<=n;i++ ){
            sum+=i;
        }
        System.out.println(sum);
    }
}
