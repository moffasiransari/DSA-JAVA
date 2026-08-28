package sheriyans_qs;
import java.util.Scanner;

public class a0_AreaTrng {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        double s = (a + b + (double)c)/2;
        double area = Math.sqrt(s*(s-(double)a)*(s-(double)b)*(s-(double)c));
        System.out.printf("%.2f",area);
    }
}
