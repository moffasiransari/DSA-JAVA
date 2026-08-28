package sheriyans_qs;
import java.util.Scanner;

public class a27_letter_triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <=n &&n>=1&&n<=26; i++) {
            for (int j = 65; j < i+65; j++) {
                
                System.out.print((char)j+" ");
            }
            System.out.println("");
        }   
    }
}
