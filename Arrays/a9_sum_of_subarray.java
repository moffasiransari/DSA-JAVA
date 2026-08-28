package Arrays;

import java.util.Arrays;

public class a9_sum_of_subarray {
    public static void main(String[] args) {
        int arr [] = {3,2,4,5,2,7} ;
        int arr2[] = new int[arr.length] ;
        int target = 9; 
        
        /* //1.sub arrays whose sum is ==target
        int sum = 0;
        for (int i = 0; i < arr2.length; i++) {
            arr2[0]= arr[i];
            sum=0;
            sum+= arr2[0];
            int  k = i;
            for (int j = 1; j < arr2.length &&k<arr2.length-1; j++,k++) {
               arr2[j]= arr[k+1];
               k++; 
               sum+= arr2[j];
               if (sum>=target) {
                System.out.println(Arrays.toString(arr2));
                break;
               }
            }
        } */

        //2.No. of sub arrays whose sum is ==target
        int sum2 = 0;
        int count = 0;
        for (int i = 0; i < arr2.length; i++) {
            sum2=0;
            for (int j = i; j < arr2.length ; j++) {
               sum2+= arr[j];
               if (sum2==target) {
                count++;
                break;
               }
            }
        }System.out.println(count);

    } 
}
