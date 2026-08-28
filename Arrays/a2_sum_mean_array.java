package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class a2_sum_mean_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int arr [] = {sc.nextInt()} ;
        System.out.println("enter size of array ");
        int arr[] = new int[sc.nextInt()] ;
         //taking elements input
         System.out.println("enter elements separated by one space or enter");
         for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
         }

        int sum =0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        System.out.println("Sum: "+sum);
        System.out.println("Mean: "+String.format("%.1f",((double)sum/arr.length) ));
        // System.out.printf("%.1f",sum/arr.length);
        // System.out.println(Arrays.toString(arr));
    }
}
