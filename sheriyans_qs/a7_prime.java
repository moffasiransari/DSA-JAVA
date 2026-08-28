package sheriyans_qs;
import java.util.Scanner;

public class a7_prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        String status = "unkown";
        for (int i = 2; i < n; i++) {
            if (n%i==0 ) {
                status = "Not Prime";
                break;
            }else {
                status = "Prime"; 
            }
        }switch (n){
            case 1,0 -> status="Not Prime";
            case 2 -> status="Prime"; 
        }
        System.out.println(status);
    }
}
