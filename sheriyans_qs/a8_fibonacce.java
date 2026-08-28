package sheriyans_qs;
import java.util.Scanner;

public class a8_fibonacce {
    public static void main(String[] args) {
        /* fibonacce series-> starts with 0 and 1 and every next no. is sum of previous 2 */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        int last = 1;
        int scndLast = 0;
        
        for (int i = 1; i <=(n-2); i++) {
            if (i==1) {
            System.out.print("0 1 ");
            }
            System.out.print((last+scndLast)+" ");
            last +=scndLast;
            scndLast = last-scndLast; //get initital value of last 
            
        }if (n<=0){ 
                System.out.println();
        }else if (n==1){
            System.out.print("0 ");
        }
        else if (n==2){//n==2
            System.out.print("0 1 ");
        }
    }
}
