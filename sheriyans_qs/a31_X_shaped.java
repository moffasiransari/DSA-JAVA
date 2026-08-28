package sheriyans_qs;
import java.util.Scanner;

public class a31_X_shaped {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
    //first part v 
        int n2 = n/2+1; 
        //value of n-dash
        int ndash = 2*n2-3;
        for (int i = 1; i <= n2; i++) {//i represents line num    
            //outer spaces
            for (int j = 0; j < i-1; j++) {
                System.out.print(" ");
            }//1st star
            System.out.print("*");
            //iner spaces
            for (int j = 0; j <ndash ; j++) {
                System.out.print(" ");
            }//updating n dash value
            ndash -=2;
            //printing 2nd star
            if (i!=n2) {
                System.out.print("*");
            }System.out.println("");
        }
    //2nd part= inverted v without first star (modified)
        int n3 = n-n2;
        int ndash2 =1;
        for (int i = 1; i <= n3; i++) {
            //left spaces
            for (int j = 0; j < n3-i; j++) {
                System.out.print(" ");
            }//first star
            System.out.print("*");
            //inner spaces
            for (int j=0; j <ndash2; j++) {
                System.out.print(" ");
            }ndash2=ndash2+2;//makes it odd
            //2nd star
            System.out.print("*");
            System.out.println("");
            // System.out.println(ndash2);
        }
    }
}
