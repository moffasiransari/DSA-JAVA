package sheriyans_qs;

import java.util.Scanner;

public class a2_elextric_bill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int units = sc.nextInt();
        double rate;
        double finaAmnt = 0;
        if (units <= 100) {
            rate = 4.2;
            finaAmnt = (double) units * rate;
        } else if (units <= 200) {
            rate = 6;
            finaAmnt = 420.0 + (double) (units - 100) * rate;
        } else if (units <= 400) {
            rate = 8;
            finaAmnt = 420.0 + 600.0 + (double) (units - 200) * rate;
        } else {
            rate = 13;
            finaAmnt = 420.0 + 600.0 + 1600.0 + (double) (units - 400) * rate;
        }
        System.out.printf("%.1f", finaAmnt);
    }
}
