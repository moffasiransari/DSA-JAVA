package sheriyans_qs;
import java.util.Scanner;

public class a29_mirror_right_tri_star {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        int lineNum =0;
        //total sapces required to make star patterns on nth line of n lined triangle
        // = 2n-linum-i as each star has one space attached with it thus i=space attached to star(0->n-1) 
        int n2 = 2*n-1;
        for (int i = 0; i < n; i++) {
            lineNum+=1;
            for (int j = 0; j < n2-lineNum-i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < lineNum; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        
                
            
        
    }
}
