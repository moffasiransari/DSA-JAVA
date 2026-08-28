package sheriyans_qs;

import java.util.Scanner;

public class a5_factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        int factorial =1;

        if (n==0) {
            System.out.println(factorial);
        } else {
            for (int i = 0; i < (n); i++) {
            factorial *= (n-i); 
            }System.out.println(factorial);    
        }
        
    }
}
