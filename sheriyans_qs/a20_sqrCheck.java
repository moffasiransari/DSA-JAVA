package sheriyans_qs;
import java.util.Scanner;

public class a20_sqrCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        int sqrt= (int)Math.sqrt(n);
        if (n==sqrt*sqrt) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
