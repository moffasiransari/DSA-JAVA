package sheriyans_qs;
import java.util.Scanner;

public class a9_primefactor {
    public static void main(String[] args) {
        /* Every no. can be expressed as product of prime no.s */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        String primeFactors="";
        //making sure n is not 0 and 1 
        if (n==0||n==1) {
            primeFactors= "No prime factors";
        }else{
            for (int i = 2; i <=n &&n!=0;) {
            //checking the factors of n
                if (n%i==0) {
                    n=n/i; /*   divide the no. with factor than check for futher division just like 
                                normal penpaper method to get repetitive prime factors*/
                    String isprime = "n";
                    //checking is that factors(i) is a prime or not
                    for (int j = 1; j <= i; j++) {
                        if (i%j==0 && j!=1 && j!=i) {
                            break;
                        }else if (j==i &&j!=1){ 
                            isprime = "y"; 
                        }else continue;
                    }
                    if (isprime.equals("y")) {
                        primeFactors+=String.valueOf(i)+" ";
                    }
                }else i++; //i will increase only if the no. no longer is divisble by i
                //allow us to get repetitive prime factors
            }
        
        }System.out.println(primeFactors);

    }
}
