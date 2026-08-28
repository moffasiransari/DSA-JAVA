package Algorithms;

import java.util.Arrays;

public class z2_sort_bubble {
    public static void main(String[] args) {
        int arr [] = {5,1,3,4,2,8,5,6,0,9,7,10,15,13,12,14,};
        int noSwapCount =0;
        int steps = 0;
        for (int i = 0; i < arr.length-1;i++) {
            noSwapCount =0;
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j]>arr[j+1]) {//
                    //swap
                    int temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1] = temp;
                }else noSwapCount++;
                steps++;
            }
            if (noSwapCount==arr.length-1) break;
        }System.out.println(Arrays.toString(arr)+"\n"+steps);
    }
}
