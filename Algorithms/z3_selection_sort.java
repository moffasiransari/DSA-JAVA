package Algorithms;

import java.util.Arrays;

public class z3_selection_sort {
    public static void main(String[] args) {
        int arr [] = {5,1,3,4,2,8,5,6,0,9,7,10,15,13,12,14,} ;
        int j = 0;
        int steps = 0;

        for (int i = 0; i < arr.length-1; i++) {
            int min = i; //min index
            for ( j = i+1; j < arr.length; j++) {
                steps++;
                if (arr[j]<arr[min]) {
                    min = j;
                }
            }
            if (min!=i) {
                int temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }
        }System.out.println(Arrays.toString(arr)+"\n"+steps);
    }
}
