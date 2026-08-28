package Arrays;

import java.util.Scanner;

public class a1_max_min_unsorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] arr={-1,-4,-6,-2,-5,-8};
        int max =arr[0]; //now the loop will work even if the all no. are negative
        int min = arr[0];
        for (int i =1;i<arr.length;i++){
            if (arr[i]>max) max=arr[i];
            if (arr[i]<min) min=arr[i];
            
        }System.out.println("max "+max+" min "+ min);
        // System.out.println(arr[-1]);
    }
}
