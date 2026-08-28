package sheriyans_qs;
import java.util.Scanner;

public class a0_CompInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double p = sc.nextDouble();
        double r = sc.nextDouble();
        int t = sc.nextInt();
        int n = sc.nextInt();
        double amnt= p*(Math.pow(((double)1 + (r/n)), (double)(n*t)));
        double ci = amnt - p;  
        String rouded_ci =String.format("%.2f", ci);
        System.out.println(rouded_ci);
        
        //Manual rounding off to 2 decimal digit
        /* // double cl = 3.996;
        int ciInteg = (int)cl;
        double ciDecimal = cl - (double) ((int) (cl));

        String ciDecStr = Double.toString(ciDecimal);

        System.out.println(cl);
        if (Character.getNumericValue(ciDecStr.charAt(4)) < 5) {
            String ciNewDecStr = "." + ciDecStr.charAt(2) + ciDecStr.charAt(3);
            String ciNewValue = ciInteg + ciNewDecStr;
            System.out.println(ciNewValue); 
        }else{
            if (Character.getNumericValue(ciDecStr.charAt(3)) != 9){
                String ciNewDecStr = "." + ciDecStr.charAt(2) + (Character.getNumericValue(ciDecStr.charAt(3))+1);
                String ciNewValue = ciInteg + ciNewDecStr;
                System.out.println(ciNewValue);
            }else{
                if (Character.getNumericValue(ciDecStr.charAt(2)) != 9){
                String ciNewDecStr = "." + (Character.getNumericValue(ciDecStr.charAt(2))+1)+"0";
                String ciNewValue = ciInteg + ciNewDecStr;
                System.out.println(ciNewValue);
                }else{
                    int ciNewValue  = ciInteg +1;
                    System.out.println(ciNewValue+".00");
                }
            }
        } */
    }
}
