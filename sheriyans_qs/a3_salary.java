package sheriyans_qs;

import java.util.Scanner;

public class a3_salary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String gender = sc.next(); 
        int experience = sc.nextInt(); 
        String qulification = sc.next(); 
        int salary;
        if (gender.equals("M")) {
            if (qulification.equals("P")) {
                if (experience<10) {
                    salary = 10000;
                } else {
                    salary = 15000;
                }
            } else {
               if (experience<10) {
                    salary = 7000;
                } else {
                    salary = 10000;
                } 
            }
        }else{
            if (qulification.equals("P")) {
                if (experience<10) {
                    salary = 10000;
                } else {
                    salary = 12000;
                }
            } else {
               if (experience<10) {
                    salary = 6000;
                } else {
                    salary = 9000;
                } 
            }
        }
        System.out.println(salary);
    }
}
