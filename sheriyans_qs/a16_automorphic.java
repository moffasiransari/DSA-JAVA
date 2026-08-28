package sheriyans_qs;
import java.util.Scanner;

public class a16_automorphic {
    public static void main(String[] args) {
        /* Automorphic no. -> no. whose squre ends with the no. itself 
        eg: 25-->625 true ends with 25 */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        int sqrt = n*n;
        String isAutomorphic ="No";
        //method 1 direct
        /* if (String.valueOf(sqrt).endsWith(String.valueOf(n))) {
            isAutomorphic ="Yes";
        }
        System.out.println(isAutomorphic); */

        //method 2 matchematical

        while (n>0) {
          if (n%10==sqrt%10) {
            n/=10;
            sqrt/=10;
          } else {
            break;
          }
            
        }if (n==0) {
            isAutomorphic="Yes";
        }
        System.out.println(isAutomorphic);
    }
}
