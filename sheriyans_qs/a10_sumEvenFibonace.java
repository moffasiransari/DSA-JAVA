package sheriyans_qs;
import java.util.Scanner;

public class a10_sumEvenFibonace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        int last = 1;
        int scndLast = 0;
        int index =1;/* as the series will start with default values 0 1
        which are also the 0th and 1st index thus it will start from 1st index */
        int evenSum = 0;
        if (n==0) {
            System.out.println(0);
        }else if (n==1){ 
            System.out.println(1);;
        }else if (n>1) {
            for (int i = 1; i <(2*n); i++) {
                index +=1;
                last +=scndLast;//value at index+=1 th index
                // System.out.println("index"+index+"\n"+last);
                scndLast = last-scndLast; //value at index+=1-1 th index
                if (index%2==0) {
                    evenSum+=last;
                    // System.out.println("sum"+evenSum);
                }
            }System.out.println(evenSum);  
        } else {//negetive input
            System.out.println("Invalid input");
        }
        
        
    }
}
