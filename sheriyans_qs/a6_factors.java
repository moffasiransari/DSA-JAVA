package sheriyans_qs;

import java.util.Scanner;

public class a6_factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
       
        for (int i = 1; i < n; i++) {
            if (n%i==0) {
                System.err.print(i+" ");//no new line
            }
            else continue;
        }System.out.print(n);
        sc.close();
    }
}
